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

@RequestMapping("/user")
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
    @RequestMapping("TodoList")
    public Result todoListInfo(@RequestBody todo Todo){
        Result result = userService.addTodoList(Todo);
        return result;
    }
    @RequestMapping("/hasTodo")
    public List<todo> hasTodo(@RequestBody HasTodoVo id){
        List<todo> todoThing = tododao.findTodoByIdAndContent(id.getIdentity(),id.getContent());
        return todoThing;
    }

}
