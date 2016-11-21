package com.abyssinia.mumScrum.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.OneToOne;

import com.abyssinia.mumScrum.enums.Role;

@Entity
public class Employee {

   @Id
   @GeneratedValue(strategy=GenerationType.AUTO)
 	private Long id;
	
   @Column(name= "firstName")
	private String firstName;
   
   @Column(name="lastName")
	private String lastName;
 
   @Column(name="age")
	private int age;
   
   @Column(name="title")
	private String title;
   
   @Column(name="employeeNumber")
	private Long employeeNumber;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="adddressid")
	private Address address;
	
	@Column(name= "username")
	private String username;
   
   @Column(name="password")
	private String password;
   
   //@Enumerated(EnumType.STRING)
	@Column(name = "role")
   	private String role;
   
   
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
 	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Long getEmployeeNumber() {
		return employeeNumber;
	}
	public void setEmployeeNumber(Long employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
   
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
				+ ", title=" + title + ", role="+role + "]";
	}
	
 
	
}
