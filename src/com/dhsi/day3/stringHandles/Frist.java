package com.dhsi.day3.stringHandles;

import java.util.StringTokenizer;

public class Frist {
	String name;
	void printName(String pName )
	{
		name  = pName;
		System.out.println(name);                            
	}

	public static void main(String args[]){  
		Frist f= new Frist();
		
		String e=null;
		try{try{}catch(Exception io){}try{}catch(ArithmeticException Ae){}}catch(NumberFormatException Ne){}
		
		   String s1="Sachin"+e;  
		   System.out.println(s1);
		   String s2="Tachin";  
		   String s3="Sachl";  
		   System.out.println(s1.compareTo(s2));//0  
		   System.out.println(s1.compareTo(s3));//1(because s1>s3)  
		   System.out.println(s3.compareTo(s1));//-1(because s3 < s1 )  
		   
			     
			     String s=50+30+"Sachin"+40+40;  
			     System.out.println(s);//80Sachin4040  
			     
			     String s4=s1.concat(s2);  
			     
			     System.out.println(s4);
			     
			     String s5="Sachin Tendulkar";  
			     System.out.println(s5.substring(6));//Tendulkar  
			     System.out.println(s5.substring(0,6));//Sachin  
System.out.println(s5.toUpperCase());
System.out.println(s5.toLowerCase());
System.out.println(s5.trim());
System.out.println(s5.intern());
System.out.println(s5.getBytes());
System.out.println(s5.toCharArray());
System.out.println(String.valueOf(6));
char[] a = {'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd'};

System.out.println(String.valueOf(a));

StringBuffer sb= new StringBuffer("hi welcome to datahub ");

sb.append("services");
sb.insert(30,"hyderabad");
sb.reverse();
sb.replace(8, 20, "welcome to datahub");
sb.append(true);


System.out.println(sb);

StringTokenizer st1=new StringTokenizer("hisdhfn sugfdfu sgduygd hguscgv ghuidg di ighiudi is ihaisud f");
System.out.println(st1.countTokens());

while (st1.hasMoreTokens())
{
	
	System.out.println(st1.nextToken());
}

f.printName("raju");
f.printName("venkat");
f.printName("klfghidkfh");
	     
		 }  
	

}


