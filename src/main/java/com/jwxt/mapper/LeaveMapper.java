package com.jwxt.mapper;

import com.jwxt.entity.Leave;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface LeaveMapper {
    //查询请假条列表
    //表名或列名是数据库的保留字，需要使用反引号(`)将它们括起来。
    @Select(" select * from `leave` ")
    List<Leave> list();

    //审批请假条
    //approval_comment = #{comment},
    @Update(" update `leave` set approval_comment = 'ww', approval_date = current_timestamp where leave_id = #{iiid} ")
    void updateById(Integer iid,String m);//, String comment #{comment}







    //申请请假
    @Insert(" insert into `leave` (calss_id, student_id, student_name, reason, start_date, end_date, status) " +
            " valus( #{classId}, #{studentId}, #{studentName}, #{reason}, #{startDate}, #{endDate}, '待审批' ) ")
    void add(com.jwxt.entity.Leave leave);

    //根据学生id查询请假条

}
