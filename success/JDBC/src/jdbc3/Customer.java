﻿package jdbc3;

import java.sql.Date;

public class Customer {

	private Integer id;
	private String name;
	private String email;
	private Date birth;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCustomerName() {
		return name;
	}

	public void setCustomerName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email
				+ ", birth=" + birth + "]";
	}

	public Customer(Integer id, String name, String email, Date birth) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.birth = birth;
	}
	
	public Customer() {}

	public Customer(int id2, String name2) {
		this.id = id2;
		this.name = name2;
	}
}