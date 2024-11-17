package com.jwxt.service;


import com.jwxt.entity.Clas;

import java.util.List;

public interface ClassService {
    /*
    * 查询全部班级
    * */
    List<Clas> list();

    /*
    * 新增班级
    * */
    void add(Clas clas);

    /*
    * 更新班级
    * */
    void update(Clas clas);


    /*
    * 根据id删除班级
    * */
    void deleteById(Integer id);

}
