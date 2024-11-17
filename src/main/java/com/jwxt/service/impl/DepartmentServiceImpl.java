package com.jwxt.service.impl;

import com.jwxt.entity.Department;
import com.jwxt.entity.DeptLog;
import com.jwxt.mapper.DepartmentMapper;
import com.jwxt.mapper.TeacherMapper;
import com.jwxt.service.DepartmentService;
import com.jwxt.service.DeptLogService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @version 1.0
 * @ClassName DepartmentServiceImpl
 * @Descript
 * @Author Allen
 * @Date 2024/6/24 15:05
 **/
@Slf4j
@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private  DepartmentMapper departmentMapper;

    @Autowired
    private TeacherMapper teacherMapper;

    @Autowired
    private DeptLogService deptLogService;

    public List<Department> list() { return departmentMapper.list(); }


    public void add(Department department) { departmentMapper.insert(department); }

    public void update(Department department) { departmentMapper.update(department); }

    //根据部门id，删除部门
    public void deleteById(Integer id) { departmentMapper.deleteById(id); }

    //根据部门id，删除部门信息及部门下的所有员工
    @Transactional(rollbackFor = Exception.class)
    //事务控制。方法交给spring进行事务管理。（回滚所有类型的异常）
    public void delete(Integer id) throws Exception {
        try {
            //根据部门id删除部门信息
            departmentMapper.deleteById(id);
            //模拟：异常
            if(true){
                throw new Exception("出现异常了~~~");
            }
            //删除部门下的所有员工信息
            teacherMapper.deleteByDeptId(id);
        }finally {
            //不论是否有异常，最终都要执行的代码：记录日志
            DeptLog deptLog = new DeptLog();
            deptLog.setCreateTime(LocalDateTime.now());
            deptLog.setDescription("执行了解散部门的操作，此时解散的是"+id+"号部门");

            //调用其他业务类中的方法
            deptLogService.insert(deptLog);
        }
    }

}
