package com.springboot.example.demo.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping(value="/page")
@Controller
public class PageController {
	@RequestMapping(value="/indexPage",method=RequestMethod.GET)
	public String indexPage(ModelAndView model){
		System.out.println("fffffffffffffffffffffffffffff");
		model.addObject("name","李寻欢");
		return "/demo.html";
	}
	
	
	@RequestMapping(value="/excepiton",method=RequestMethod.GET)
	public String excepiton(ModelAndView model){
		Map<String, Object> map =null;
		map.put("aaaa", 1);
		
		return "/demo.html";
	}
	
	
}
