package com.springboot.example.demo.service.imp;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.example.demo.mapper.UserMapper;
import com.springboot.example.demo.service.FatherService;
import com.springboot.example.demo.service.UserService;
@Service
public class UserServiceImp implements UserService,FatherService{
	
	@Autowired
	private UserMapper userMapper;
	
	public List<Map<String,Object>> getAllUser(){
		
		
		return userMapper.getAllUser();
//		return new ArrayList<Map<String,Object>>();
		
		
	}

	@Override
	public void getFather() {
		System.out.println("who is your father?");
		
	}
	

}
