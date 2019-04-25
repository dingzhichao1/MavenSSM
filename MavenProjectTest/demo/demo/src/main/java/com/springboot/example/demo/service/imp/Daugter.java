package com.springboot.example.demo.service.imp;

import org.springframework.stereotype.Service;

import com.springboot.example.demo.service.FatherService;
@Service("daughter")
public class Daugter implements FatherService {

	@Override
	public void getFather() {
		System.out.println("这是女儿的父亲啊");

	}

}
