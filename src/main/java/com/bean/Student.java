package com.bean;

public class Student {
	
	private int Rno;
	private String name, address;
	private String course;
	
	void setRno(int no)
	{
		this.Rno = no;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setaddress(String address)
	{
		this.address = address;
	}
	
	public void setcourse(String c)
	{
		this.course = c;
	}
	
	public int getRNo()
	{
		return this.Rno;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public String getAddress()
	{
		return this.address;
	}
	
	public String getcourse()
	{
		return this.course;
	}
	
}


