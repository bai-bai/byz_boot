package com.byz.sboot.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("test")
public class TestController {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @RequestMapping("/hello")
    public String hello(){
        System.out.println(">>>>>>>>>>>>>" + dataSource);
        return "springboot-dataSource";
    }

    @GetMapping("query")
    public List<Map<String, Object>>  query(){
        System.out.println(">>>>>>>>>>>>>" + dataSource);
        List<Map<String, Object>> maps = jdbcTemplate.queryForList("select * from employee");
        return maps;
    }


}
