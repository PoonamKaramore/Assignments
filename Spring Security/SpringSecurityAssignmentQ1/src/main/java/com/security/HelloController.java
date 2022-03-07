package com.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {	
	
	@GetMapping("/")
	public String home() {
		return "Hello World";
	}
	
	@GetMapping("/Hello")
	public String admin() {
		return "Hello World";
	}

}
