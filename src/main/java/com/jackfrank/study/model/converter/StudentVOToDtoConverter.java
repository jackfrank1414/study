package com.jackfrank.study.model.converter;

import com.jackfrank.study.model.dto.StudentDTO;
import com.jackfrank.study.model.vo.StudentVO;
import org.springframework.beans.BeanUtils;
import org.springframework.core.convert.converter.Converter;

/**
 * @author : jackfrank
 * @version : v1.0
 * @description : 一句话描述该类的功能
 * @createTime : 2023/10/15 1:06
 */
public class StudentVOToDtoConverter implements Converter<StudentVO, StudentDTO> {
    /**
     * StudentVO -> StudentDTO
     *
     * @param studentVO
     * @return studentDTO
     */
    @Override
    public StudentDTO convert(StudentVO studentVO) {
        StudentDTO studentDTO = new StudentDTO();
        BeanUtils.copyProperties(studentVO, studentDTO);

        return studentDTO;
    }
}
