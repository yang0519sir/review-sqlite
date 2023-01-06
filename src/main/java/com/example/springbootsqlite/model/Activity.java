package com.example.springbootsqlite.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("activity")
public class Activity {


    private Integer id;

    @TableField("name")
    private String name;//活动名称

    @TableField("year")
    private Integer year;//年度

    @TableField("Appraisal_data")
    private String Appraisal_data;//考评日期

    @TableField("address")
    private String address;//考评地点

    @TableField("department")
    private String department;//部门

    @TableField("personnel")
    private String personnel;//人员

    @TableField("status")
    private String status;//状态

    @TableField("remarks")
    private String remarks;//备注

}
