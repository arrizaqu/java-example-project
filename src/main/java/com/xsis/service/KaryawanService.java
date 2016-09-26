package com.xsis.service;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.xsis.dao.KaryawanDao;
import com.xsis.model.Karyawan;

@Service
@Transactional
public class KaryawanService {

	@Autowired
	private KaryawanDao karyawanDao;
	
	public void init(){
		Karyawan kar = new Karyawan();
		kar.setId("satu");
		kar.setName("rins");
		kar.setEmail("rinos@yahoo.com");
		kar.setAddress("kalianda");
		karyawanDao.save(kar);
	}
	
	public void saveOrUpdate(Karyawan kar){
		karyawanDao.save(kar);
	}
	
	public List<Karyawan> getAllKaryawan(){
		List<Karyawan> karyawans = karyawanDao.getAllKaryawan(); 
		return karyawans;
	}
	
	public Karyawan getKaryawanById(Karyawan kar){
		return karyawanDao.getKaryawanById(kar);
	}
}
