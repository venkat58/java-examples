package com.dhsi.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.sql.SQLException;

import com.dhsi.db.SbiAccount;

public class ObjectDB implements Serializable{
	int a;
	ObjectDB(int a)
	{
	this.a=a;	
	}
public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
//	ObjectDB d= new ObjectDB(667);
//	FileOutputStream f= new FileOutputStream("/Users/Nagarjuna/Desktop/db.txt");
//	ObjectOutputStream o= new ObjectOutputStream(f);
//	o.writeObject(d);
//	o.flush();
	
	SbiAccount sa1= new SbiAccount();
//	sa1.setObj();
	sa1.getImg();
	
	
	ObjectInputStream in=new ObjectInputStream(new FileInputStream("/Users/Nagarjuna/Desktop/db1.txt"));  
	ObjectDB s=(ObjectDB)in.readObject();  
	  System.out.println(s.a);  
	  
	  in.close();  
}

}
