package com.AssignmentQ2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Controllerclas {
	
	 @RequestMapping(path = "/home",method = RequestMethod.GET)
	public String index() {
		 return "simpleinterest";
	 }
	
    @RequestMapping(path = "/simpleinterest",method = RequestMethod.POST)
    public String simpleInterest(@RequestParam("principal")int principal,
                                 @RequestParam("rate") int rate,
                                 @RequestParam("time")int time,
                                 Model model){

        int si = (principal*time*rate)/100;

        model.addAttribute("simpleinterest",si);
        return "simpleinterest";
    }
}

