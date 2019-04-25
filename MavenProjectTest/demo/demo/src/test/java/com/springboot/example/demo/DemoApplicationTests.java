package com.springboot.example.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.springboot.example.demo.controller.DemoController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
		
		//System.out.println("ffffffffffff");
		
		//判断返回结果是否与预期结果一致
		assertEquals("Hello,World!",new DemoController().helloWorld());
	
	}

}
