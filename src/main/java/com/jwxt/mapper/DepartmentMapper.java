package com.jwxt.mapper;

import com.jwxt.entity.Department;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface DepartmentMapper {

    @Select(" select * from department ")
    List<Department> list();

    @Insert(" insert into department( department_id, department_name, description ) " +
            " values ( #{departmentId}, #{departmentName}, #{description} ) ")
    void insert(Department department);

    @Update(" update department set department_name = #{departmentName}, description = #{description} where department_id = #{departmentId}")
    void update(Department department);

    @Delete(" delete from department where department_id = #{id} ")
    void deleteById(Integer id);
}
