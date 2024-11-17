package com.jwxt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class JwxtApplication {

    public static void main(String[] args) {
        SpringApplication.run(JwxtApplication.class, args);
    }

}

/*

{
"code":1,
"msg":"success",
"data":
{
    "total":15,
    "rows":
    [
        {"teacherId":1,"userId":2,"departmentId":1,"teacherName":"马保国"},
        {"teacherId":2,"userId":3,"departmentId":2,"teacherName":"坤坤"},
        {"teacherId":3,"userId":4,"departmentId":3,"teacherName":"阿道夫"},
        {"teacherId":4,"userId":5,"departmentId":4,"teacherName":"陈放下"},
        {"teacherId":5,"userId":6,"departmentId":5,"teacherName":"珂珂"},
        {"teacherId":11,"userId":2,"departmentId":1,"teacherName":"马保国"},
        {"teacherId":12,"userId":3,"departmentId":2,"teacherName":"坤坤"},
        {"teacherId":13,"userId":4,"departmentId":3,"teacherName":"阿道夫"},
        {"teacherId":14,"userId":5,"departmentId":4,"teacherName":"陈放下"},
        {"teacherId":15,"userId":6,"departmentId":5,"teacherName":"珂珂"}
    ]
}
}


 */