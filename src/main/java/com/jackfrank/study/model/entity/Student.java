package com.jackfrank.study.model.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author : jackfrank
 * @version : v1.0
 * @description : 一句话描述该类的功能
 * @createTime : 2023/10/14 22:50
 */
@Data
public class Student implements Serializable {
    /**
     * 学号
     */
    private Long studentId;

    /**
     * 姓名
     */
    private String studentName;
}
