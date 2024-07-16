package com.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="address121")
public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int addrId;
	String line1,line2,line3;
	int pin;
	@OneToOne(targetEntity = Employee.class)
	Employee e;
	
	public Address() {
		super();
	}
  
	
	public Address(String line1, String line2, String line3, int pin) {
		super();
		this.line1 = line1;
		this.line2 = line2;
		this.line3 = line3;
		this.pin = pin;
		
	}

	public int getAddrId() {
		return addrId;
	}

	public void setAddrId(int addrId) {
		this.addrId = addrId;
	}

	public String getLine1() {
		return line1;
	}

	public void setLine1(String line1) {
		this.line1 = line1;
	}

	public String getLine2() {
		return line2;
	}

	public void setLine2(String line2) {
		this.line2 = line2;
	}

	public String getLine3() {
		return line3;
	}

	public void setLine3(String line3) {
		this.line3 = line3;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public Employee getE() {
		return e;
	}

	public void setE(Employee e) {
		this.e = e;
	}
	
	
}
