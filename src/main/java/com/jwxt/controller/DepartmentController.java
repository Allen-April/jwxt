package com.jwxt.controller;

import com.jwxt.entity.Department;
import com.jwxt.entity.Result;
import com.jwxt.service.impl.DepartmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @version 1.0
 * @ClassName DepartmentController
 * @Descript
 * @Author Allen
 * @Date 2024/6/24 15:10
 **/
@RestController
@RequestMapping("/departments")
public class DepartmentController {

    @Autowired
    DepartmentServiceImpl departmentServiceImpl;

    @GetMapping("")
    public Result list(){ return Result.success( departmentServiceImpl.list() ); }

    @PostMapping("/add")
    //@RequestBody注解用于将客户端发送的请求体（如JSON）绑定到控制器方法的参数上。
    public Result add(@RequestBody Department department){
        System.out.println(department);
        departmentServiceImpl.add(department);
        return Result.success("已经新增部门"+department.getDepartmentName() );
    }

    @PutMapping("")
    public Result update(@RequestBody Department department){
        System.out.println(department);
        departmentServiceImpl.update(department);
        return Result.success("已经更新部门"+department.getDepartmentName() + department.getDescription() );
    }

    @DeleteMapping("/delete/{id}")
    public Result delete(@PathVariable Integer id) throws Exception {
        try{
            departmentServiceImpl.delete(id);
        }catch (Exception e) {
            System.out.println(e);
        }
        return Result.success("已经删除部门："+id);
    }


}
