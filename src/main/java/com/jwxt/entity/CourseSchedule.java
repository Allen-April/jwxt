package com.jwxt.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * (CourseSchedule)实体类
 *
 * @author makejava
 * @since 2024-06-25 20:24:11
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CourseSchedule {
    

    private Integer scheduleId;

    private Integer classId;

    private Integer teacherId;

    private String subject;

    private String workday;

    private Integer dayOrder;


}

