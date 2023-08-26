package com.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee
{
	
	@Id
	private int eid;
	private String ename;
	private int esal;
	
	public Employee() 
	{
		super();
	
	}
	public Employee(int eid, String ename, int esal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEsal() {
		return esal;
	}
	public void setEsal(int esal) {
		this.esal = esal;
	}

	
	
}
