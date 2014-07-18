package com.dhsi.files;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class Persist {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Inter123 s1=new Inter123(211,"ravi");
		FileOutputStream fios= new FileOutputStream("Inter123.txt");
		ObjectOutputStream obj= new ObjectOutputStream(fios);
		obj.writeObject(s1);
		obj.flush();		
			System.out.println("success");	
	}

}
