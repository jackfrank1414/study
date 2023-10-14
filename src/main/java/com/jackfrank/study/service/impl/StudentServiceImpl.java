package com.jackfrank.study.service.impl;

import com.jackfrank.study.dao.StudentDao;
import com.jackfrank.study.model.vo.StudentVO;
import com.jackfrank.study.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author : jackfrank
 * @version : v1.0
 * @description : 一句话描述该类的功能
 * @createTime : 2023/10/15 0:57
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;

    /**
     * 获取学生信息
     *
     * @return 学生信息
     */
    @Override
    public StudentVO getStudent() {
        return studentDao.selectStudent();
    }
}
