package com.example.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;

import com.example.base.BaseDao;
import com.example.model.User;

@Mapper
public interface UserDao extends BaseDao<User>{
    
    List<User> findAll();
}