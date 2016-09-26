package com.xsis.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Pengembalian implements Serializable{

	@javax.persistence.Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, 
	generator="course2_seq")
		@SequenceGenerator(
		name="course2_seq",
		sequenceName="course_sequence"
		)
	private int Id;
	@Column(name="no_registrasi", unique=true)
	private String noRegistrasi;
	@ManyToOne
	@JoinColumn(name="id_anggota")
	private Anggota anggota;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getNoRegistrasi() {
		return noRegistrasi;
	}
	public void setNoRegistrasi(String noRegistrasi) {
		this.noRegistrasi = noRegistrasi;
	}
	public Anggota getAnggota() {
		return anggota;
	}
	public void setAnggota(Anggota anggota) {
		this.anggota = anggota;
	}
	
	
	
	
}
