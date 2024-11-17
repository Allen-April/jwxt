package com.jwxt.service;

import com.jwxt.entity.Department;

import java.util.List;


public interface DepartmentService {

    List<Department> list();

    void add(Department department);

    void update(Department department);

    void deleteById(Integer id);
}
