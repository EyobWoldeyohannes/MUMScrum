package com.packt.webstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
  
@Controller
public class HomeController {



	@RequestMapping("/")
	public String welcome(Model model) {
		
		model.addAttribute("greeting", "Welcome to our community, Esehak!!");
		model.addAttribute("tagline", "The one and only pace to live, work and play!!");
		
		return "welcome";
	}
	@RequestMapping("/welcome/greeting")
	public String greeting(){
		return "welcome";
	}
 
}
