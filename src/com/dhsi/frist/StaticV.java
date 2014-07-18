package com.dhsi.frist;

public class StaticV {
		   static int rollno;  
		   String name;  
		   static String college ="ITS";  
		     void n(){}
		   StaticV(int r,String n,String l){  
		   rollno = r;  
		   name = n; 
		   college=l;
		   }  
		   StaticV(){}
		 void display (){System.out.println(rollno+" "+name+" "+college);}  
		  
		 public static void main(String args[]){  
			 StaticV s1 = new StaticV (111,"Karan","l1");  
			 StaticV s2 = new StaticV (222,"Aryan","l3");  
		   
		 s1.display();  
		 s2.display();  
		 }  

}
