package com.dhsi.frist;

public class staticM {
	     int rollno;  
	     String name;  
	     static String college = "ITS";  
	       
	     static void change(){  
	     college = "BBDIT";  
	     }  
	  
	     staticM(int r, String n){  
	     rollno = r;  
	     name = n;  
	     }  
	  
	     void display (){System.out.println(rollno+" "+name+" "+college);}  
	  
	    public static void main(String args[]){  
	    	staticM.change();  
	  
	    staticM s1 = new staticM (111,"Karan");  
	    staticM s2 = new staticM (222,"Aryan");  
	    staticM s3 = new staticM (333,"Sonoo");  
	  
	    s1.display();  
	    s2.display();  
	    s3.display();  
	    }  
	}  

