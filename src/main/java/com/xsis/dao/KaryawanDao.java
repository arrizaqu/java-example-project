package com.xsis.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.xsis.model.Karyawan;

@Repository
public class KaryawanDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void save(Karyawan kar){
		currentSession().saveOrUpdate(kar);
	}

	public List<Karyawan> getAllKaryawan() {
		// TODO Auto-generated method stub
		//optional : List<Products> products  = (List<Products>) session.createQuery("from Products").list();
		List<Karyawan> kars = currentSession().createCriteria(Karyawan.class).list();
		return kars;
	}
	
	public void delete(Karyawan kar){
		currentSession().delete(kar);
	}
	
	public Karyawan getKaryawanById(Karyawan kar){
		Karyawan sing = currentSession().get(Karyawan.class, kar.getId());	
		return sing;
	}
	
	public Session currentSession(){
		return sessionFactory.getCurrentSession();
	}

}
