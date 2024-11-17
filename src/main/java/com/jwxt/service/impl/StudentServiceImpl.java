package com.jwxt.service.impl;

import com.jwxt.entity.Student;
import com.jwxt.mapper.StudentMapper;
import com.jwxt.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @version 1.0
 * @ClassName StudentServiceImpl
 * @Descript
 * @Author Allen
 * @Date 2024/6/23 20:53
 **/

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentMapper studentMapper;

    @Override
    public List<Student> list() {
        return studentMapper.list();
    }

    @Override
    public void add(Student student) {
        System.out.println(studentMapper);
        studentMapper.insert(student);
    }

    @Override
    public void update(Student student) {
        studentMapper.update(student);
    }

    @Override
    public void deleteById(Integer id) { studentMapper.deleteById(id);}
}
