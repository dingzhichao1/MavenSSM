package com.springboot.example.demo.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
/**
 * 采用注解式来代替mapper.xml
 * 
 * @author DingZhichao
 *
 */
@Mapper//mapper类的注解
public interface UserMapper {
	/**
	 * 通过注解的方式进行Mapper的开发，与用xml的方式完全一致
	 * 
	 * @return
	 */
	@Select("select * from user")
	@ResultType(java.util.HashMap.class)
	List<Map<String,Object>> getAllUser();
	

}
