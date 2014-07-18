package com.dhsi.files;

import java.io.FileInputStream;
import java.io.IOException;

public class SimpleRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream fis= new FileInputStream("abc.txt");
		try{
		int i;  
	    while((i=fis.read())!=-1)  
	     System.out.print((char)i);  
	  
	    fis.close();  
	  }catch(Exception e){System.out.println(e);}  

	}

}
