package com.example.demo.mapper;

import com.example.demo.Dao.UserDao;
import com.example.demo.DemoApplication;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import com.example.demo.Vo.registerVo;

@SpringBootTest (classes = DemoApplication.class)
@ExtendWith(SpringExtension.class)
@EnableAutoConfiguration
@Configuration
@ComponentScan
public class UserDaoTest {
    @Autowired
    UserDao userDao;
    @Test
    public void addUserTest(){
        registerVo RegisterVo = new registerVo("as","asd","asd","boy");
        userDao.addUser(RegisterVo);
    }
    @Test
    public void SelectUserByIdTest(){
        System.out.println(userDao.selectUserById("wx1"));
    }
}
