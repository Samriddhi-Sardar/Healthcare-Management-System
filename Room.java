package com.example.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name="rooms")
public class Room {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Room_Id")
	private int rid;
	@Column(name="Type")
	private String type;
	 @Column(name="Status")
	    private String status;
	 @OneToOne(mappedBy="room",cascade=CascadeType.ALL)
	private Patient patient;
	public Room() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Room(int rid, String type, String status, Patient patient) {
		super();
		this.rid = rid;
		this.type = type;
		this.status = status;
		this.patient = patient;
	}
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	@Override
	public String toString() {
		return "Room [rid=" + rid + ", type=" + type + ", status=" + status + ", patient=" + patient + "]";
	}
}
