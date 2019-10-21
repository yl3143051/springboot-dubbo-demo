package com.lee.dubbo.controller;

import com.lee.dubbo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping("findById")
    public Object findPersonInfo(Integer id) {
        return personService.getPersonInfo(id);
    }
}
