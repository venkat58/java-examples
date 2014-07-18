package com.dhsi.frist;
public class Programme extends Employee{

			 int bonus=10000;  
			    
			 public static void main(String args[]){  
			   Programme p=new Programme();  
			   System.out.println("Programmer salary is:"+p.salary);  
			   System.out.println("Bonus of Programmer is:"+p.bonus);  
			   String s="    venky hi how r u    ";
			   System.out.println(s.trim());
			   System.out.println(s.intern());
			   System.out.println(s.getBytes());
			   System.out.println(s.toCharArray());

			 }
			}  


