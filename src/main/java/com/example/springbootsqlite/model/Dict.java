package com.example.springbootsqlite.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("dict")
public class Dict {

    @TableField("code")
    private String code;

    @TableField("name")
    private String name;

    @TableField("father_name")
    private String fatherName;

    @TableField("remarks")
    private String remarks;

    @TableField("sort")
    private Integer sort;
}
