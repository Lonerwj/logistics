package com.example.logistics.service.impl;

import com.example.logistics.entity.UserEntity;
import com.example.logistics.mapper.UserMapper;
import com.example.logistics.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lonerW
 * @since 2024-05-04 18:46:14
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserEntity> implements UserService {

}
