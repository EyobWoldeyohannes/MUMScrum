package com.abyssinia.mumScrum.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.abyssinia.mumScrum.domain.UserStory;
import com.abyssinia.mumScrum.service.UserStoryService;



@Controller
@RequestMapping({ "/userStories" })
public class UserStoryController {

	@Autowired
	private UserStoryService userStoryService;

	@RequestMapping(value = { "", "/list" })
	public String listuserStories(Model model) {
		model.addAttribute("userStories", userStoryService.findAll());

		return "userStories";
	}


	
	@RequestMapping(value = "/listByID", method = RequestMethod.GET)
	public String searchByName(Model model, @RequestParam("name") String resourceName) throws Exception {
		UserStory userStory = userStoryService.findByName(resourceName);
		System.out.println(userStory);
		model.addAttribute("userStory", userStory);
		return "userStory";
	}
	

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String addNewuserStory(@ModelAttribute("newUserStory") UserStory newUserStory) {
		return "adduserStory";
	}
	@RequestMapping(value = "/edit/{id}", method= RequestMethod.GET)
	public String edit(@PathVariable("id") Long id, Model model){
		UserStory userStory=userStoryService.getUserStoryByNumber(id); 
		model.addAttribute("userStory", userStory);
		System.out.println("Mine is Mine");
		return "edit";
	}
	
	@RequestMapping(value = "/delete/{id}", method= RequestMethod.GET)
	public String delete(@PathVariable("id") Long id, Model model){
		userStoryService.delete(id); 
		
		return "redirect:/userStories/list";
	}
	
	
	@RequestMapping(value= "/edit/update", method= RequestMethod.POST)
	public String update(@ModelAttribute("userStory") UserStory userStoryToBeAdded){
		System.out.println("Hello");
		userStoryService.update(userStoryToBeAdded);

		return "redirect:/userStories/list";
		
		
		
	}
	
	
//	@RequestMapping(value = "/update", method = RequestMethod.POST)
//	public String update(@Valid @ModelAttribute("newuserStory") userStory userStoryToBeAdded,
//			BindingResult result, HttpServletRequest request) {
//		if (result.hasErrors()) {
//			return "edit";
//
//		}
//		try {
//			userStorieservice.save(userStoryToBeAdded);
//		} catch (Exception e) {
//			System.out.println("Transaction FAILED");
//
//		}
//
//		return "redirect:/userStories/userStory";
//	}
	
	
	
	
	

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String processAddNewuserStory(@Valid @ModelAttribute("newuserStory") UserStory userStoryToBeAdded,
			BindingResult result, HttpServletRequest request) {
		if (result.hasErrors()) {
			return "adduserStory";

		}
		try {
			userStoryService.save(userStoryToBeAdded);
		} catch (Exception e) {
			System.out.println("Transaction FAILED");

		}

		return "redirect:/userStories/list";
	}

}
