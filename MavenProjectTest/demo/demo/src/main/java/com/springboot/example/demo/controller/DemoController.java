package com.springboot.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


/**
 * spring中的开发模式与spring中的开发模式类是，注解也相同
 * 
 * @author DingZhichao
 *
 */
@RequestMapping("/Demo")
@RestController
public class DemoController {
	
	/*@Value("${msg}")*/
	private String msg;
	
	/**
	 * 把配置文件中值注入到该变量中
	 */
	@Value("${province.city1}")
	private String city;
	
	@RequestMapping("showDemo")
	public Map<String,Object> showDemo(){
		HashMap<String, Object> map = new HashMap<String,Object>();
		map.put("username", "李寻欢");
		map.put("age", "45");
		return map;
	}
	
	public String helloWorld(){
		
		return "ssssss";
		
	}
	
	
	
	
	
	@RequestMapping(value="getMsg")
	public Map<String,Object> getMsg(){
		HashMap<String, Object> map = new HashMap<String,Object>();
		map.put("msg",msg);
		map.put("city",city);
		return map;
		
	}
	
	
	/*@RequestMapping(value = "/api/city/{id}", method = RequestMethod.GET)
    public City findOneCity(@PathVariable("id") Long id) {
        return cityService.findCityById(id);
    }
    @RequestMapping(value = "/api/city", method = RequestMethod.GET)
    public List<City> findAllCity() {
        return cityService.findAllCity();
    }
    @RequestMapping(value = "/api/city", method = RequestMethod.POST)
    public void createCity(@RequestBody City city) {
        cityService.saveCity(city);
    }
    @RequestMapping(value = "/api/city", method = RequestMethod.PUT)
    public void modifyCity(@RequestBody City city) {
        cityService.updateCity(city);
    }
    @RequestMapping(value = "/api/city/{id}", method = RequestMethod.DELETE)
    public void modifyCity(@PathVariable("id") Long id) {
        cityService.deleteCity(id);
    }*/
	
	
}
