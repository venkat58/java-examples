package com.dhsi.files;

import java.io.*;  

public class DePersist {
	
	 public static void main(String args[])throws Exception{  
	    
	  ObjectInputStream in=new ObjectInputStream(new FileInputStream("Inter123.txt"));  
	  Inter123 s=(Inter123)in.readObject();  
	  System.out.println(s.id+" "+s.name);  
	  
	  in.close();  
	 }  
	}  


