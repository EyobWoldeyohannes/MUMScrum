package com.abyssinia.mumScrum.controller;

import java.util.List;
import java.util.Map;

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

import com.abyssinia.mumScrum.domain.Release;
import com.abyssinia.mumScrum.service.ReleaseService;


@Controller
@RequestMapping({ "/releases" })
public class ReleaseController {

	@Autowired
	private ReleaseService releaseService;

	@RequestMapping(value = { "", "/list" })
	public String listRelease(Model model) {
		model.addAttribute("releases", releaseService.findAll());

		return "/release/releases";
	}

	@RequestMapping("/release/{id}")
	public String getReleaseByNumber(@PathVariable("id") Long id, Model model) {
		Release release = releaseService.getReleaseByNumber(id);
		System.out.println(":::::::::release by ID:::::::::::::::::::" + id);
		model.addAttribute("release", release);
		return "/release/release";
	}
	
	@RequestMapping(value = "/listByID", method = RequestMethod.GET)
	public String searchByName(Model model, @RequestParam("name") String resourceName) throws Exception {
		Release release = releaseService.findByName(resourceName);
		System.out.println(release);
		model.addAttribute("employee", release);
		return "/release/release";
	}
	

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String addNewRelease(@ModelAttribute("newRelease") Release newRlease) {
		return "/release/addRelease";
	}
	@RequestMapping(value = "/edit/{id}", method= RequestMethod.GET)
	public String edit(@PathVariable("id") Long id, Model model){
		Release release=releaseService.getReleaseByNumber(id); 
		model.addAttribute("release", release);
		return "/release/edit";
	}
	
	@RequestMapping(value = "/delete/{id}", method= RequestMethod.GET)
	public String delete(@PathVariable("id") Long id, Model model){
		releaseService.delete(id); 
		
		return "redirect:/releases/list";
	}
	
	
	@RequestMapping(value= "/edit/update", method= RequestMethod.POST)
	public String update(@ModelAttribute("release") Release releaseToBeAdded){
		releaseService.update(releaseToBeAdded);

		return "redirect:/releases/list";
		
		
		
	}
	
	

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String processAddNewRelease(@Valid @ModelAttribute("newRelease") Release releaseToBeAdded,
			BindingResult result, HttpServletRequest request) {
		if (result.hasErrors()) {
			return "addRelease";

		}
		try {
			releaseService.save(releaseToBeAdded);
		} catch (Exception e) {
			System.out.println("Transaction FAILED");

		}

		return "redirect:/releases/list";
	}
	

}
