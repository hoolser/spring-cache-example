package com.example.springcache.domain;

import java.io.Serializable;

public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	String id;
	private String name;
	private String surname;
	private String phone;
	private String email;

	public User(String id, String name, String surname, String phone, String email) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.phone = phone;
		this.email= email;
	}
	
	public User() {
		super();
		this.id = "-1";
		this.name = "-1";
		this.surname = "-1";
		this.phone = "-1";
		this.email = "-1";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", surname=" + surname + ", phone=" + phone + ", email=" + email
				+ "]";
	}



}
