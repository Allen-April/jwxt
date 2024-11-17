package com.jwxt.controller;

import com.jwxt.entity.Result;
import com.jwxt.entity.Teacher;
import com.jwxt.service.TeacherService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @version 1.0
 * @ClassName TeacherController
 * @Descript
 * @Author Allen
 * @Date 2024/6/24 17:59
 **/
@Slf4j
@RestController
@RequestMapping("/teachers")
public class TeacherController {
    @Autowired
    TeacherService teacherService;

    /*//普通查询
    @GetMapping("")
    Result list() {
        return Result.success( teacherService.list() );
    }
    */

    //分页查询
    @GetMapping("")
    Result page(@RequestParam(defaultValue = "1") Integer page,
                @RequestParam(defaultValue = "10") Integer pageSize ) {
        log.info("分页查询，参数：{},{}", page, pageSize);
        return Result.success(teacherService.page(page,pageSize));
    }



    @PostMapping("/add")
    //请求参数绑定到处理器方法参数
    Result add(@RequestBody Teacher teacher) {
        System.out.println(teacher);
        teacherService.add(teacher);
        return Result.success("已经新增教师："+teacher);
    }

    @PutMapping("")
    void update(@RequestBody Teacher teacher) {
        System.out.println(teacher);
        teacherService.update(teacher);
    }

    @DeleteMapping("/delete{id}")
    Result deleteById(@PathVariable Integer id){
        System.out.println(id);
        teacherService.deleteById(id);
        return Result.success();
    }
}
