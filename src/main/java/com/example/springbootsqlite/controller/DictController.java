package com.example.springbootsqlite.controller;

import com.example.springbootsqlite.mapper.DictMapper;
import com.example.springbootsqlite.model.Dict;
import com.example.springbootsqlite.model.User;
import com.example.springbootsqlite.service.DictService;
import com.example.springbootsqlite.service.UserService;
import com.example.springbootsqlite.utils.Result;
import com.example.springbootsqlite.utils.ResultGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author cphovo
 * create datetime 2022/6/13 23:21
 */
@RestController
public class DictController {

    @Autowired
    private DictService dictService;

    @RequestMapping("/getDict")
    public Result<List<Dict>> getDict(String code){
      return ResultGenerator.genSuccessResult(dictService.getDict(code));
    }

}
