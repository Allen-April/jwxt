package com.jwxt.service;

import com.jwxt.entity.User;


public interface UserService {
    User login(String username, String password);

    boolean register(User user);
}
