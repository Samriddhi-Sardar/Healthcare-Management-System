package com.example.Entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="bills")
public class Bill {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Bill_Id")
    private int bid;
    @Column(name="Date")
    private LocalDate date;
    @Column(name="Amount")
    private int amount;
    @Column(name="Status")
    private String status;
    @OneToOne(mappedBy="bill",cascade=CascadeType.ALL)
    private Patient patient;
	public Bill() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bill(int bid, LocalDate date, int amount, String status, Patient patient) {
		super();
		this.bid = bid;
		this.date = date;
		this.amount = amount;
		this.status = status;
		this.patient = patient;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
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
		return "Bill [bid=" + bid + ", date=" + date + ", amount=" + amount + ", status=" + status + ", patient="
				+ patient + "]";
	}  
}