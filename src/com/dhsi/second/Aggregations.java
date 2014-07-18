package com.dhsi.second;


public class Aggregations {
Address a;

void Ag()
{
	a = new Address();
	a.disp();
	System.out.println("now how r u");
}
public static void main(String[] args) {
	// TODO Auto-generated method stub
	Aggregations agr= new Aggregations();
	agr.Ag();
	
}

}

class Address
{
protected void disp()
	{
		System.out.println("hoi");
	}
}

