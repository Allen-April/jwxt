package com.jwxt.service.impl;

import com.jwxt.entity.CourseSchedule;
import com.jwxt.mapper.CourseScheduleMaper;
import com.jwxt.service.CourseScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @version 1.0
 * @ClassName CourseScheduleServiceIml
 * @Descript
 * @Author Allen
 * @Date 2024/6/25 20:27
 **/
@Service
public class CourseScheduleServiceIml implements CourseScheduleService {

    @Autowired
    CourseScheduleMaper courseScheduleMaper;


    public List<CourseSchedule> list() {
        return courseScheduleMaper.list();
    }

}
