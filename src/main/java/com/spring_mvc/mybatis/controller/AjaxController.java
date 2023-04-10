package com.spring_mvc.mybatis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring_mvc.mybatis.service.ProductService;

@Controller
public class AjaxController {
	@Autowired
    ProductService service;
	
	@RequestMapping("/loginForm")
    public String loginForm(){
        return "ajax/loginForm";
    }
	/*
	@RequestMapping("/login")
	public String login(@RequestParam("user_id") String id,
						@RequestParam("user_pw") String pw) {
		String result = "";
		
		if(id.equals("abcd") && pw.equals("1234"))
			result = "success";
		else
			result = "fail";
		return result;
	}*/

	@ResponseBody
	@RequestMapping("/login")
	public String login(@RequestParam("id") String id,
						@RequestParam("pw") String pw) {
		String result = "";
		
		if(id.equals("abcd") && pw.equals("1234"))
			result = "success";
		else
			result = "fail";
		return result;
	}
	
	@RequestMapping("/loginForm2")
    public String loginForm2(){
        return "ajax/loginForm2";
    }
	
	
}
