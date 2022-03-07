package com.mysql;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {
	
	@GetMapping("/")
	public String home() {
		return "Hello";
	}
	
	@GetMapping("/admin")
	public String admin() {
		return "Hello Admin";
	}
	
	@GetMapping("/user")
	public String user() {
		return "Hello User";
	}
	

}
