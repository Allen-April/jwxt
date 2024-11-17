package com.jwxt.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.jwxt.entity.PageBean;
import com.jwxt.entity.Teacher;
import com.jwxt.mapper.TeacherMapper;
import com.jwxt.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @version 1.0
 * @ClassName TeacherServiceImpl
 * @Descript
 * @Author Allen
 * @Date 2024/6/24 17:53
 **/
@Service
public class TeacherServiceImpl implements TeacherService{

    @Autowired
    TeacherMapper teacherMapper;

    /*
    如果启用了自动导包功能，确保导入的是MyBatis的Page类，而不是Spring Data的Page接口。
    例如：
    import com.github.pagehelper.Page;
    而不是
    import org.springframework.data.domain.Page;
*/

    @Override
    //分页查询
    public PageBean page(Integer page, Integer pageSize) {
        // 设置分页参数
        PageHelper.startPage(page, pageSize);
        // 获取分页查询结果
        Page<Teacher> pageResult = (Page<Teacher>) teacherMapper.list();
        //封装PageBean
        PageBean pageBean = new PageBean(pageResult.getTotal(), pageResult.getResult());
        return pageBean;
    }

    /*
    //普通查询
    public List<Teacher> list() { return teacherMapper.list(); }
*/

    @Override
    public void add(Teacher teacher) {
        teacherMapper.add(teacher);
    }

    @Override
    public void update(Teacher teacher) {
        teacherMapper.update(teacher);
    }

    @Override
    public void deleteById(Integer id) {
        teacherMapper.deleteById(id);
    }
}
