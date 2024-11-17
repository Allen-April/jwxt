package com.jwxt.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * (Class)实体类
 *
 * @author makejava
 * @since 2024-06-23 15:40:47
 */

@NoArgsConstructor
@AllArgsConstructor
public class Clas {


    private Integer classId;

    private String classroom;

    private Integer classTeacherId;

    public Integer getClassId() {
        return classId;
    }

    public String getClassroom() {
        return classroom;
    }

    public Integer getClassTeacherId() {
        return classTeacherId;
    }
}

