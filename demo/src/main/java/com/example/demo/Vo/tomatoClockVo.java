package com.example.demo.Vo;

import lombok.Data;

@Data
public class tomatoClockVo {
    String userId;
    String ContentId;
    String Content;
    int isCompleted;
    int time = 25;
    public tomatoClockVo(String userId,String contentId, String Content,int isCompleted,int time){
        this.userId = userId;
        this.ContentId = contentId;
        this.Content = Content;
        this.isCompleted = isCompleted;
        this.time = time;
    }
}
