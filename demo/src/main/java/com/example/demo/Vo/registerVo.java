package com.example.demo.Vo;

import lombok.Data;

@Data
public class registerVo {

    private String identity;
    private String userName; //用户名
    private String avatarUrl; //头像地址
    private String sex;
    public registerVo(String identity, String userName, String avatarUrl, String sex) {
        this.identity = identity;
        this.userName = userName;
        this.avatarUrl = avatarUrl;
        this.sex = sex;
    }
}
