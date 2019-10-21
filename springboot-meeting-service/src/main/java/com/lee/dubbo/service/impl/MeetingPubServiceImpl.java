package com.lee.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lee.dubbo.mapper.MeetingPubMapper;
import com.lee.dubbo.pojo.Dept;
import com.lee.dubbo.pojo.MeetingPub;
import com.lee.dubbo.service.DeptService;
import com.lee.dubbo.service.MeetingPubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MeetingPubServiceImpl implements MeetingPubService {

    @Autowired
    private MeetingPubMapper meetingPubMapper;

    @Reference //在注册中心 引用服务
    private DeptService deptService;


    @Override
    public MeetingPub findById(String meetingCode) {
        MeetingPub pub = meetingPubMapper.findByMeetingCode(meetingCode);
        Dept dept = deptService.findById(pub.getId());
        pub.setDept(dept);
        return pub;
    }
}
