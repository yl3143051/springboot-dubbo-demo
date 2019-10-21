package com.lee.dubbo.mapper;

import com.lee.dubbo.pojo.MeetingPub;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.Mapper;

@Component
public interface MeetingPubMapper extends Mapper<MeetingPub> {

    @Select("select * from meeting_pub where meeting_code = #{meetingCode}")
    MeetingPub findByMeetingCode(String meetingCode);
}