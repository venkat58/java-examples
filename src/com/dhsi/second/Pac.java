package com.dhsi.second;
import java.lang.Exception;
class Pac {
	public static void main(String args[]){  
		int a=25;
		   int b=1;
		  try{  
		   if(b==0){
			   throw new ArithmeticException("please make sure b value is not a 0");
		   }else{		   int data=a/b; 
		     System.out.println(data);

		   }
		   try{
			 int i=25/0;  
		   } catch(Exception Exc){System.out.println("inner try catch");}
		   finally{System.out.println("finally in iner class");}
		  } 
		  
		  catch(Exception Ae){
			  try{
//				System.out.println(data);  
			  }
			  catch(Exception Ex)
			  {
				System.out.println("inside try catch in catch");  
			  }
			  System.out.println(Ae);}
		  
		   
//		  finally{System.out.println("finally block is always executed");}  
		   
		  System.out.println("rest of the code...");  
		  }  
	}  
		


	  

	


