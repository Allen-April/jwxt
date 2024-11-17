package com.jwxt.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * @version 1.0
 * @ClassName PageBean
 * @Descript
 * @Author Allen
 * @Date 9/7/2024 下午2:52
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Slf4j
public class PageBean {
    private Long total; //总记录数
    private List rows; //当前页数据列表
}
