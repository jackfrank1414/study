package com.jackfrank.study.model.vo;

import lombok.Data;

/**
 * @author : jackfrank
 * @version : v1.0
 * @description : 一句话描述该类的功能
 * @createTime : 2023/10/14 22:53
 */
@Data
public class StudentVO {
    /**
     * 学号
     */
    private Long studentId;

    /**
     * 姓名
     */
    private String studentName;
}
