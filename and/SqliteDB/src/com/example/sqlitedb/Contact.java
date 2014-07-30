package com.example.sqlitedb;

public class Contact {
	
	int id;
	String name,phonenumber;
	
	Contact(){
		
	}
	Contact(String name,String phonenumber)
	{
		this.phonenumber=phonenumber;
		this.name = name;
	}

	Contact(int id, String name, String phonenumber)
	{
		this.id = id;
		this.name= name;
		this.phonenumber = phonenumber;
	}
	
	/**
	 * setter method
	 * for id name phonenumber 
	 **/ 
	
	public void setId(int id)
	{
		this.id= id;
	}
	public void setName(String name)
	{
		this.name= name;
	}
	public void setph(String  phonenumber)
	{
		this.phonenumber=phonenumber;
	}
	
	/**
	 * getter method 
	 * for id name phonenumber
	 * */
	
	public int getId()
	{
		return this.id;
	}
	public String getName(){
	return this.name;
	}
	public String getPh()
	{
		return this.phonenumber;
	}
}
