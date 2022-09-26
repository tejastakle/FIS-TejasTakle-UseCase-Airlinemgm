package com.example.airlinemgm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="passenger")
public class Passenger {
	
	@Id
	int profile_id;
	
	@Column
	String password;
	
	@Column
	String first_name;
	
	@Column
	String last_name;
	
	@Column
	String address;
	
	@Column
	int mobile_no;
	
	@Column
	String email_id;
	
	public Passenger() {
		// TODO Auto-generated constructor stub
	}

	public Passenger(int profile_id, String password, String first_name, String last_name, String address,
			int mobile_no, String email_id) {
		super();
		this.profile_id = profile_id;
		this.password = password;
		this.first_name = first_name;
		this.last_name = last_name;
		this.address = address;
		this.mobile_no = mobile_no;
		this.email_id = email_id;
	}

	public int getProfile_id() {
		return profile_id;
	}

	public void setProfile_id(int profile_id) {
		this.profile_id = profile_id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(int mobile_no) {
		this.mobile_no = mobile_no;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	
	
	
	

}
