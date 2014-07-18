package com.dhsi.second;

public class ex2 {

	public void div(String s1, String s2) throws NumberFormatException,ArithmeticException
	{
		int x=Integer.parseInt(s1);
		int y=Integer.parseInt(s2);
	int z= x/y;
	System.out.println("division is ex2"+z);
	}
}

class ex3
{
	public static void main(String[] k) {
		try{
			ex2 o2=new ex2();
			o2.div("5","0");
			
		}catch(NumberFormatException nfe)
		{
			System.out.println("enter any number value");
		}

		catch(ArithmeticException Ae)
		{
			System.out.println("enter  value is not valid");
		}
		
	
	}
}