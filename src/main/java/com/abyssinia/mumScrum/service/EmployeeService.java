package com.abyssinia.mumScrum.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.abyssinia.mumScrum.domain.Employee;


public interface EmployeeService {

	public void save(Employee employee);
	public List<Employee> findAll();
	public Employee getEmployeeByNumber (Long id);
	public Employee findByName(String resourceName);
	public void update(Employee employee);
	public void delete(Long id);
	
	
}