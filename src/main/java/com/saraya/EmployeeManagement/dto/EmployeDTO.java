package com.saraya.EmployeeManagement.dto;

import com.saraya.EmployeeManagement.entity.Employe;

public class EmployeDTO {
	
	private int id;
	private String lastName;
	private String firstName;
	private String address;
	private int salary;
	
	
	public EmployeDTO() {
		
	}


	public EmployeDTO(int id, String lastName, String firstName, String address, int salary) {
		super();
		this.id = id;
		this.lastName = lastName;
		this.firstName = firstName;
		this.address = address;
		this.salary = salary;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	public static Employe  prepareEmployeEntity(EmployeDTO employeDTO) {
		
		Employe employeEntity = new Employe();
		
		employeEntity.setId(employeDTO.getId());
		employeEntity.setFirstName(employeDTO.getFirstName());
		employeEntity.setLastName(employeDTO.getLastName());
		employeEntity.setAddress(employeDTO.getAddress());
		employeEntity.setSalary(employeDTO.getSalary());
		
		return employeEntity;
	}


	@Override
	public String toString() {
		return "Employe [id=" + id + ", lastName=" + lastName + ", firstName=" + firstName + ", address=" + address
				+ ", salary=" + salary + "]";
	}
	
	
	
}


