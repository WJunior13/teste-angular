package com.example.backend.model;



import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name = "clients")
public class Client {
	
	@Id
	private long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name="address")
	private String address;
	

	@Column(name="phone")
	private long phone;

	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	/*
	@OneToMany
	private List<DataClient> dataClient;
	
	public List<DataClient> getDataClient() {
		return dataClient;
	}

	public void setDataClient(List<DataClient> dataClient) {
		this.dataClient = dataClient;
	}

	public Client() {
		
	}
	
	public Client(long id, String name) {
		super();
		this.id=id;
		this.name = name;
		
	}*/
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}



