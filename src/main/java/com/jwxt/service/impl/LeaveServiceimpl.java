package com.jwxt.service.impl;

import com.jwxt.entity.Leave;
import com.jwxt.mapper.LeaveMapper;
import com.jwxt.service.LeaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @version 1.0
 * @ClassName LeaveServiceimpl
 * @Descript
 * @Author Allen
 * @Date 2024/6/25 10:24
 **/
@Service
public class LeaveServiceimpl implements LeaveService {

    @Autowired
    LeaveMapper leaveMapper;

    @Override
    public List<Leave> list() {
        return leaveMapper.list();
    }

    @Override
    public void updateById(Integer id, String comment) {
        System.out.println("要传递的更新参数："+ id+ "," + comment);
        leaveMapper.updateById(id,comment);
    }
}
