package com.example.demo.ControllerTest.mapper;

import com.example.demo.DemoApplication;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import com.example.demo.Dao.todoDao;
import com.example.demo.service.entity.todo;

@SpringBootTest(classes = DemoApplication.class)
@ExtendWith(SpringExtension.class)
@EnableAutoConfiguration
@Configuration
@ComponentScan
public class todoDaoTest {

    @Autowired
    todoDao TodoDao;
    @Test
    public void TodoDaoTest() {
        String lineSeparator = System.lineSeparator();
        todo Todo = new todo();
        Todo.setOwnerid("wx_Aoi");
        Todo.setContent("do homework");
        Todo.setIsCompleted(0);
        Todo.setContentId("1");


        TodoDao.insertTodoThing(Todo.getOwnerid(), Todo.getContentId(),Todo.getContent(), 0);
        Assertions.assertEquals(Todo,TodoDao.findTodoById(Todo.getOwnerid()).get(0));
    }
}
