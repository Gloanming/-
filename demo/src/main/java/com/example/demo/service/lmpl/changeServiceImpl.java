package com.example.demo.service.lmpl;

import com.example.demo.result.Result;
import com.example.demo.service.entity.tomatoClock;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Dao.tomatoDao;
import com.example.demo.Dao.todoDao;
import com.example.demo.Dao.UserDao;
import com.example.demo.service.changeService;
import com.example.demo.service.entity.user;
import com.example.demo.Vo.tomatoClockVo;
@Service
@Slf4j
public class changeServiceImpl implements changeService{
    @Autowired
    tomatoDao TomatoDao;
    @Autowired
    todoDao TodoDao;
    @Autowired
    UserDao userDao;


    user User;
    @Override
    public Result changeTomatoContent(tomatoClockVo TomatoClock) {
        TomatoDao.changeContentByUserIdAndContentId(TomatoClock.getUserId(),TomatoClock.getContent(), TomatoClock.getContentId());
        return Result.success("更改成功");
    }

    @Override
    public Result changeTomatoStatus(tomatoClockVo TomatoClock) {
        TomatoDao.changeStatusByTimeAndIdAndContentId(TomatoClock.getUserId(), TomatoClock.getContentId());
        return Result.success("更改状态成功");
    }

    @Override
    public Result changeTomatoTime(tomatoClockVo TomatoClock) {
        TomatoDao.updateTimeByIdAndContentId(TomatoClock.getUserId(),TomatoClock.getContentId(),TomatoClock.getTime());
        return Result.success("任务完成");
    }
}
