package com.example.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="patients")
public class Patient {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Patient_Id")
	private int pid;
	@Column (name="Name")
	private String pname;
	@Column(name="Address")
	private String address;
	@Column(name="Contact_No")
	private String mobile;
	@ManyToOne
	@JoinColumn(name="Doct_Id")
	private Doctor doctor;
	@OneToOne
	@JoinColumn(name="Bill_Id")
	private Bill bill;
	@OneToOne
	@JoinColumn(name="Room_Id")
	private Room room;
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Patient(int pid, String pname, String address, String mobile, Doctor doctor, Bill bill, Room room) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.address = address;
		this.mobile = mobile;
		this.doctor = doctor;
		this.bill = bill;
		this.room = room;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	public Bill getBill() {
		return bill;
	}
	public void setBill(Bill bill) {
		this.bill = bill;
	}
	public Room getRoom() {
		return room;
	}
	public void setRoom(Room room) {
		this.room = room;
	}
	@Override
	public String toString() {
		return "Patient [pid=" + pid + ", pname=" + pname + ", address=" + address + ", mobile=" + mobile + ", doctor="
				+ doctor + ", bill=" + bill + ", room=" + room + "]";
	}

}
