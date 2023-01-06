package com.example.springbootsqlite.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.springbootsqlite.model.User;

import java.util.List;

/**
 * @author cphovo
 * create datetime 2022/6/13 23:19
 */
public interface UserService {

    List<User> getUser();

}
