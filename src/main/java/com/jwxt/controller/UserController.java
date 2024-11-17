package com.jwxt.controller;

import com.jwxt.entity.Result;
import com.jwxt.entity.User;
import com.jwxt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @version 1.0
 * @ClassName LoginController
 * @Descript
 * @Author Allen
 * @Date 2024/6/22 23:49
 **/
@RestController
//登录控制器（含有登录和注册功能）
@RequestMapping("/login")
public class UserController {

    @Autowired
    private UserService userService;

    //登录和下发令牌
    @PostMapping("")
    public Result login( @RequestParam("username") String username, @RequestParam("password") String password) {
        //前端传来的登录数据
        System.out.println("前端传来的登录数据" + username + "  " + password);

        //校验
        User u = userService.login(username, password);

        //因为报错未解决，暂不使用jwt
        //登录成功,生成令牌,下发令牌
        if (u != null){

/*
            //存储用户信息
            Map<String, Object> claims = new HashMap<>();
            claims.put("userId", u.getUserId());
            claims.put("username", u.getUsername());
            //生成令牌
            String jwt = JwtUtils.generateJwt(claims); //jwt包含了当前登录的用户信息

            //响应
            return Result.success(jwt);
            */

//            return Result.success(user);

            return Result.success();
        }

        //登录失败, 返回错误信息
//        return Result.error("用户名或密码错误");

        return Result.error("用户名或密码错误");

    }

    //注册
    @RequestMapping("/register")
    public Result register(@RequestBody User user) {
        //待注册用户信息
        System.out.println(user);
        //注册结果
        boolean isRegistered = userService.register(user);
        if(isRegistered) {
            return Result.success();
        }
        else {
            return Result.error("当前用户名已存在，请重试。");
        }

    }

}
