package com.jwxt.service;

import com.jwxt.entity.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentService {

    public List<Student> list();

    public void add(Student student);

    public void update(Student student);

    public void deleteById(Integer id);
    
    
}
