package com.dhsi.files;
import java.io.*;

public class Fos {
	
	public static void main(String K[])
	{
		try{
			String fname="u.txt";
			FileOutputStream fos= new FileOutputStream(fname);
			String v= "venky is a very bad boy";
			byte b[]=v.getBytes();
			
			for(int i=0;i<=10;i++)
			{
				System.out.println(i);
//				fos.write(i);
				fos.write(b);

			}
			fos.close();
			System.out.println("Dta written by the file");
		fos.close();
		}catch(IOException ioe)
		{
			System.out.println("unable to open a file in write mode");
		}
	}

}
