package com.jwxt.mapper;

import com.jwxt.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    //登录，根据用户名密码查找，
    @Select("select * from user where username = #{username} and password = #{password}")
    User getByUsernameAndPassword(String username, String password);

    //注册
    @Insert(" insert into user values ( #{username}, #{password} ) ")
    int register(User user);




}
