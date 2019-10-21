package com.lee.dubbo;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import tk.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan(basePackages = "com.lee.dubbo.mapper")
@EnableDubbo
public class StartApplication {


    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
    }
}
