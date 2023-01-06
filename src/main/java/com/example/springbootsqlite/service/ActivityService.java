package com.example.springbootsqlite.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.springbootsqlite.model.Activity;
import com.example.springbootsqlite.model.Dict;
import sun.jvm.hotspot.debugger.win32.coff.DebugVC50;

import java.util.List;

/**
 * @author cphovo
 * create datetime 2022/6/13 23:19
 */
public interface ActivityService {

    List<Activity> getActivity();

    Page<Activity> ActivityPage(Page page, Activity activity);

    void addActivity(Activity activity);

    void updateActivity(Activity activity);

    void deleteActivity(Activity activity);

}
