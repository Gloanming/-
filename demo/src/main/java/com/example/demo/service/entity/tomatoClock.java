package com.example.demo.service.entity;

import lombok.Data;

@Data
public class tomatoClock {

    public String ownerId; // 用户的openid
    public String contentId; // 专注做的事情也要有id标识
    public String content; // 要专注做的事情
    public int time; // 持续的时间
    public int isCompleted;
}
