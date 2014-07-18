package com.dhsi.oops.day2;

public class SingleTask extends Thread{
		 public void run(){  
		   System.out.println("task one");  
		 }  
		 public static void main(String args[]){  
			 SingleTask t1=new SingleTask();  
			 SingleTask t2=new SingleTask();  
			 SingleTask t3=new SingleTask();  
		  
		  t1.start();  
		  t2.start();  
		  t3.start();  
		 }  
		 
}
