package com.example.logistics.service.impl;

import com.example.logistics.entity.OrderEntity;
import com.example.logistics.mapper.OrderMapper;
import com.example.logistics.service.OrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lonerW
 * @since 2024-04-18 23:13:03
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, OrderEntity> implements OrderService {

}
