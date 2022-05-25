package com.cg.financial_org_rating_system.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Address_Details")
public class Address 
{
	private String city;
	private String street;
	private int pincode;
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}

}
