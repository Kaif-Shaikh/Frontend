package com.pollatech.springbootcrud.service;

import java.util.List;

import com.pollatech.springbootcrud.model.Employee;

public interface EmployeeService {
	
	public List<Employee> get();
	
	public Employee get(int id);
	
	public void save(Employee employee);
	
	public void delete(int id);

}
