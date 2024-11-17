package com.jwxt.mapper;

import com.jwxt.entity.Clas;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ClassMapper {
    /*
    * 查询全部班级
    * */
    @Select("select * from clas")
    List<Clas> list();

    /*
    * 增加班级
    * @param class
    * */
    @Insert("insert into clas(class_Id, classroom, class_teacher_id) " +
            "values (#{classId},#{classroom}, #{classTeacherId})")
    void insert(Clas clas);

    /*
    * 更新班级
    * @param class
    * */
    @Update("update clas set classroom = #{classroom}, class_teacher_id = #{classTeacherId} " +
            "where class_id = #{classId}")
    void updata(Clas clas);

    /*
    * 根据ID删除班级
    * */
    @Delete("delete from clas where class_id = #{id}")
    void deleteById(Integer id);



}
