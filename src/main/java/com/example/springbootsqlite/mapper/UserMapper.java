package com.example.springbootsqlite.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springbootsqlite.model.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
