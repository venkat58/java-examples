package com.dhsi.c;

public class A implements Runnable{

	 public void run(){
		 for (int j=0;j<10;j++)
		 {
			 System.out.println("j vale is : "+j);
		 }
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r= new A();
		Thread t= new Thread(r);
		t.start();
		
		for (int j=0;j<10;j++)
		 {
			 System.out.println("i vale is : "+j);
		 }
		
	}

}
