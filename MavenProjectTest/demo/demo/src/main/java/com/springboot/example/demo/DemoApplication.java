package com.springboot.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
/**
 * @SpringBootApplication 是springboot中启动类的注解，被以下三个注解所修饰
	 * 	@SpringBootConfiguration  关于通过bean来的代替配置
	 * 		@Configuration  通过bean来代替xml
		@EnableAutoConfiguration  自动配置初始环境
		@ComponentScan	对于实体类进行扫描代替原来的<context component:scan>
	
	
 * 
 * @author DingZhichao
 *
 */
@SpringBootApplication
@MapperScan("com.springboot.example.demo.mapper")
//该注解用于解决Mapper类的路径，但是必须到Mapper对应的包，否则会导致其他的接口无法被注入
//com.springboot.example.demo
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
