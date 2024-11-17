package com.jwxt.controller;

import com.jwxt.entity.Clas;
import com.jwxt.entity.Result;
import com.jwxt.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @version 1.0
 * @ClassName ClassController
 * @Descript
 * @Author Allen
 * @Date 2024/6/23 16:34
 **/

@RequestMapping("/classes")
@RestController
public class ClassController {

    @Autowired
    private ClassService classService;

    /*
    * 查询全部班级数据
    * */
    @GetMapping
    public Result list(){
        List<Clas> classList = classService.list();
        return Result.success(classList);
    }

    /*
    * 新增班级
    * */
    @PostMapping("/add")
    //@RequestBody注解用于将客户端发送的请求体（如JSON）绑定到控制器方法的参数上。
    public Result add(@RequestBody Clas clas){
        classService.add(clas);
        return Result.success("已新增班级" + clas.getClassId() );
    }

    /*
    * 更新班级*/
    @PutMapping("")
    public Result update(@RequestBody Clas clas){
        classService.update(clas);
        return Result.success("已更新班级" + clas.getClassId() );
    }


    /*
    * 根据id删除班级*/
    @DeleteMapping("/delete{id}")
    public Result delete(@PathVariable Integer id){
        classService.deleteById(id);
        return Result.success("已删除班级" + id );
    }

}
