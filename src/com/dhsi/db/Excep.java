package com.dhsi.db;

import java.util.Date;

public class Excep {

		  public static void main(String[] args) {
		 
		  try {
			  Date d= new Date();
			  System.out.println(d);
		    long data[] = new long[1000000000]; 
		  }
		  catch (Exception e) {
		    System.out.println(e);
		  }
		  finally {
		    System.out.println("finally block will execute always.");
		  }		  }
}