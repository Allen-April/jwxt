package com.jwxt.mapper;

import com.jwxt.entity.Student;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface StudentMapper {

    @Select("select * from student")
    List<Student> list();

    @Insert(" insert into student( student_id, class_id, student_name ) values ( #{studentId}, #{classId}, #{studentName} ) ")
    void insert(Student student);

    @Update(" update student set student_id = #{studentId}, class_id = #{classId}, student_name = #{studentName} where student_id = #{studentId}")
    void update(Student student);

    @Delete(" delete from student where student_id = #{id} ")
    void deleteById(Integer id);
}
