package com.abyssinia.mumScrum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
  
@Controller
public class HomeController {


//added some new stuffs
	
	@RequestMapping("/")
	public String welcome(Model model) {
		
		model.addAttribute("greeting", "MumScrum");
		model.addAttribute("tagline", "The one and only pace to live, work and play!!");
		
		return "welcome";
	}
	@RequestMapping("/welcome/greeting")
	public String greeting(){
		return "welcome";
	}
	
}
