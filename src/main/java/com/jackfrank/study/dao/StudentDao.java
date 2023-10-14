package com.jackfrank.study.dao;

import com.jackfrank.study.model.vo.StudentVO;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author : jackfrank
 * @version : v1.0
 * @description : 一句话描述该类的功能
 * @createTime : 2023/10/15 2:15
 */
@Mapper
public interface StudentDao {
    StudentVO selectStudent();
}
