package com.example.springbootsqlite.service;

import com.example.springbootsqlite.model.Dict;
import com.example.springbootsqlite.model.User;

import java.util.List;

/**
 * @author cphovo
 * create datetime 2022/6/13 23:19
 */
public interface DictService {

    List<Dict> getDict(String code);

}
