package com.example.demo.service;

import com.example.demo.Vo.loginVo;
import com.example.demo.result.Result;
import com.example.demo.service.entity.user;
import com.example.demo.Vo.registerVo;
import com.example.demo.service.entity.todo;



public interface userService {
    Result add(user User);

    Result login(loginVo LoginVo);

    Result Register(registerVo RegisterVo);

    Result addTodoList(todo Todo);
}
