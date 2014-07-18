package com.dhsi.frist;

public class sum{
	
	static int fact(int a)
	
	{
		int f=1;
		for(int i=1; i<a;i++)
		{
			f=f*i;
		}
		return f;
		
	}
	public static void main(String...agrs)
	{
		int res= fact(8);
		System.out.println(res);
	}
}