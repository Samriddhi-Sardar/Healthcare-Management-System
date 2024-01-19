package com.example.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="doctors")
public class Doctor {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Doct_Id")
	private int did;
	@Column(name="Name")
	private String dname;
	@Column(name="Specialist")
	private String specialist;
	@OneToMany (mappedBy="doctor",cascade=CascadeType.ALL)
	private List<Patient>patients=new ArrayList<Patient>();
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Doctor(int did, String dname, String specialist, List<Patient> patients) {
		super();
		this.did = did;
		this.dname = dname;
		this.specialist = specialist;
		this.patients = patients;
	}
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getSpecialist() {
		return specialist;
	}
	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}
	public List<Patient> getPatients() {
		return patients;
	}
	public void setBooks(List<Patient> patients) {
		this.patients = patients;
	}
	@Override
	public String toString() {
		return "Doctor [did=" + did + ", dname=" + dname + ", specialist=" + specialist + ", patients=" + patients + "]";
	}
	 
	
}