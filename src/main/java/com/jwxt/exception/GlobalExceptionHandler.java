package com.jwxt.exception;

/**
 * @version 1.0
 * @ClassName GlobalExceptionHandler
 * @Descript
 * @Author Allen
 * @Date 2024/6/23 15:22
 **/

import com.jwxt.entity.Result;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 全局异常处理器
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)//捕获所有异常
    public Result ex(Exception ex){
        ex.printStackTrace();
        return Result.error("对不起,操作失败,存在异常，请联系管理员");
    }

}