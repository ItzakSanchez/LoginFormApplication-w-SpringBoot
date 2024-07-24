package com.edgaritzak.loginFormAplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Greeting {
	
	@GetMapping("/hello")
	public String greeting() {
		return "Hello world";
	}
	
	@GetMapping("/customHello")
	public String customGreeting(@RequestParam(value = "name") String name) {
		return "Hello"+name;
	}
}
