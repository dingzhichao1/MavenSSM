package com.springboot.example.demo.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

public interface UserService{
	List<Map<String,Object>> getAllUser();
}
