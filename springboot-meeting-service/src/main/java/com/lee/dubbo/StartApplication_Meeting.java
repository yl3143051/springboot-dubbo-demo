package com.lee.dubbo;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.lee.dubbo.mapper")
@EnableDubbo
public class StartApplication_Meeting {

    public static void main(String[] args) {
        SpringApplication.run(StartApplication_Meeting.class);
    }
}
