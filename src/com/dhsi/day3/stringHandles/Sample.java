package com.dhsi.day3.stringHandles;

public class Sample extends Thread {

	public void run(){System.out.println("new thread running");}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample s= new Sample();
		s.start();

	}

}


class Multi extends Thread{  
	 public void run(){  
	  for(int i=1;i<5;i++){  
	  //  try{Thread.sleep(5000);}catch(InterruptedException e){System.out.println(e);}  
	    System.out.println(i);  
	  }  
	 }  
	 public static void main(String args[]){  
	  Multi t1=new Multi();  
	  Multi t2=new Multi();  
	   
	  t1.start();  
	  t2.start();  
	 }  
	}  