package com.jwxt.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * (Teacher)实体类
 *
 * @author makejava
 * @since 2024-06-24 17:14:38
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Teacher {
    

    private Integer teacherId;

    private Integer userId;

    private Integer departmentId;

    private String teacherName;

    public Integer getTeacherId() {
        return teacherId;
    }

    public Integer getUserId() {
        return userId;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public String getTeacherName() {
        return teacherName;
    }
}

