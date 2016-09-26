package com.xsis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xsis.model.Employee;
import com.xsis.service.EmployeeService;

@Controller
@RequestMapping("/springcontroller")
public class MySpringController {

	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping(method=RequestMethod.GET)
	public String index(Model model){
	
		List<Employee> employees = employeeService.getAllEmplooyees();
		
		String username = "xsismitrautama";
		String password = "xsisgrahatunas";
		model.addAttribute("username", username);
		model.addAttribute("password", password);
		return "springview";
	}
	
}
