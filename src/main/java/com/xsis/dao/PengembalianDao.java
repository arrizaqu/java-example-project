package com.xsis.dao;

import java.util.List;

import com.xsis.model.Pengembalian;

public interface PengembalianDao {

	//create
	public void insert(Pengembalian pengembalian);
	// read
	public List<Pengembalian> findAll();
	// read by refferency
	public Pengembalian findPengembalianByNoReferensi(String ref);
	// update
	public void delete(int id);
	// delete
}
