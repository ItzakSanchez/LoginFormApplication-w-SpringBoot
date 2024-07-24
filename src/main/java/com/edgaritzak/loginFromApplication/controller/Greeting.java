package com.edgaritzak.loginFormApplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.stereotype.Controller;


@Controller
public class Greeting {
	
	
	@GetMapping("/")
	public String showIndex() {
		return "index";
	}
	
	@RequestMapping("/greetings")
	public String showGreetings() {
		return "greetings";
	}
	
	@GetMapping("/hello")
	@ResponseBody
	public String greeting() {
		return "Hello world";
	}
	
	@GetMapping("/customHello")
	@ResponseBody
	public String customGreeting(@RequestParam(value = "name") String name) {
		return "Hello"+name;
	}
}
