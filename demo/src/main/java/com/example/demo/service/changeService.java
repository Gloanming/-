package com.example.demo.service;

import com.example.demo.result.Result;
import com.example.demo.service.entity.tomatoClock;
import com.example.demo.Vo.tomatoClockVo;
public interface changeService {
    Result changeTomatoContent(tomatoClockVo TomatoClockVo);

    Result changeTomatoStatus(tomatoClockVo TomatoClock);

    Result changeTomatoTime(tomatoClockVo TomatoClock);
}
