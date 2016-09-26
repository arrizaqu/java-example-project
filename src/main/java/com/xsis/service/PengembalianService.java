package com.xsis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xsis.dao.PengembalianDao;
import com.xsis.model.Pengembalian;

@Service
@Transactional
public class PengembalianService {

	@Autowired
	PengembalianDao pengembalianDao;
	
	public Pengembalian findPengembalianByNoReferensi(String ref){
		return pengembalianDao.findPengembalianByNoReferensi(ref);
		
	}
}
