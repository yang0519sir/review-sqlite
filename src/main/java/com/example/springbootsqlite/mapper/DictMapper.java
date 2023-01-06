package com.example.springbootsqlite.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springbootsqlite.model.Dict;
import com.example.springbootsqlite.model.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DictMapper extends BaseMapper<Dict> {
}
