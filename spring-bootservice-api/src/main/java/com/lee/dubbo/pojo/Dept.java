package com.lee.dubbo.pojo;

import javax.persistence.*;
import java.io.Serializable;

public class Dept implements Serializable {
    @Id
    private Integer id;

    /**
     * 部门名称
     */
    @Column(name = "dept_name")
    private String deptName;

    /**
     * 数据库名称
     */
    @Column(name = "db_source")
    private String dbSource;


    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取部门名称
     *
     * @return dept_name - 部门名称
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * 设置部门名称
     *
     * @param deptName 部门名称
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    /**
     * 获取数据库名称
     *
     * @return db_source - 数据库名称
     */
    public String getDbSource() {
        return dbSource;
    }

    /**
     * 设置数据库名称
     *
     * @param dbSource 数据库名称
     */
    public void setDbSource(String dbSource) {
        this.dbSource = dbSource == null ? null : dbSource.trim();
    }

}