package com.dhsi.second;
import java.io.*;

public class thro {
	void m()throws IOException{  
	    throw new IOException("device error");//checked exception  
	  }  
	  void n()throws IOException{  
	    m();  
	  }  
	  void p(){  
	   try{  
	    n();  
	   }catch(Exception e){System.out.println("exception handled");}  
	  }  
	  public static void main(String args[]){  
		  thro obj=new thro();  
	   obj.p();  
	   System.out.println("normal flow...");  
	  }  
	
}
