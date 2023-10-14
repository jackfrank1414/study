package com.jackfrank.study.service;

import com.jackfrank.study.model.vo.StudentVO;

/**
 * @author : jackfrank
 * @version : v1.0
 * @description : 一句话描述该类的功能
 * @createTime : 2023/10/15 0:57
 */
public interface StudentService {
    /**
     * 获取学生信息
     *
     * @return 学生信息
     */
    StudentVO getStudent();
}
