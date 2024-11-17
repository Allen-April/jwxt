package com.jwxt.mapper;

import com.jwxt.entity.DeptLog;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * @version 1.0
 * @ClassName DeptLogMapper
 * @Descript
 * @Author Allen
 * @Date 17/8/2024 下午3:29
 **/
@Mapper
public interface DeptLogMapper {

    @Insert("insert into dept_log(create_time,description) values(#{createTime},#{description})")
    void insert(DeptLog log);

}
