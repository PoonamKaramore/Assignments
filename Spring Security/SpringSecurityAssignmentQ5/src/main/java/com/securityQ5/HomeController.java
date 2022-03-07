package com.securityQ5;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/")
	public String login() {
		return "WElCOME";
	}
	
	@GetMapping("/admin")
	public String hello() {
		return "Hello World!!!";
	}
}
