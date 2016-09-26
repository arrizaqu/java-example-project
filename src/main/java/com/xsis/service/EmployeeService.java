package com.xsis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xsis.dao.EmployeeDAO;
import com.xsis.model.Employee;

@Service
@Transactional
public class EmployeeService {

	@Autowired
	EmployeeDAO emplooyeeDao;
	
	public List<Employee> getAllEmplooyees(){
		return emplooyeeDao.getAllEmployees();
	}
	
	public void save(Employee employee){
		emplooyeeDao.save(employee);
	}
}
