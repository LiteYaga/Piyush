package com.del;

import java.io.Serializable;

public class Emp implements Serializable{
	private String Name;
	private int id;
	private long mobile;

	public Emp() {
	
	}

	public Emp(int id,String name, long mobile) {
		super();
		Name = name;
		this.id = id;
		this.mobile = mobile;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "Emp [Name=" + Name + ", id=" + id + ", mobile=" + mobile + "]";
	}
	
	
	

}
