package com.example.demo.controller;

import com.example.demo.result.Result;
import com.example.demo.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Dao.todoDao;
import com.example.demo.Vo.loginVo;
import com.example.demo.Vo.registerVo;
import com.example.demo.service.entity.todo;
import com.example.demo.Vo.HasTodoVo;
import java.util.List;
import com.example.demo.service.entity.tomatoClock;
import com.example.demo.Vo.tomatoClockVo;

@RequestMapping
@RestController
public class loginController {

    @Autowired
    private userService userService;
    @Autowired
    private todoDao tododao;

    @RequestMapping("/login")
    public Result login(@RequestBody loginVo LoginVo){
        Result result = userService.login(LoginVo);
        return result;
    }
    @RequestMapping("/register")

    public Result register(@RequestBody registerVo RegisterVo){
        Result result = userService.Register(RegisterVo);
        return result;
    }

    @RequestMapping("/TodoList")
    public Result todoListInfo(@RequestBody todo Todo){
        Result result = userService.addTodoList(Todo);
        return result;
    }
    @RequestMapping("/hasTodo")
    public List<todo> hasTodo(@RequestBody HasTodoVo id){
        List<todo> todoThing = tododao.findTodoById(id.getIdentity());
        return todoThing;
    }
   @RequestMapping("/deleteTodo")
    public Result deleteTodo(@RequestBody todo Todo){
        Result result = userService.deleteTodoList(Todo);
        return result;
   }
   @RequestMapping("/addTomatoClock")
    public Result tomatoClockInfo(@RequestBody tomatoClock TomatoClock){
        Result result = userService.addTomatoClock(TomatoClock);
        return result;
   }

   @RequestMapping("/deleteTomatoClock")
    public Result deleteClock(@RequestBody tomatoClock TomatoClock){
        Result result = userService.deleteTomatoClock(TomatoClock);
        return result;
   }

}
