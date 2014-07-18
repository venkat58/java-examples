package com.dhsi.test;

import java.sql.*;
import java.util.Properties;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.dhsi.second.ex2;
import com.mysql.jdbc.PreparedStatement;

import java.util.*;

public class Image{
	private static final String Driver="com.mysql.jdbc.Driver";
	private static final String URL="jdbc:mysql://localhost/SBI";
	private static final String User="root";
	private static final String pwd="";
	private static final String Account = null;
	Properties pp= new Properties();
	InputStream input= null;
	
	Statement stmt;
	Connection con;
	ResultSet rs;
	//	private String[] accountDetails;
	public void DBConnect(){
		try{
			input =new FileInputStream("config.properties");
			pp.load(input);
			
			Class.forName(Driver); 
//			con=DriverManager.getConnection(URL,User,pwd);

	con=DriverManager.getConnection(pp.getProperty("database"),pp.getProperty("dbuser"),pwd);
	stmt=con.createStatement();
	
		}catch(Exception e){
			System.out.println(e);
		}
	}
	
	
	void DBClose() throws SQLException
	{
		if(rs!=null)
		{
			rs.close();
		}
		stmt.close();
		con.close();
	}
	
	void getAccountNumbersList() throws Exception
	{
		try{
			DBConnect();
			 File imgfile = new File("/Users/Nagarjuna/Desktop/venky.png");
			  new Image();
			  FileInputStream fin = new FileInputStream(imgfile);
			 System.out.println(fin);
			   PreparedStatement pre =
			   (PreparedStatement) con.prepareStatement("insert into Image values(?,?,?)");
			 
			   pre.setString(1,"test");
			   pre.setInt(2,3);
			   System.out.println("h");
			   pre.setBinaryStream(3,(InputStream)fin,(int)imgfile.length());
			   System.out.println("i");
			   pre.executeUpdate();
			   System.out.println("Successfully inserted the file into the database!");

			   pre.close();
			   con.close(); 
		}catch(Exception e){System.out.println("error"); System.out.println(e);}
		finally{
			//DBClose();
		}
	
	}
	void getImage() throws SQLException, IOException
	{	OutputStream f;
	try{
		DBConnect();
	
		ResultSet rs = stmt.executeQuery("select image from image");
		int i = 0;
		while (rs.next()) {
			InputStream in = rs.getBinaryStream(1);
		 f= new FileOutputStream(new File("/Users/Nagarjuna/Desktop/test"+i+".jpg"));
			i++;
			int c = 0;
			while ((c = in.read()) > -1) {
				f.write(c);
			}
			
		}
	}finally{System.out.println("bye");}
	}
	
	public static void main(String[] args) throws Exception {
		Image i= new Image();
//		i.getAccountNumbersList();
		i.getImage();
	}
}