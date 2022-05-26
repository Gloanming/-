package com.example.demo.Dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Repository;
import com.example.demo.Vo.registerVo;
import com.example.demo.service.entity.user;
@Mapper
@Repository
public interface UserDao {
    void addUser(registerVo RegisterVo) throws DuplicateKeyException;//像数据库中添加用户
    user selectUserById(String Identity);

}
