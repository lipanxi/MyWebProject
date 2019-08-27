package com.lipanxi.controller;


import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alibaba.fastjson.JSONObject;
import com.lipanxi.service.TestService;

@Controller
@RequestMapping("/testController")
public class TestController {
	
	@Autowired
	@Qualifier("testService")
	public TestService testService;
	
	@RequestMapping( value="/test" , method = RequestMethod.GET )
	public Object test(Model model){
		Map<String,String> map = new HashMap<String,String>();
		map.put("one", "one");
		map.size();
		
		
		
		model.addAttribute("msg", testService.getUser().getAge());
		return "NewFile";
	}

	@RequestMapping( value="/user" , method = RequestMethod.GET )
	public Object user(Model model){
		
		JSONObject requestJson = new JSONObject();
		requestJson.put("1", "1");
		requestJson.put("2", "2");
		requestJson.put("3", "3");
		requestJson.put("4", "4");
		return requestJson;
	}
	
}
