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
 * @since 2024-04-24 23:24:42
 */
@RestController
@RequestMapping("/orders-entity")
@CrossOrigin
public class OrdersController {

    @Autowired
    private OrdersService ordersService;

    @Autowired
    private MailingaddService mailingaddService;

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

    /**
     * 根据网点id获取经纬度
     * @param id
     * @return locationPoint（经纬度）
     */

    public LocationPoint getPointByBranchId(Integer id){

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
     * 根据地址id获取经纬度
     * @param id
     * @return  locationPoint（经纬度）
     */
    public LocationPoint getPointByAddId(Integer id){

        MailingaddEntity mailingaddEntity = mailingaddService.getById(id);
        AreasEntity areas = areasService.getById(mailingaddEntity.getAreaId());
        CitysEntity citys = citysService.getById(areas.getCityId());
        ProvincesEntity provincesEntity = provincesService.getById(citys.getProvinceId());
        String point = provincesEntity.getProvinceName() + citys.getCityName() + areas.getAreaName() + mailingaddEntity.getMAddName();
        double d[] = baiduService.queryGeoByAddress(point);
        LocationPoint locationPoint = new LocationPoint();
        locationPoint.setLng(String.valueOf(d[0]));
        locationPoint.setLat(String.valueOf(d[1]));

        return locationPoint;
    }

    /**
     * 判断两个地址是否在同一个省
     * @param originAdd
     * @param destAdd
     * @return Integer(0:同一个区，1：同一个市，2：同一个省，3：不在同一个省)
     */
    public Integer isSame(Long originAdd,Long destAdd){
        Integer num = 3;
        MailingaddEntity origin = mailingaddService.getById(originAdd);
        MailingaddEntity dest = mailingaddService.getById(destAdd);
        AreasEntity originArea = areasService.getById(origin.getAreaId());
        AreasEntity destArea = areasService.getById(dest.getAreaId());
        if (originArea.getCityId().equals(destArea.getCityId())){
            num --;
        }
        CitysEntity originCity = citysService.getById(originArea.getCityId());
        CitysEntity destCity = citysService.getById(destArea.getCityId());
        if (originCity.getProvinceId().equals(destCity.getProvinceId())){
            num --;
        }
        ProvincesEntity originProvince = provincesService.getById(originCity.getProvinceId());
        ProvincesEntity destProvince = provincesService.getById(destCity.getProvinceId());
        if (originProvince.getProvinceId().equals(destProvince.getProvinceId())){
            num --;
        }
        return num;
    }

    /**
     * 根据订单id获取订单的路径
     * @param orderId
     * @return 路径经纬度
     */

    public String getApproachPoint(Integer orderId){
        OrdersEntity ordersEntity = ordersService.getById(orderId);
        List<LocationPoint> list =new ArrayList<>();
        if (isSame(ordersService.getById(orderId).getOriginAdd(),ordersService.getById(orderId).getDestAdd()) == 3){//不同省
            Long sentAdd = ordersEntity.getOriginAdd();
            Integer area = mailingaddService.getById(sentAdd).getAreaId();
            QueryWrapper<BranchsEntity> wrapper1 = new QueryWrapper<>();
            wrapper1.eq("areaId",area);
            wrapper1.eq("branchType",2);
            Long provinceBranch1 = branchsService.getOne(wrapper1).getBranchId();
            list.add(getPointByBranchId(provinceBranch1.intValue())); //发往省网点
            Long receiveAdd = ordersEntity.getDestAdd();
            Integer area1 = mailingaddService.getById(receiveAdd).getAreaId();
            QueryWrapper<BranchsEntity> wrapper2 = new QueryWrapper<>();
            wrapper2.eq("areaId",area1);
            wrapper2.eq("branchType",2);
            Long provinceBranch2 = branchsService.getOne(wrapper2).getBranchId();
            list.add(getPointByBranchId(provinceBranch2.intValue())); //发往另一个省网点
            QueryWrapper<BranchsEntity> wrapper3 = new QueryWrapper<>();
            wrapper3.eq("areaId",area1);
            wrapper3.eq("branchType",1);
            Long cityBranch = branchsService.getOne(wrapper3).getBranchId();
            list.add(getPointByBranchId(cityBranch.intValue())); //发往市网点
            QueryWrapper<BranchsEntity> wrapper4 = new QueryWrapper<>();
            wrapper4.eq("areaId",area1);
            wrapper4.eq("branchType",0);
            Long areaBranch = branchsService.getOne(wrapper4).getBranchId();
            list.add(getPointByBranchId(areaBranch.intValue())); //发往区网点
            String res = "";
            for (int i = 0; i < list.size(); i++) {
                if (i == list.size() - 1) {
                    res += list.get(i).getLng() + "," + list.get(i).getLat();
                }
                else {
                    res += list.get(i).getLng() + "," + list.get(i).getLat() + "|";
                }
            }
            return res;
        } else if (isSame(ordersService.getById(orderId).getOriginAdd(),ordersService.getById(orderId).getDestAdd()) == 2) {//同省
            Long destAdd = ordersEntity.getOriginAdd();
            Integer area = mailingaddService.getById(destAdd).getAreaId();
            QueryWrapper<BranchsEntity> wrapper1 = new QueryWrapper<>();
            wrapper1.eq("areaId",area);
            wrapper1.eq("branchType",2);
            Long provinceBranch1 = branchsService.getOne(wrapper1).getBranchId();
            list.add(getPointByBranchId(provinceBranch1.intValue())); //发往省网点
            QueryWrapper<BranchsEntity> wrapper2 = new QueryWrapper<>();
            wrapper2.eq("areaId",area);
            wrapper2.eq("branchType",1);
            Long cityBranch = branchsService.getOne(wrapper2).getBranchId();
            list.add(getPointByBranchId(cityBranch.intValue())); //发往市网点
            QueryWrapper<BranchsEntity> wrapper3 = new QueryWrapper<>();
            wrapper3.eq("areaId",area);
            wrapper3.eq("branchType",0);
            Long areaBranch = branchsService.getOne(wrapper3).getBranchId();
            list.add(getPointByBranchId(areaBranch.intValue())); //发往区网点
            String res = "";
            for (int i = 0; i < list.size(); i++) {
                if (i == list.size() - 1) {
                    res += list.get(i).getLng() + "," + list.get(i).getLat();
                }
                else {
                    res += list.get(i).getLng() + "," + list.get(i).getLat() + "|";
                }
            }
            return res;
        } else if (isSame(ordersService.getById(orderId).getOriginAdd(),ordersService.getById(orderId).getDestAdd()) == 1) {//同市
            Long destAdd = ordersEntity.getOriginAdd();
            Integer area = mailingaddService.getById(destAdd).getAreaId();
            QueryWrapper<BranchsEntity> wrapper1 = new QueryWrapper<>();
            wrapper1.eq("areaId",area);
            wrapper1.eq("branchType",1);
            Long cityBranch = branchsService.getOne(wrapper1).getBranchId();
            list.add(getPointByBranchId(cityBranch.intValue())); //发往市网点
            QueryWrapper<BranchsEntity> wrapper2 = new QueryWrapper<>();
            wrapper2.eq("areaId",area);
            wrapper2.eq("branchType",0);
            Long areaBranch = branchsService.getOne(wrapper2).getBranchId();
            list.add(getPointByBranchId(areaBranch.intValue())); //发往区网点
            String res = "";
            for (int i = 0; i < list.size(); i++) {
                if (i == list.size() - 1) {
                    res += list.get(i).getLng() + "," + list.get(i).getLat();
                }
                else {
                    res += list.get(i).getLng() + "," + list.get(i).getLat() + "|";
                }
            }
            return res;
        } else {//同区
            Long destAdd = ordersEntity.getOriginAdd();
            Integer area = mailingaddService.getById(destAdd).getAreaId();
            QueryWrapper<BranchsEntity> wrapper1 = new QueryWrapper<>();
            wrapper1.eq("areaId",area);
            wrapper1.eq("branchType",0);
            Long areaBranch = branchsService.getOne(wrapper1).getBranchId();
            list.add(getPointByBranchId(areaBranch.intValue())); //发往区网点
            return list.get(0).getLng() + "," + list.get(0).getLat();
        }

    }
}

