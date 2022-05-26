package com.example.demo.service.entity;

import lombok.Data;

import java.util.List;
@Data
public class user {

    private String Identity; //openid
    private String userName; //用户名
    private String avatarUrl; //头像地址
    private String address; //"微信获取用户地址"
    private String sex; //value = "性别"

}
