package com.situ.mall.service;

import java.util.List;

import com.situ.mall.common.ServerResponse;
import com.situ.mall.entity.User;
public interface IUserService {
	
	ServerResponse<User> login(String username,String password);
	ServerResponse<List<User>> pageList(Integer page,Integer limit);
}
