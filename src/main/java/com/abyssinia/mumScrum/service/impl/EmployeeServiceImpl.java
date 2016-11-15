package com.abyssinia.mumScrum.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.abyssinia.mumScrum.domain.Employee;
import com.abyssinia.mumScrum.repository.EmployeeRepository;
import com.abyssinia.mumScrum.service.EmployeeService;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService  {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void save(Employee employee) {
		employeeRepository.save(employee);
		
	}

	@Override
	public List<Employee> findAll() {
		return (List<Employee>)employeeRepository.findAll();
	}

	@Override
	public Employee getEmployeeByNumber (Long employeeNumber) {
		return employeeRepository.locateOneEmployeeByHisNumber(employeeNumber);
	}

	@Override
	public Employee findByName(String employeeFirstName) {
		// TODO Auto-generated method stub
		return employeeRepository.locateOneEmployeebyHisFirstName(employeeFirstName);
	}

	@Override
	public void update(Employee employee) {
		 employeeRepository.save(employee);
		
		
	}

	@Override
	public void delete(Long id) {
		employeeRepository.delete(id);;
		
	}
	
}
