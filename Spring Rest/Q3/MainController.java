package com.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	@Autowired
	private ZipcodeService ZipcodeService;
	
	@GetMapping("/country")
	public List<Zipcode> findAll() {
		
		return ZipcodeService.findAll();
	}

	@GetMapping("/country/{zipcode}")
	public Zipcode getByZipcode(@PathVariable("zipcode") int zipcode) {
		
		return ZipcodeService.getByZipcode(zipcode);
		}
	
	

}
