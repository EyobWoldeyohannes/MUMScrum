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

import com.abyssinia.mumScrum.domain.Employee;
import com.abyssinia.mumScrum.service.EmployeeService;


@Controller
@RequestMapping({ "/employees" })
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(value = { "", "/list" })
	public String listEmployees(Model model) {
		model.addAttribute("employees", employeeService.findAll());

		return "/employee/employees";
	}

	@RequestMapping("/employee/{id}")
	public String getEmployeeByNumber(@PathVariable("id") Long id, Model model) {
		Employee employee = employeeService.getEmployeeByNumber(id);
		System.out.println(":::::::::dsfgsrgdsfg:::::::::::::::::::" + id);
		model.addAttribute("employee", employee);
		return "/employee/employee";
	}
	
	@RequestMapping(value = "/listByID", method = RequestMethod.GET)
	public String searchByName(Model model, @RequestParam("name") String resourceName) throws Exception {
		Employee employee = employeeService.findByName(resourceName);
		System.out.println(employee);
		model.addAttribute("employee", employee);
		return "/employee/employee";
	}
	

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String addNewEmployee(@ModelAttribute("newEmployee") Employee newEmployee) {
		return "/employee/addEmployee";
	}
	@RequestMapping(value = "/edit/{id}", method= RequestMethod.GET)
	public String edit(@PathVariable("id") Long id, Model model){
		Employee employee=employeeService.getEmployeeByNumber(id); 
		model.addAttribute("employee", employee);
		//System.out.println("Mine is Mine");
		return "/employee/edit";
	}
	
	@RequestMapping(value = "/delete/{id}", method= RequestMethod.GET)
	public String delete(@PathVariable("id") Long id, Model model){
		employeeService.delete(id); 
		
		return "redirect:/employees/list";
	}
	
	
	@RequestMapping(value= "/edit/update", method= RequestMethod.POST)
	public String update(@ModelAttribute("employee") Employee employeeToBeAdded){
		System.out.println("Hello");
	employeeService.update(employeeToBeAdded);

		return "redirect:/employees/list";
	}
	
	
//	@RequestMapping(value = "/update", method = RequestMethod.POST)
//	public String update(@Valid @ModelAttribute("newEmployee") Employee employeeToBeAdded,
//			BindingResult result, HttpServletRequest request) {
//		if (result.hasErrors()) {
//			return "edit";
//
//		}
//		try {
//			employeeService.save(employeeToBeAdded);
//		} catch (Exception e) {
//			System.out.println("Transaction FAILED");
//
//		}
//
//		return "redirect:/employees/employee";
//	}
	
	
	
	
	

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String processAddNewEmployee(@Valid @ModelAttribute("newEmployee") Employee employeeToBeAdded,
			BindingResult result, HttpServletRequest request) {
		if (result.hasErrors()) {
			return "addEmployee";

		}
		try {
			employeeService.save(employeeToBeAdded);
		} catch (Exception e) {
			System.out.println("Transaction FAILED");

		}

		return "redirect:/employees/list";
	}
	
	@RequestMapping(value = "/login", method= RequestMethod.GET)
	public String loginPage(@Valid @ModelAttribute("employee") Employee employeeLogin){
		
		return "/employee/login";
	}
	
	@RequestMapping(value= "/login2", method= RequestMethod.POST)
	public String processLogin(@Valid @ModelAttribute("employee") Employee employeeLogin, BindingResult result, HttpServletRequest request){
		if (result.hasErrors()) {
			return "/employee/login";
		} else {
			boolean found = employeeService.findByLogin(employeeLogin.getUsername(), employeeLogin.getPassword());
			String role = employeeService.getRole(employeeLogin.getUsername());
			
			if (found) {	
				if(role.equalsIgnoreCase("ADMIN")){
					return "/employee/adminHome";
				}
				else if(role.equalsIgnoreCase("OWNER")){
					return "/employee/ownerHome";
				}
				else{
				return "/employee/success";
				}
			} else {				
				return "/employee/failure";
			}
		}
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(@Valid @ModelAttribute("employeeLogin") Employee employeeLogin, BindingResult result, HttpServletRequest request) {
		if (result.hasErrors()) {
			return "/employee/login";
		} else {
			boolean found = employeeService.findByLogin(employeeLogin.getUsername(), employeeLogin.getPassword());
			if (found) {	
				if(employeeLogin.getRole().equalsIgnoreCase("ADMIN")){
					return "/employee/adminHome";
				}
				else if(employeeLogin.getRole().equalsIgnoreCase("OWNDER")){
					return "/employee/ownerHome";
				}
				else{
				return "/employee/success";
				}
			} else {				
				return "/employee/failure";
			}
		}
		
	}

}
