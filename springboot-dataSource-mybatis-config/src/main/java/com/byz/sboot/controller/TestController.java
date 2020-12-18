package com.byz.sboot.controller;


import com.byz.sboot.mapper.PersonMapper;
import com.byz.sboot.model.Person;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.util.List;
import java.util.Map;

@RestController
public class TestController {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private PersonMapper personMapper;

    @RequestMapping("getDataSource")
    public DataSource getDataSource1(){
        System.out.println("dataSource>>>>>" + dataSource);
        return dataSource;
    }

    @RequestMapping("hello")
    public DataSource hello(){
        System.out.println("dataSource>>>>>>>>>>>>>" + dataSource);
        return dataSource;
    }

    @RequestMapping("getPerson")
    public Person getPerson1(Integer id){
        return personMapper.selectById(id);
    }



}
