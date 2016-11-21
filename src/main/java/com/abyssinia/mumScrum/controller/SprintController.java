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

import com.abyssinia.mumScrum.domain.Sprint;
import com.abyssinia.mumScrum.service.SprintService;

@Controller
@RequestMapping({ "/sprints" })
public class SprintController {

	@Autowired
	private SprintService sprintService;

	@RequestMapping(value = { "", "/list" })
	public String listsprints(Model model) {
		model.addAttribute("sprints", sprintService.findAll());

		return "sprint/sprints";
	}

	@RequestMapping("/sprint/{id}")
	public String getSprintByNumber(@PathVariable("id") Long id, Model model) {
		Sprint sprint = sprintService.getSprintByNumber(id);
		System.out.println(":::::::::dsfgsrgdsfg:::::::::::::::::::" + id);
		model.addAttribute("sprint", sprint);
		return "Sprint/sprint";
	}

	@RequestMapping(value = "/listByID", method = RequestMethod.GET)
	public String searchByName(Model model, @RequestParam("name") String resourceName) throws Exception {
		Sprint sprint = sprintService.findByName(resourceName);
		System.out.println(sprint);
		model.addAttribute("sprint", sprint);
		return "Sprint/sprint";
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String addNewsprint(@ModelAttribute("newSprint") Sprint newSprint) {
		return "sprint/addSprint";
	}

	@RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
	public String edit(@PathVariable("id") Long id, Model model) {
		Sprint sprint = sprintService.getSprintByNumber(id);
		model.addAttribute("sprint", sprint);
		System.out.println("Mine is Mine");
		return "Sprint/edit";
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public String delete(@PathVariable("id") Long id, Model model) {
		sprintService.delete(id);

		return "redirect:/sprints/list";
	}

	@RequestMapping(value = "/edit/update", method = RequestMethod.POST)
	public String update(@ModelAttribute("sprint") Sprint sprintToBeAdded) {
		System.out.println("Hello");
		sprintService.update(sprintToBeAdded);

		return "redirect:/sprints/list";

	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String processAddNewsprint(@Valid @ModelAttribute("newsprint") Sprint sprintToBeAdded, BindingResult result,
			HttpServletRequest request) {
		if (result.hasErrors()) {
			return "addsprint";

		}
		try {
			sprintService.save(sprintToBeAdded);
		} catch (Exception e) {
			System.out.println("Transaction FAILED");

		}

		return "redirect:/sprints/list";
	}

}
