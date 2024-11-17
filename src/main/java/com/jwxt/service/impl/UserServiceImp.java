package com.jwxt.service.impl;

import com.jwxt.entity.User;
import com.jwxt.mapper.UserMapper;
import com.jwxt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @version 1.0
 * @ClassName UserServiceImp
 * @Descript
 * @Author Allen
 * @Date 2024/6/23 1:36
 **/

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserMapper userMapper;

    //登录，根据账号密码查找
    @Override
    public User login(String username, String password) {
        return userMapper.getByUsernameAndPassword(username, password);
    }

    @Override
    public boolean register(User user) {
        return userMapper.register(user) > 0;
    }
}
