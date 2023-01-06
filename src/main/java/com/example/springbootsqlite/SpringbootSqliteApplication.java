package com.example.springbootsqlite;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author cphovo
 * create datetime 2022/6/13 22:56
 * springboot 启动入口
 */
@SpringBootApplication
@MapperScan("com.example.springbootsqlite.mapper")
public class SpringbootSqliteApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootSqliteApplication.class, args);
    }

}
