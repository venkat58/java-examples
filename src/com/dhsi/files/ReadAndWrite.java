package com.dhsi.files;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ReadAndWrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		FileInputStream fin = new FileInputStream("u.txt");
		FileOutputStream fos = new FileOutputStream("abc.txt");
		
		int i=0;  
		while((i=fin.read())!=-1){  
		fos.write((byte)i);  
		}  
		  
		fin.close();  
		
		}catch(Exception e){System.out.println(e);}

	}

}
