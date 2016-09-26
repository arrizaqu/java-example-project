package com.xsis.dao;

import java.sql.PreparedStatement;
import java.util.List;

import javax.activation.DataSource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xsis.model.Pengembalian;

@Repository
public class PengembalianDaoImpl implements PengembalianDao{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void insert(Pengembalian pengembalian) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.save(pengembalian);
	}

	@Override
	public List<Pengembalian> findAll() {
		// TODO Auto-generated method stub
		List<Pengembalian> pengembalians = 
				sessionFactory.getCurrentSession().
					createCriteria(Pengembalian.class).list();
		return pengembalians; 
	}

	@Override
	public Pengembalian findPengembalianByNoReferensi(String ref) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		
		Query query = session.createQuery("from Pengembalian p where p.noRegistrasi =:noRegistrasi");;
		query.setParameter("noRegistrasi",ref);
		List results = query.list();
		return (Pengembalian) results.get(0);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
