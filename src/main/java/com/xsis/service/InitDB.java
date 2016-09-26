package com.xsis.service;

import java.util.Date;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xsis.dao.EmployeeDAOImpl;
import com.xsis.model.Employee;

@Service
@Transactional
public class InitDB {

	@Autowired
	private EmployeeDAOImpl employeeDao;
	
	public void init(){
		Employee emp = new Employee();
		emp.setEmail("arrizaqus@yahoo.com");
		emp.setFirstName("aldis");
		emp.setLastName("nugroho");
		emp.setSalary(5000.0);
		
		employeeDao.simpan(emp);
		System.out.println("tersimpan !!");
	}
}
