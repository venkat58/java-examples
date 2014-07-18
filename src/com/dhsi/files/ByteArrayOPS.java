package com.dhsi.files;
import java.io.*;  

public class ByteArrayOPS {
	 public static void main(String args[])throws Exception{  
	  
	  FileOutputStream fout1=new FileOutputStream("u.txt");  
	  FileOutputStream fout2=new FileOutputStream("abc.txt");  
	  
	  ByteArrayOutputStream bout=new ByteArrayOutputStream();  
	  bout.write(239);  
	  
	  bout.writeTo(fout1);  
	  bout.writeTo(fout2);  
	  
	  bout.flush();  
	  
	  bout.close();//has no effect  
	  System.out.println("success...");  
	 }  
	}   
