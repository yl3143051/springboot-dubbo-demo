package com.lee.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lee.dubbo.mapper.DeptMapper;
import com.lee.dubbo.pojo.Dept;
import com.lee.dubbo.service.DeptService;
import com.lee.dubbo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@com.alibaba.dubbo.config.annotation.Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptMapper deptMapper;
    @Reference
    private PersonService personService;

    @Override
    public Dept findById(Integer id) {
        Dept dept = deptMapper.selectByPrimaryKey(id);
        String personInfo = personService.getPersonInfo(id);
        System.out.println(personInfo);
        return dept;
    }
}
