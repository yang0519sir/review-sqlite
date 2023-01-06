package com.example.springbootsqlite.model;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("master_user")
public class User {

    private String ID;

    @TableField("DESC1")
    private String DESC1;//姓名

    @TableField("CATEGORYNAME")
    private String CATEGORYNAME;//部门

    @TableField("DESC21")
    private String DESC21;//姓名
}
