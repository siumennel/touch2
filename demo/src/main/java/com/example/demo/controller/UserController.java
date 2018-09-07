package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.FormatterModel;
import com.example.demo.model.User;

@Controller
public class UserController {
	@RequestMapping("/user/save")
	public String save(User user) {
		user.setName("U love me");
		return "user";
	}
	
	@RequestMapping(value = "/format1")  
	public String test1(@ModelAttribute("model") FormatterModel formatModel) {  
	    return "format/success";  
	}  
}
