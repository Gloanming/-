package com.example.demo.Dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import com.example.demo.service.entity.tomatoClock;
import java.util.List;

@Mapper
@Repository
public interface tomatoDao {
    void insertTomatoClock(String userId,String ContentId,String concentrateContent,int time,int status);
    void deleteTomatoClock(String userId,String ContentId);
    void changeContentByUserIdAndContentId(String userId,String Content,String ContentId);
    List<tomatoClock> FindByOwnerId(String ownerId);
}
