package com.example.service;

import java.util.List;

import com.example.base.BaseService;
import com.example.model.User;

public interface UserServer extends BaseService<User>{
	
	List<User> findAll();
}
