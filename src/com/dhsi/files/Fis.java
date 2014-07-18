package com.dhsi.files;

import java.io.FileInputStream;
import java.io.IOException;

public class Fis {

	public static void main(String[] K) {
		// TODO Auto-generated method stub
		try{
			String fname="u.txt";
			FileInputStream  fis= new FileInputStream(fname);
			int i;
			while((i=fis.read())!=-1)
			{
				System.out.println(i);
			}
			System.out.println(fis.read());

			fis.close();
			System.out.println("data file");
		}catch(IOException ioe)
		{
			System.out.println("file dosenot exist");
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
