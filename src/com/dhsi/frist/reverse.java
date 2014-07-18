package com.dhsi.frist;
import java.util.Scanner;

public class reverse {
	 
	
	   public static void main(String args[])
	   {
	      int n, reve = 0;
	 
	      System.out.println("Enter the number to reverse");
	      Scanner in = new Scanner(System.in);
	      n = in.nextInt();
	 
	      while( n != 0 )
	      {
	    	  System.out.println(reve);
	          reve = reve * 10;
	          System.out.println(reve);
	          reve = reve + n%10;
	          System.out.println(reve);
	          n = n/10;
	          System.out.println(reve);
	      }
	 
	      System.out.println("Reverse of entered number is "+reve);
	   }
	}

