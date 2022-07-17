package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping("hello")
	public String info(){
		return "hello lwn";
	}
	
	@RequestMapping("whl")
	public String whl(){
		return "不知道";
	}
}
