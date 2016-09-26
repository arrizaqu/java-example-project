package com.xsis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xsis.model.Pengembalian;
import com.xsis.model.Person;
import com.xsis.service.PengembalianService;

@Controller
@RequestMapping("/pengembalian")
public class PengembalianContoller {

	@Autowired
	private PengembalianService pengembalianService;
	
	@RequestMapping
	@ResponseBody
	public String index(@RequestBody Pengembalian pengembalians){
		
		String id = pengembalians.getId()+ "";
		
		Pengembalian pengembalian = pengembalianService.findPengembalianByNoReferensi(id);
		//System.out.println("name : "+ pengembalian.getNoRegistrasi());
		return pengembalian.getNoRegistrasi();
	}
	
	//controller
	@RequestMapping(value = "/ajax", 
					method= RequestMethod.GET )
	public String serverPage(){
		return "ajax_page";
	}
	
	//server source data
	@RequestMapping(value = "/data", 
							method=RequestMethod.POST )
	@ResponseBody
	public Person sourceData(@RequestBody Person person){
		
		System.out.println("name : "+ person.getUsername());
		System.out.println("password : "+ person.getPassword());
		System.out.println("id : "+ person.getId());
		
		/*
		 personService.save(person);
		 * */
		return person;
	}
	
	
}
