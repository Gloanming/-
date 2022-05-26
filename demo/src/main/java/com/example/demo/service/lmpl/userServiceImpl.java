package com.example.demo.service.lmpl;

import com.example.demo.Dao.UserDao;
import com.example.demo.service.userService;
import com.example.demo.service.entity.todo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Dao.todoDao;
import com.example.demo.service.entity.user;
import com.example.demo.result.Result;
import com.example.demo.Vo.loginVo;
import com.example.demo.Vo.registerVo;
import org.springframework.dao.DuplicateKeyException;
@Service
@Slf4j
public class userServiceImpl implements userService {
    @Autowired
    UserDao userDao;
    @Autowired
    todoDao TodoDao;
    user User;
    @Override
    public Result add(user person) {
        return null;
    }
    @Override
    public Result login(loginVo LoginVo){
        User = userDao.selectUserById(LoginVo.getIdentity());
        if (User == null){
            //新用户
            return Result.fail("新用户");
        }else{
            //老用户
            return Result.success("用户:"+ User.getIdentity()+"登录");
        }

    }

    @Override
    public Result Register(registerVo RegisterVo){
        try{
            userDao.addUser(RegisterVo);
            return Result.success("注册成功");
        } catch (DuplicateKeyException e) {
            e.printStackTrace();
            return Result.fail("用户openid已经存在");
        }
    }

    @Override
    public Result addTodoList(todo Todo){
        TodoDao.insertTodoThing(Todo.getOwnerid(),Todo.getContentId(),Todo.getContent(),1);
        return Result.success("添加成功");
    }

}
