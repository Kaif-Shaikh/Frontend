package com.pollatech.springbootcrud.dao;

import java.util.List;

import com.pollatech.springbootcrud.model.Employee;

public interface EmployeeDAO {
	
	public List<Employee> get();
	
	public Employee get(int id);
	
	public void save(Employee employee);
	
	public void delete(int id);

}
