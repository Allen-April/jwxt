package com.jwxt.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * (Department)实体类
 *
 * @author makejava
 * @since 2024-06-24 14:48:18
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department {
    

    private Integer departmentId;

    private String departmentName;

    private String description;

    public Integer getDepartmentId() {
        return departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }


    public String getDescription() {
        return description;
    }

}

