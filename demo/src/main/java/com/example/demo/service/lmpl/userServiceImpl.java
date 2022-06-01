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
import com.example.demo.service.entity.tomatoClock;
import com.example.demo.Dao.tomatoDao;
@Service
@Slf4j
public class userServiceImpl implements userService {
    @Autowired
    UserDao userDao;
    @Autowired
    todoDao TodoDao;
    @Autowired
    tomatoDao TomatoDao;
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

    @Override
    public Result addTomatoClock(tomatoClock TomatoClock){

        TomatoDao.insertTomatoClock(TomatoClock.getOwnerId(),TomatoClock.getContentId(),TomatoClock.getContent(),TomatoClock.getTime(),0);
        return Result.success("添加成功");
    }
    @Override
    public Result deleteTodoList(todo Todo){
        TodoDao.deleteByOwnerIdAndContentId(Todo.getOwnerid(),Todo.getContentId());
        return Result.success("删除成功");
    }
    @Override
    public Result deleteTomatoClock(tomatoClock TomatoClock) {
        TomatoDao.deleteTomatoClock(TomatoClock.getOwnerId(),TomatoClock.getContentId());
        return Result.success("删除成功");

    }
}
