package com.example;

import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlRootElement;

import jakarta.xml.bind.annotation.XmlAccessorType;

@XmlRootElement(name ="student")
@XmlAccessorType
public class Student {

	private int id;
	private int rank;
	private String name;
	private Address address;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, int rank, String name, Address address) {
		super();
		this.id = id;
		this.rank = rank;
		this.name = name;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", rank=" + rank + ", name=" + name + ", address=" + address + "]";
	}
	
	
	
}
