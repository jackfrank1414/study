package com.jackfrank.study.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * @author : jackfrank
 * @version : v1.0
 * @description : 一句话描述该类的功能
 * @createTime : 2023/10/15 0:56
 */
@Data
@Schema(name = "studentDTO", description = "学生信息DTO")
public class StudentDTO {
    /**
     * 学号
     */
    @Schema(name = "studentId", description = "学号")
    private Long studentId;

    /**
     * 姓名
     */
    @Schema(name = "studentName", description = "姓名")
    private String studentName;
}
