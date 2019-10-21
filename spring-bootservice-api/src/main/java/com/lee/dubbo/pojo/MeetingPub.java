package com.lee.dubbo.pojo;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Table(name = "meeting_pub")
public class MeetingPub implements Serializable {
    @Id
    private Integer id;

    /**
     * 会议名称
     */
    @Column(name = "meeting_name")
    private String meetingName;

    /**
     * 会议id
     */
    @Column(name = "dept_id")
    private Integer deptId;

    /**
     * 会议编码
     */
    @Column(name = "meeting_code")
    private String meetingCode;


    private Dept dept;

}