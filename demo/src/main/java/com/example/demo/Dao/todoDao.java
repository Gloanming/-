package com.example.demo.Dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import com.example.demo.service.entity.todo;
import java.util.List;
import org.springframework.dao.DuplicateKeyException;
@Mapper
@Repository
public interface todoDao {
    void insertTodoThing(String id, String todoContentId,String todoContent, int status) throws DuplicateKeyException;
    List<todo> findTodoById(String ownerId);

    void deleteByOwnerIdAndContentId(String ownerId, String ContentId);

    void ChangeContentByOwnerIDAndContentId(String ownerId, String ContentId,String todoContent);

}
