package com.jwxt.service.impl;

import com.jwxt.entity.DeptLog;
import com.jwxt.mapper.DeptLogMapper;
import com.jwxt.service.DeptLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @version 1.0
 * @ClassName DeptLogServiceImpl
 * @Descript
 * @Author Allen
 * @Date 17/8/2024 下午3:33
 **/
@Service
public class DeptLogServiceImpl implements DeptLogService {

    @Autowired
    private DeptLogMapper deptLogMapper;

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    //事务传播行为：不论是否有事务，都新建事务.
    //使得该事务保持独立。始终记录日志
    @Override
    public void insert(DeptLog deptLog) {
        deptLogMapper.insert(deptLog);
    }
}

