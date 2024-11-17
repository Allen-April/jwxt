package com.jwxt.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @version 1.0
 * @ClassName Result
 * @Descript
 * @Author Allen
 * @Date 2024/6/22 22:43
 **/

@Data
@NoArgsConstructor
@AllArgsConstructor
//统一响应结果对象
public class Result {
    private Integer code;   //响应码，1 代表成功， 0代表失败
    private String msg;     //响应信息，描述字符串
    private Object data;    //响应的数据

    //增删改 响应成功
    public static Result success(){
        //无响应数据响应成功
        System.out.println(new Result(1,"success",null));
        return new Result(1,"success",null);
    }
    //查 响应成功
    public static Result success(Object data){
        return new Result(1,"success",data);
    }
    // 响应失败
    public static Result error(String msg){
        return new Result(0,msg,null);
    }
}
