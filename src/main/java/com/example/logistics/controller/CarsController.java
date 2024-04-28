package com.example.logistics.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.logistics.entity.*;
import com.example.logistics.entity.vo.LocationPoint;
import com.example.logistics.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lonerW
 * @since 2024-04-25 15:41:16
 */
@RestController
@RequestMapping("/cars-entity")
@CrossOrigin
public class CarsController {
    @Autowired
    private BranchsService branchsService;

    @Autowired
    private AreasService areasService;

    @Autowired
    private CitysService citysService;

    @Autowired
    private ProvincesService provincesService;

    @Autowired
    private BaiduService baiduService;

    @Autowired
    private RecipientAddressService recipientAddressService;

    @Autowired
    private SendingAddressService sendingAddressService;

    @Autowired
    private OrderssService orderssService;

    /**
     * 根据网点id获取经纬度
     * @param id
     * @return locationPoint（经纬度）
     */

    public LocationPoint getPointByBranchId(Long id){

        BranchsEntity branchs = branchsService.getById(id);
        AreasEntity areas = areasService.getById(branchs.getAreaId());
        CitysEntity citys = citysService.getById(areas.getCityId());
        ProvincesEntity provincesEntity = provincesService.getById(citys.getProvinceId());
        String point = provincesEntity.getProvinceName() + citys.getCityName() + areas.getAreaName() + branchs.getBranchName();
        double d[] = baiduService.queryGeoByAddress(point);
        LocationPoint locationPoint = new LocationPoint();
        locationPoint.setLng(String.valueOf(d[0]));
        locationPoint.setLat(String.valueOf(d[1]));

        return locationPoint;
    }

    /**
     * 根据收件地址id获取经纬度
     * @param id
     * @return locationPoint（经纬度）
     */
    public LocationPoint getSendingAddress(Integer id){
        SendingAddressEntity sendingAddressEntity = sendingAddressService.getById(id);
        String address = sendingAddressEntity.getProvince()+sendingAddressEntity.getCity()+sendingAddressEntity.getArea()+sendingAddressEntity.getAddress();
        double[] doubles = baiduService.queryGeoByAddress(address);
        LocationPoint locationPoint = new LocationPoint();
        locationPoint.setLng(String.valueOf(doubles[0]));
        locationPoint.setLat(String.valueOf(doubles[1]));

        return locationPoint;
    }

    /**
     * 根据寄件地址id获取经纬度
     * @param id
     * @return locationPoint（经纬度）
     */
    public LocationPoint getRecipientAddress(Integer id) {
        RecipientAddressEntity recipientAddressEntity = recipientAddressService.getById(id);
        String address = recipientAddressEntity.getProvince() + recipientAddressEntity.getCity() + recipientAddressEntity.getArea() + recipientAddressEntity.getAddress();
        double[] doubles = baiduService.queryGeoByAddress(address);
        LocationPoint locationPoint = new LocationPoint();
        locationPoint.setLng(String.valueOf(doubles[0]));
        locationPoint.setLat(String.valueOf(doubles[1]));

        return locationPoint;
    }

    /**
     * 通过订单id判断两个地址是否在同一个省
     * @param orderId
     * @return Integer(0:同一个区，1：同一个市，2：同一个省，3：不在同一个省)
     */
    public Integer isSame(Integer orderId){
        OrderssEntity orderssEntity = orderssService.getById(orderId);
        SendingAddressEntity sendingAddressEntity = sendingAddressService.getById(orderssEntity.getSendingAddressId());
        RecipientAddressEntity recipientAddressEntity = recipientAddressService.getById(orderssEntity.getRecipientAddressId());
        if(sendingAddressEntity.getProvince().equals(recipientAddressEntity.getProvince())){
            if(sendingAddressEntity.getCity().equals(recipientAddressEntity.getCity())){
                if(sendingAddressEntity.getArea().equals(recipientAddressEntity.getArea())){
                    return 0;
                }
                return 1;
            }
            return 2;
        }
        return 3;
    }

    /**
     * 根据订单id获取订单的路径
     * @param orderId
     * @return 路径经纬度
     */
    public String getOrderPath(Integer orderId){
        OrderssEntity orderssEntity = orderssService.getById(orderId);
        RecipientAddressEntity recipientAddressEntity = recipientAddressService.getById(orderssEntity.getRecipientAddressId());
        SendingAddressEntity sendingAddressEntity = sendingAddressService.getById(orderssEntity.getSendingAddressId());
        List<LocationPoint> list = new ArrayList<>();
        if (isSame(orderId) == 0){//同一个区
            return null;
        } else if (isSame(orderId) == 1) {//同一个市
            AreasEntity recepArea = areasService.getOne(new QueryWrapper<AreasEntity>().eq("areaName", recipientAddressEntity.getArea()));
            BranchsEntity recepBranch = branchsService.getOne(new QueryWrapper<BranchsEntity>().eq("areaId", recepArea.getAreaId()).eq("branchType", 1));//发往市站点
            list.add(getPointByBranchId(recepBranch.getBranchId()));
            BranchsEntity recepBranch1 = branchsService.getOne(new QueryWrapper<BranchsEntity>().eq("areaId", recepArea.getAreaId()).eq("branchType", 0));//发往区站点
            list.add(getPointByBranchId(recepBranch1.getBranchId()));
            String res = "";
            for (int i = 0; i < list.size(); i++) {
                if (i == list.size() - 1) {
                    res += list.get(i).getLng() + "," + list.get(i).getLat();
                } else {
                    res += list.get(i).getLng() + "," + list.get(i).getLat() + "|";
                }
            }
            return res;
        } else if (isSame(orderId) == 2) {
            AreasEntity recepArea = areasService.getOne(new QueryWrapper<AreasEntity>().eq("areaName", recipientAddressEntity.getArea()));
            BranchsEntity sendBranch = branchsService.getOne(new QueryWrapper<BranchsEntity>().eq("areaId", recepArea.getAreaId()).eq("branchType", 2));//发往省站点
            list.add(getPointByBranchId(sendBranch.getBranchId()));
            BranchsEntity sendBranch1 = branchsService.getOne(new QueryWrapper<BranchsEntity>().eq("areaId", recepArea.getAreaId()).eq("branchType", 1));//发往市站点
            list.add(getPointByBranchId(sendBranch1.getBranchId()));
            BranchsEntity sendBranch2 = branchsService.getOne(new QueryWrapper<BranchsEntity>().eq("areaId", recepArea.getAreaId()).eq("branchType", 0));//发往区站点
            list.add(getPointByBranchId(sendBranch2.getBranchId()));
            String res = "";
            for (int i = 0; i < list.size(); i++) {
                if (i == list.size() - 1) {
                    res += list.get(i).getLng() + "," + list.get(i).getLat();
                } else {
                    res += list.get(i).getLng() + "," + list.get(i).getLat() + "|";
                }
            }
            return res;
        }else {
            AreasEntity sendArea = areasService.getOne(new QueryWrapper<AreasEntity>().eq("areaName", sendingAddressEntity.getArea()));
            BranchsEntity sendBranch = branchsService.getOne(new QueryWrapper<BranchsEntity>().eq("areaId", sendArea.getAreaId()).eq("branchType", 2));//发往省站点
            list.add(getPointByBranchId(sendBranch.getBranchId()));
            AreasEntity recepArea = areasService.getOne(new QueryWrapper<AreasEntity>().eq("areaName", recipientAddressEntity.getArea()));
            BranchsEntity recepBranch = branchsService.getOne(new QueryWrapper<BranchsEntity>().eq("areaId", recepArea.getAreaId()).eq("branchType", 2));//发往省站点
            list.add(getPointByBranchId(recepBranch.getBranchId()));
            BranchsEntity sendBranch1 = branchsService.getOne(new QueryWrapper<BranchsEntity>().eq("areaId", recepArea.getAreaId()).eq("branchType", 1));//发往市站点
            list.add(getPointByBranchId(sendBranch1.getBranchId()));
            BranchsEntity sendBranch2 = branchsService.getOne(new QueryWrapper<BranchsEntity>().eq("areaId", recepArea.getAreaId()).eq("branchType", 0));//发往区站点
            list.add(getPointByBranchId(sendBranch2.getBranchId()));
            String res = "";
            for (int i = 0; i < list.size(); i++) {
                if (i == list.size() - 1) {
                    res += list.get(i).getLng() + "," + list.get(i).getLat();
                } else {
                    res += list.get(i).getLng() + "," + list.get(i).getLat() + "|";
                }
            }
            return res;
        }

    }








}

