package com.dhsi.f;

	
	class MethodInnerClass{  
		 private int data=30;//instance variable  
		 void display(){  
		  class Local{  
		   void msg(){System.out.println(data);}  
		  }  
		  Local l=new Local();  
		  l.msg();  
		 }  
		 public static void main(String args[]){  
			 MethodInnerClass obj=new MethodInnerClass();  
		  obj.display();  
		 }  
		}  
