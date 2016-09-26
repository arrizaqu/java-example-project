package com.xsis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.xsis.model.Pengembalian;
import com.xsis.service.PengembalianService;

@RestController
@RequestMapping("/restpengembalian")
public class RestPengembalian {

	@Autowired
	PengembalianService pengembalianService;
	
	@RequestMapping(value="/getall", method=RequestMethod.POST)
	public Pengembalian index(@RequestBody Pengembalian peng){
		//getAllpengembalian
		String noReq = peng.getNoRegistrasi();
		Pengembalian pengembalian = pengembalianService.
								findPengembalianByNoReferensi(noReq);
		
		return pengembalian;
	}
}
