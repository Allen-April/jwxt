package com.jwxt.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * (Student)实体类
 *
 * @author makejava
 * @since 2024-06-23 20:33:00
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    

    private Integer studentId;

    private Integer classId;

    private String studentName;

    public Integer getStudentId() {
        return studentId;
    }

    public Integer getClassId() {
        return classId;
    }

    public String getStudentName() {
        return studentName;
    }
}

