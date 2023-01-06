package com.example.springbootsqlite.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.springbootsqlite.model.Activity;
import com.example.springbootsqlite.model.User;
import com.example.springbootsqlite.service.ActivityService;
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
public class ActivityController {

    @Autowired
    private ActivityService activityService;

    @RequestMapping("/getActivity")
    public Result<List<Activity>> getActivity(){
      return ResultGenerator.genSuccessResult(activityService.getActivity());
    }


    @PostMapping("/addActivity")
    public Result addActivity(Activity activity){
        activityService.addActivity(activity);
       return ResultGenerator.genSuccessResult();
    }


    @PutMapping("/updateActivity")
    public Result updateActivity(Activity activity){
        activityService.updateActivity(activity);
        return ResultGenerator.genSuccessResult();
    }


    @DeleteMapping("/deleteActivity")
    public Result deleteActivity(Activity activity){
        activityService.deleteActivity(activity);
        return ResultGenerator.genSuccessResult();
    }

    @RequestMapping("ListPage")
    public Result<Page<Activity>> ActivityPage(Page page, Activity activity){
        return ResultGenerator.genSuccessResult(activityService.ActivityPage(page,activity));
    }

}
