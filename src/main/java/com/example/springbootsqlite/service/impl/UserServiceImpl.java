package com.example.springbootsqlite.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;

import com.example.springbootsqlite.mapper.UserMapper;
import com.example.springbootsqlite.model.User;
import com.example.springbootsqlite.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author cphovo
 * create datetime 2022/6/13 23:20
 */
@Service
@DS("slave")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    @DS("slave_1")
    public List<User> getUser() {
        LambdaQueryWrapper<User> queryWrapper=new LambdaQueryWrapper<>();
        return userMapper.selectList(null);
    }
}
