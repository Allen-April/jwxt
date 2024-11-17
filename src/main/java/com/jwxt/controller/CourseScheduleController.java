package com.jwxt.controller;

import com.jwxt.entity.Result;
import com.jwxt.service.impl.CourseScheduleServiceIml;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version 1.0
 * @ClassName CourseScheduleController
 * @Descript
 * @Author Allen
 * @Date 2024/6/25 20:29
 **/
@RestController
@RequestMapping("/courseSchedules")
public class CourseScheduleController {

    @Autowired
    CourseScheduleServiceIml courseScheduleServiceIml;

    @GetMapping("")
    public Result list() {
        return Result.success( courseScheduleServiceIml.list() );
    }
}
