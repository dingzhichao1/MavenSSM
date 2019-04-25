package com.springboot.example.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.example.demo.service.FatherService;
import com.springboot.example.demo.service.UserService;
import com.springboot.example.demo.service.imp.UserServiceImp;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired																																			
	private UserService userService ;
 	
	@Autowired
	@Qualifier("daughter")//该接口的实现类不止一个时就会造成混乱，所以需要该注解指明实现类
	private FatherService  fatherService;
	
	
	@RequestMapping(value="getAllUser")
	public Map<String,Object> getAllUser(){
		HashMap<String, Object> map = new HashMap<String,Object>();
		List<Map<String, Object>> list = userService.getAllUser();
		map.put("list", list);
		map.put("count",list.size());
		return map;
	}
	
	@RequestMapping(value="getFather")
	public void getFather(){
		 fatherService.getFather();
	}

}
