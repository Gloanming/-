package com.example.demo.Vo;

import lombok.Data;

@Data
public class todoVo {
    String ownerId;
    String Content;
    int status;
    String ContentId;
    public todoVo(String ownerid,String content,int statu,String Contentid){
        this.ownerId = ownerid;
        this.Content = content;
        this.status = statu;
        this.ContentId = Contentid;
    }
}
