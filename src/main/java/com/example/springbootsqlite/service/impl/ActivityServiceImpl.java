package com.example.springbootsqlite.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.springbootsqlite.mapper.ActivityMapper;
import com.example.springbootsqlite.mapper.DictMapper;
import com.example.springbootsqlite.model.Activity;
import com.example.springbootsqlite.model.Dict;
import com.example.springbootsqlite.service.ActivityService;
import com.example.springbootsqlite.service.DictService;
import com.github.xiaoymin.knife4j.core.util.StrUtil;
import org.mockito.internal.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sun.java2d.pipe.SpanIterator;

import java.util.List;
import java.util.Objects;


/**
 * @author cphovo
 * create datetime 2022/6/13 23:20
 */
@Service
public class ActivityServiceImpl implements ActivityService {

    @Autowired
    private ActivityMapper activityMapper;

    @Override
    public List<Activity> getActivity() {
        LambdaQueryWrapper<Activity> queryWrapper=new LambdaQueryWrapper<>();
        return activityMapper.selectList(null);
    }

    @Override
    public void addActivity(Activity activity) {
        activityMapper.insert(activity);
    }

    @Override
    public void updateActivity(Activity activity) {
        int i = activityMapper.updateById(activity);
        System.out.println(i);
    }

    @Override
    public void deleteActivity(Activity activity) {
        activityMapper.deleteById(activity.getId());
    }

    @Override
    public Page<Activity> ActivityPage(Page page, Activity activity) {
        LambdaQueryWrapper<Activity> queryWrapper=new LambdaQueryWrapper<>();
        if (StrUtil.isNotBlank(activity.getName())){
            queryWrapper.like(Activity::getName,activity.getName());
        }else {
            return activityMapper.selectPage(page,null);
        }

        return activityMapper.selectPage(page,queryWrapper);
    }
}
