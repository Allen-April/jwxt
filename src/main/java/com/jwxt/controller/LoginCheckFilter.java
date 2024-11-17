package com.jwxt.controller;

import com.alibaba.fastjson.JSONObject;
import com.jwxt.entity.Result;
import com.jwxt.utils.JwtUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.StringUtils;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *@ClassName LoginCheckFilter
 *@Descript
 *@Author Allen
 *@Date 2024/6/22 22:35
 *@version 1.0
 **/
/*
过滤器Filtert构建
- 1. 定义过滤器 ：定义一个过滤器类，实现 Filter 接口，并重写其所有方法。
- 2. 配置过滤器：Filter类上加 @WebFilter 注解，配置拦截资源的路径。
（启动）引导类上加 @ServletComponentScan 开启Servlet组件支持。*/

//登录校验过滤器
@Slf4j
@WebFilter(urlPatterns = "")//拦截所有请求。  令牌有误，暂不拦截
public class LoginCheckFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {
        //前置：强制转换为http协议的请求对象、响应对象 （转换原因：要使用子类中特有方法）
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;

        //1.获取请求url
        String url = request.getRequestURL().toString();
        log.info("请求路径：{}", url); //请求路径：


        //2.判断请求url中是否包含login，如果包含，说明是登录操作，放行
        if(url.contains("/login/")){
            chain.doFilter(request, response);//放行请求
            System.out.println("放行登录请求");
            return;//结束当前方法的执行
        }


        //3.获取请求头中的令牌（token）
        String token = request.getHeader("token");
        log.info("从请求头中获取的令牌：{}",token);


        //4.判断令牌是否存在，如果不存在，返回错误结果（未登录）
        if(!StringUtils.hasLength(token)){
            log.info("Token不存在");


            Result responseResult = Result.error("NOT_LOGIN");
            //把Result对象转换为JSON格式字符串 (fastjson是阿里巴巴提供的用于实现对象和json的转换工具类)
            String json = JSONObject.toJSONString(responseResult);
            response.setContentType("application/json;charset=utf-8");
            //响应
            response.getWriter().write(json);

            return ;
        }

        //5.解析token，如果解析失败，返回错误结果（未登录）
        try {
            JwtUtils.parseJWT(token);
        }catch (Exception e){
            log.info("令牌解析失败!");

            Result responseResult = Result.error("NOT_LOGIN");
            //把Result对象转换为JSON格式字符串 (fastjson是阿里巴巴提供的用于实现对象和json的转换工具类)
            String json = JSONObject.toJSONString(responseResult);
            response.setContentType("application/json;charset=utf-8");
            //响应
            response.getWriter().write(json);

            return ;
        }


        //6.放行
        chain.doFilter(request, response);

    }
}
