package com.jwxt.controller;

import com.jwxt.entity.Result;
import com.jwxt.entity.Student;
import com.jwxt.service.impl.StudentServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @version 1.0
 * @ClassName StudentController
 * @Descript
 * @Author Allen
 * @Date 2024/6/23 20:56
 **/
@Slf4j
@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentServiceImpl studentServiceImpl;

    @GetMapping("")
    public List<Student> list(){
        System.out.println("收得到前端查询请求");
        return studentServiceImpl.list();
    }

    @PostMapping("/add")
    //@RequestBody注解用于将客户端发送的请求体（如JSON）绑定到控制器方法的参数上。
    public Result add(@RequestBody Student student){
        System.out.println("接收到前端信息: " + student);
        studentServiceImpl.add(student);
        return Result.success("已经新增学生"+student.getStudentId());
    }

    @PutMapping("")
    public Result update(@RequestBody Student student){
        studentServiceImpl.update(student);
        return Result.success("已经更新学生"+student.getStudentId());
    }

    @DeleteMapping("/delete{id}")
    public Result delete(@PathVariable Integer id){
        studentServiceImpl.deleteById(id);
        return Result.success("已经删除学生"+id);
    }

}
