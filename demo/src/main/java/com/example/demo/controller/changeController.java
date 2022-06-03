package com.example.demo.controller;

import com.example.demo.result.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.service.changeService;
import com.example.demo.Vo.tomatoClockVo;
@RestController
@RequestMapping
public class changeController {

    @Autowired
    private changeService ChangeService;

    @RequestMapping("/changeContent-Id-ContentId")
    public Result changeContentByIdAndContentId(@RequestBody tomatoClockVo Vo){
        Result result = ChangeService.changeTomatoContent(Vo);
        return result;
    }
    @RequestMapping("/changeStatus")
    public Result changeStatus(@RequestBody tomatoClockVo Vo){
        Result result = ChangeService.changeTomatoStatus(Vo);
        return result;
    }
    @RequestMapping("/changeTime")
    public Result changeTime(@RequestBody tomatoClockVo Vo){
        Result result = ChangeService.changeTomatoTime(Vo);
        return result;
    }
    

}
