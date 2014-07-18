package com.dhsi.oops.day2;

public class ClassObjects {

	static int i=10;
	static int j=20;
	static int z;
	void sum(){
		z=i+j;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(i+" "+j);
ClassObjects c= new ClassObjects();
c.sum();
c.sum();



System.out.println(i+" "+j);
System.out.println(z);

new ClassObjects().sum();
System.out.println(z);
new Factoril().fact(4);

new Over().sum(20);
new Over().sum(30, 9);
new Over().sum(20, 50, 2);
new Over().sum(2, 3, 4, 5);
	}

}

final class Factoril{
	void fact(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
	System.out.println(fact);
	}

}

class Over
{
	void sum(int i, int j, int k)
	{
		System.out.println(i+j+k);
	}
	void sum(int i, int j)
	{
		System.out.println(i+j);
	}
	void sum(int i)
	{
		System.out.println(i+i);
	}
	void sum(int i, int j, int k ,int l)
	{
		System.out.println(i+j+k+l);
	}
}
	

