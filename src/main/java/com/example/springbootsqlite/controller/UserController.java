package com.example.springbootsqlite.controller;

import com.example.springbootsqlite.model.User;
import com.example.springbootsqlite.service.UserService;
import com.example.springbootsqlite.utils.Result;
import com.example.springbootsqlite.utils.ResultGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author cphovo
 * create datetime 2022/6/13 23:21
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getUser")
    public Result<List<User>> getUser(){
      return ResultGenerator.genSuccessResult(userService.getUser());
    }

}
