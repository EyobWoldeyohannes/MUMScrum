package com.abyssinia.mumScrum.repository;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.abyssinia.mumScrum.domain.Employee;

	@Repository
	public interface EmployeeRepository extends  CrudRepository<Employee, Long> 
	{
		@Query("select e from Employee  e where e.employeeNumber= :employeeNumber")
		public Employee locateOneEmployeeByHisNumber(@Param("employeeNumber") Long employeeNumber);

		
		@Query("select e from Employee  e where e.firstName= :firstName")
		public Employee locateOneEmployeebyHisFirstName(@Param("firstName") String firstName);
		
	
	}
	
	