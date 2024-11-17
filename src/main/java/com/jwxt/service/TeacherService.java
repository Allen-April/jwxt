package com.jwxt.service;

import com.jwxt.entity.PageBean;
import com.jwxt.entity.Teacher;

public interface TeacherService {

    public PageBean page(Integer page, Integer pageSize);

//    public List<Teacher> list();

    void add(Teacher teacher);

    void update(Teacher teacher);

    void deleteById(Integer id);
}
