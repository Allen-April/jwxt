package com.jwxt.service;

import com.jwxt.entity.Leave;

import java.util.List;


public interface LeaveService {

    List<Leave> list();

    void updateById(Integer id, String comment);

}
