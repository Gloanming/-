package com.example.demo.ControllerTest;

import com.example.demo.Vo.loginVo;
import com.example.demo.result.Result;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import com.example.demo.controller.loginController;
@SpringBootTest
@ExtendWith(SpringExtension.class)
@EnableAutoConfiguration
@Configuration
@ComponentScan
public class LoginControllerTest {
    @Autowired
    loginController controller;

    @Test
    public void loginTest(){
        Result res = controller.login(new loginVo("wx1","dao","213412","boy"));
        Assertions.assertTrue(res.isFlag());
    }
}
