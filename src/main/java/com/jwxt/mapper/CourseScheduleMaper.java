package com.jwxt.mapper;

import com.jwxt.entity.CourseSchedule;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CourseScheduleMaper {

    @Select((" select * from course_schedule "))
    List<CourseSchedule> list();
}
