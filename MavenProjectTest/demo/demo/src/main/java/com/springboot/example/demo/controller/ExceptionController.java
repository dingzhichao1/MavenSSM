package com.springboot.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
/**
 * 异常Controller
 * 
 * @author DingZhichao
 *
 */
@ControllerAdvice
public class ExceptionController {
	
	/**
	 * 空指针异常信息处理方法
	 * @return
	 */
	@ResponseBody
	@ExceptionHandler(java.lang.NullPointerException.class)
	public Map<String,Object> infoNullException(){
		Map<String, Object> map = new HashMap<String,Object>();
		map.put("code", 101);
		map.put("msg", "空指针异常");
		return map;
		
		
	}
	
//	@ExceptionHandler(Exception.class)
//	public ModelAndView getModelAndView(Exception exception){
//		System.out.println("dddddddddddddddd");
//		ModelAndView modelAndView = new ModelAndView("error");
//		modelAndView.addObject("code", -500);
//		modelAndView.addObject("msg", "出错了。");
//		return modelAndView;
//		
//	}
	
	@ResponseBody
	@ExceptionHandler(Exception.class)
	public Map<String,Object> getModelAndView(Exception exception){
		System.out.println("。。。。");
		Map<String, Object> map = new HashMap<String,Object>();
		map.put("code", -1);
		map.put("msg", "出错啦。。");
		map.put("detail",exception.getMessage());
		return map;
		
	}
	

}
