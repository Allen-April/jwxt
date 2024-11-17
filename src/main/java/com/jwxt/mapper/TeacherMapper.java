package com.jwxt.mapper;

import com.jwxt.entity.Teacher;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface TeacherMapper {


    @Select(" select * from teacher ")
    List<Teacher> list();

    @Insert(" insert into teacher (teacher_id, user_id, department_id, teacher_name)" +
            "values ( #{teacherId}, #{userId}, #{departmentId}, #{teacherName})")
    void add(Teacher teacher);

    @Update(" update teacher set teacher_id = #{teacherId}, user_id = #{userId}, department_id = #{departmentId}, teacher_name = #{teacherName} where teacher_id = #{teacherId}")
    void update(Teacher teacher);

    //根据ID删除员工
    @Delete(" delete from teacher where teacher_id = #{id} ")
    void deleteById(Integer id);

    //根据部门id删除部门下所有员工
    @Delete("delete from emp where dept_id=#{deptId}")
    public int deleteByDeptId(Integer deptId);
}
