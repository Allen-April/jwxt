package com.jwxt.controller;

import com.jwxt.entity.Result;
import com.jwxt.service.impl.LeaveServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @version 1.0
 * @ClassName LeaveController
 * @Descript
 * @Author Allen
 * @Date 2024/6/25 10:29
 **/
@RestController
@RequestMapping("/leaves")
public class LeaveController {

    @Autowired
    LeaveServiceimpl leaveServiceimpl;

    @GetMapping("")
    public Result list(){ return Result.success( leaveServiceimpl.list() ); }

    @PutMapping("")
    Result update(@RequestParam("leaveId") Integer id, @RequestParam("approvalComment") String comment) {
        System.out.println("前端传入："+id+","+comment);
        leaveServiceimpl.updateById(id,comment);
        return Result.success();
    }

}
