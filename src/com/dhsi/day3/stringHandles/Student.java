package com.dhsi.day3.stringHandles;

import java.util.StringTokenizer;

public class Student {
	 int rollno;  
	 String name;  
	 String city;  
	  
	 Student(int rollno, String name, String city){  
	 this.rollno=rollno;  
	 this.name=name;  
	 this.city=city;  
	 }  
	   
	 public String toString(){//overriding the toString() method  
	  return rollno+" "+name+" "+city;  
	 }  
	 public static void main(String args[]){  
	   Student s1=new Student(101,"Raj","lucknow");  
	   Student s2=new Student(102,"Vijay","ghaziabad");  
	     
	   System.out.println(s1);//compiler writes here s1.toString()  
	   System.out.println(s2);//compiler writes here s2.toString()  
	   
	   
	   StringTokenizer st= new StringTokenizer("i am venkat from kkd");
	   
	   while(st.hasMoreTokens())
	   {
		   System.out.println(st.nextToken());
		   
	   }
	   System.out.println(st);
	   
	   StringTokenizer st1 = new StringTokenizer("my,name,is,khan");  
       
	      // printing next token  
	      System.out.println("Next token is : " + st1.nextToken(","));  
	 }  

}

	
	