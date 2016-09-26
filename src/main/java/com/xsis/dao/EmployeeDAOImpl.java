package com.xsis.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xsis.model.Employee;

@Repository
public class EmployeeDAOImpl implements Serializable, EmployeeDAO{

	@Autowired
	SessionFactory sessionFactory;
	
	//save
	public void simpan(Employee emp){
		sessionFactory.getCurrentSession().save(emp);
	}
	
	//getAllData
	public List<Employee> getAllEmployees(){
		return (List<Employee>) sessionFactory.
		getCurrentSession().createCriteria(Employee.class).list();
	}

	@Override
	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Employee emp) {
		// TODO Auto-generated method stub
		
	}
	
	
}
