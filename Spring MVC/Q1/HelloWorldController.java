package com.AssignmentQ1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
	
	@RequestMapping(path="/index" , method=RequestMethod.GET)
	public ModelAndView index() {
		
		ModelAndView model=new ModelAndView("index");
		
		return model;
	}
	
	@RequestMapping(path="/Helloworld" , method=RequestMethod.GET)
	public ModelAndView Helloworld() {
		
		ModelAndView model=new ModelAndView("HelloWorld");
		
		return model;
	}


}
