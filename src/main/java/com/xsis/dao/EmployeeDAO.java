package com.xsis.dao;

import java.util.List;

import com.xsis.model.Employee;

public interface EmployeeDAO {
	
	public List<Employee> getAllEmployees();
	public Employee getEmployeeById(int id);
	public void save(Employee emp);

}
