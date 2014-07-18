package com.dhsi.second;

public class pin {

	Adrs a;

	void Ag()
	{
		a = new Adrs();
		a.disp();
		System.out.println("now how r u");
	}
	
}

	class Adrs
	{
	protected void disp()
		{
			System.out.println("hoi");
		}
	}

	class cities extends pin
	{
		void disp()
		{
			System.out.println("class of city");
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			pin agr= new pin();
			agr.Ag();
			
		}
		
	}


