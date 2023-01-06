package com.example.springbootsqlite.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.example.springbootsqlite.mapper.DictMapper;
import com.example.springbootsqlite.mapper.UserMapper;
import com.example.springbootsqlite.model.Dict;
import com.example.springbootsqlite.model.User;
import com.example.springbootsqlite.service.DictService;
import com.example.springbootsqlite.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author cphovo
 * create datetime 2022/6/13 23:20
 */
@Service
public class DictServiceImpl implements DictService {

    @Autowired
    private DictMapper dictMapper;

    @Override
    public List<Dict> getDict(String code) {
        LambdaQueryWrapper<Dict> queryWrapper=new LambdaQueryWrapper<>();
        if (code.contains(",")){
            String[] split = code.split(",");
            queryWrapper.in(Dict::getCode,split);
        }else {
            queryWrapper.eq(Dict::getCode,code);
        }
        return dictMapper.selectList(queryWrapper);
    }
}
