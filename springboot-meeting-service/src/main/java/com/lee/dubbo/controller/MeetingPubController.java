package com.lee.dubbo.controller;

import com.lee.dubbo.service.MeetingPubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class MeetingPubController {

    @Autowired
    private MeetingPubService meetingPubService;

    @RequestMapping("findByCode")
    public Object findByCode(String code) {
        return meetingPubService.findById(code);
    }
}
