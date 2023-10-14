package com.jackfrank.study.controller.ui;

import com.jackfrank.study.common.vo.ApiResponse;
import com.jackfrank.study.model.converter.StudentVOToDtoConverter;
import com.jackfrank.study.model.vo.StudentVO;
import com.jackfrank.study.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : jackfrank
 * @version : v1.0
 * @description : 一句话描述该类的功能
 * @createTime : 2023/10/14 23:28
 */
@RestController
@RequestMapping("/student")
public class StudentUIAPI {
    @Autowired
    private StudentService studentService;

    /**
     * 获取学生信息
     *
     * @return 学生信息
     */
    @RequestMapping(value = "/getStudent", method = RequestMethod.GET)
    public ApiResponse getStudent() {
        StudentVO studentVO = studentService.getStudent();
        StudentVOToDtoConverter studentVOToDtoConverter = new StudentVOToDtoConverter();

        return ApiResponse.success(studentVOToDtoConverter.convert(studentVO));
    }
}
