package com.jackfrank.study.model.dto;

import lombok.Data;

/**
 * @author : jackfrank
 * @version : v1.0
 * @description : 一句话描述该类的功能
 * @createTime : 2023/10/15 0:56
 */
@Data
public class StudentDTO {
    /**
     * 学号
     */
    private Long studentId;

    /**
     * 姓名
     */
    private String studentName;
}
