package com.lee.dubbo.controller;

import com.lee.dubbo.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dept")
public class DeptController {

    @Autowired
    private DeptService deptService;

    @RequestMapping("/findById")
    public Object findById(Integer id) {
        return deptService.findById(id);
    }
}
