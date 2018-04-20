package com.gk.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.gk.model.User;

@Controller
public class TestController {
	
	private static Logger logger = LoggerFactory.getLogger(TestController.class);
	
	@RequestMapping("/")
	@ResponseBody
	public JSONObject test() {
		JSONObject json = new JSONObject();
		User user = new User();
		user.setId(1L);
		user.setName("高凯");
		user.setAge(31);
		logger.info(JSONObject.toJSONString(user));
		json.put("succ", true);
		json.put("msg", "成功");
		return json;
	}
	
}