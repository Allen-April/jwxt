package com.jwxt.service.impl;

import com.jwxt.mapper.ClassMapper;
import com.jwxt.entity.Clas;
import com.jwxt.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @version 1.0
 * @ClassName ClassServiceImpl
 * @Descript
 * @Author Allen
 * @Date 2024/6/23 16:17
 **/
@Service
public class ClassServiceImpl implements ClassService {

    @Autowired
    private ClassMapper classMapper;

    /*查班级
    * */
    @Override
    public List<Clas> list() { return classMapper.list(); }

    /*增加班级
    * */
    @Override
    public void add(Clas clas) { classMapper.insert(clas); }

    /*更新班级
    * */
    @Override
    public void update(Clas clas) { classMapper.updata(clas); }

    /*根据id删除班级
    * */
    @Override
    public void deleteById(Integer id) { classMapper.deleteById(id); }


}
