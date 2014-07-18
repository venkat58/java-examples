package com.dhsi.frist;

public class overloading {
	 void sum(int a,int b){System.out.println(a+b);}  
	  int sum(int a,int b,int c){System.out.println(a+b+c);return a;}  
	  
	  public static void main(String args[]){  
		  overloading obj=new overloading();  
	  obj.sum(10,10,10);  
	  obj.sum(20,20);  
	  
	  }  
}
