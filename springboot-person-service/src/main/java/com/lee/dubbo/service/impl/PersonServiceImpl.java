package com.lee.dubbo.service.impl;


import com.lee.dubbo.service.PersonService;
import org.springframework.stereotype.Service;

@Service
@com.alibaba.dubbo.config.annotation.Service
public class PersonServiceImpl implements PersonService {
    @Override
    public String getPersonInfo(Integer id) {
        return "id为"+ id + "的用户是个程序猿";
    }
}
