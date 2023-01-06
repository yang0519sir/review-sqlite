package com.example.springbootsqlite.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springbootsqlite.model.Activity;
import com.example.springbootsqlite.model.Dict;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ActivityMapper extends BaseMapper<Activity> {
}
