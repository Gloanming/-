package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class JdbcController {
    @Autowired
    JdbcTemplate jct;

    @GetMapping("/userlist")
    public List<Map<String, Object>> userList(){
        String sql = "select * from todolist";
        return jct.queryForList(sql);
    }

    @GetMapping("/pages/index-op1/index-op1")
    public String addUser(String string){
        String sql1 = String.format("insert into todolist values(%s)",string);
        jct.update(sql1);
        return "insert db ok!";
    }

//    @GetMapping("/deletedb")
//    public String deleteUser(){
//        String sql = "delete from todolist where id in ('5','6')";
//        jct.update(sql);
//        return "delete users from db ok!";
//    }

//    @GetMapping("/updatedb")
//    public String updateUser(){
//        String sql = "update users set age = 5 where id in (5, 6)";
//        jct.update(sql);
//        return "update users in db set age 5 ok!";
//    }
}
