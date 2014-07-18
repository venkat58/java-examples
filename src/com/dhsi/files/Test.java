package com.dhsi.files;
import com.dhsi.second.*;

import java.io.*;
public class Test implements Inter1 {

	int sid;
	String sname;
	String sAdd;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Test t= new Test();
		t.sId();
		
		try{
		FileOutputStream fos= new FileOutputStream("abc.txt");
		String s= "datahub services";
		
		byte[] b=s.getBytes();
		fos.write(b);
		fos.close();
		System.out.println("data inserted");
		}
		catch(Exception e){System.out.println(e);} 
	}

	@Override
	public void sId() {
		// TODO Auto-generated method stub
		sid=20;
		System.out.println(sid);
	}

	@Override
	public void sName() {
		// TODO Auto-generated method stub
		
		sname="my name";
	}

	@Override
	public void sAddress() {
		// TODO Auto-generated method stub
		sAdd="hyd";
	}

}
