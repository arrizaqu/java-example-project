package com.xsis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.portlet.ModelAndView;

import com.xsis.model.Karyawan;
import com.xsis.service.InitDB;
import com.xsis.service.KaryawanService;

@Controller
@RequestMapping("/mycontroller")
public class SpringController {

	@Autowired
	private KaryawanService karyawanService;
	@Autowired
	private InitDB initDb;
	
	@RequestMapping
	public String index(Model model){
		List<Karyawan> kars = karyawanService.getAllKaryawan();
		Karyawan wan = new Karyawan();
		wan.setId("dua");
		Karyawan selectKar = karyawanService.getKaryawanById(wan);
		
		model.addAttribute("kars", kars);
		
		return "karyawan";
	}
	
	@RequestMapping("/init")
	@ResponseBody
	public void initDb(){
		initDb.init();
	}
}
