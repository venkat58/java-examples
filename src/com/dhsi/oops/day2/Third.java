package com.dhsi.oops.day2;

class Third extends Thread{  
	 public void run(){  
	   System.out.println("running thread name is:"+Thread.currentThread().getName());  
	   System.out.println("running thread priority is:"+Thread.currentThread().getPriority());  
	   System.out.println("running thread priority is:"+Thread.currentThread().getState());  
  
	  }  
	 public static void main(String args[]){  
		 Third m1=new Third();  
		 Third m2=new Third();  
	  m1.setPriority(Thread.MIN_PRIORITY);  
	  m2.setPriority(Thread.MAX_PRIORITY);  
	  m1.start(); 
	  try{
		  m1.sleep(4000);
		  }catch(Exception e){}
		
	  m2.start(); 
	 } 
}    