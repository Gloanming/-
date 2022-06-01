package com.example.demo.service;

import com.example.demo.Vo.loginVo;
import com.example.demo.result.Result;
import com.example.demo.service.entity.user;
import com.example.demo.Vo.registerVo;
import com.example.demo.service.entity.todo;
import com.example.demo.service.entity.tomatoClock;


public interface userService {
    Result add(user User);

    Result login(loginVo LoginVo);

    Result Register(registerVo RegisterVo);

    Result addTodoList(todo Todo);

    Result deleteTodoList(todo Todo);

    Result addTomatoClock(tomatoClock TomatoClock);

    Result deleteTomatoClock(tomatoClock TomatoClock);



}
