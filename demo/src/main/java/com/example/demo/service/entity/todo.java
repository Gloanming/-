package com.example.demo.service.entity;

import lombok.Data;

@Data
public class todo {

    private String ownerid; // 所属人的ID
    private int isCompleted; // 完成为1，未完成为0
    private String ownerName;

    private String contentId;
    private String content; // todo字符串的的内容

}
