package com.xsis.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Anggota implements Serializable{

public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Pengembalian> getPengembalian() {
		return pengembalian;
	}
	public void setPengembalian(List<Pengembalian> pengembalian) {
		this.pengembalian = pengembalian;
	}
@Id
@GeneratedValue(strategy=GenerationType.SEQUENCE, 
generator="course2_seq")
	@SequenceGenerator(
	name="course2_seq",
	sequenceName="course_sequence"
	)
	private int id;
	private String name;
	@OneToMany(mappedBy="anggota")


	private List<Pengembalian> pengembalian;
}
