package com.dhsi.frist;

public class Outer {

		 private int data=30;  
		 class Inner{  
		  void msg(){System.out.println("data is "+data);}  
		 }  
		   
		 void display(){  
		  Inner in=new Inner();  
		  in.msg();  
		 }  
		  
		}  

class Test{  
	 public static void main(String args[]){  
	  Outer obj=new Outer();  
	  Outer.Inner in=obj.new Inner();  
	  in.msg();  
	  }  
	}  

