package com.dhsi.second;

public class Students implements Inter1, Inter2
{
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
Students s= new Students();
s.sId();
s.sName();
	}

	@Override
	public void sId() {
		// TODO Auto-generated method stub
		System.out.println("sid");
	}

	@Override
	public void sName() {
		// TODO Auto-generated method stub
		System.out.println("sname");
	}

	@Override
	public void sAddress() {
		// TODO Auto-generated method stub
		System.out.println("sAddress");
	}

	
	
}