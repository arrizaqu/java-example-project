package com.xsis.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Department {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, 
	generator="course2_seq")
		@SequenceGenerator(
		name="course2_seq",
		sequenceName="course_sequence"
		)
	private int id;
	@Column(name="name", nullable=false)
	private String name;
	private String address;
	@OneToMany(mappedBy="department")
	private List<Employee> employees;
	@ManyToOne
	@JoinColumn(name="id_location")
	private Location location;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
