package com.jwxt.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * (User)实体类
 *
 * @author makejava
 * @since 2024-06-23 01:10:18
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    

    private Integer userId;

    private String username;

    private String password;

    private String role;

    public Integer getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }
}

