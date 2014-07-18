package com.dhsi.db;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
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
import com.dhsi.test.Image;
import com.mysql.jdbc.PreparedStatement;

import java.util.*;
public class SbiAccount {
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
	
	ArrayList getAccountNumbersList() throws Exception
	{
		ArrayList accountNumbers = new ArrayList<>();
		try{
			DBConnect();

			rs=stmt.executeQuery("SELECT ACNO FROM Account");
			while(rs.next())
			{
				System.out.println("hi"+rs.getString(1));
				String d= rs.getString(1);
				accountNumbers.add(d);
				
				
			}
		}catch(Exception e){System.out.println("error"); System.out.println(e);}
		finally{
			DBClose();
		}
		return accountNumbers;
	}
	
	
	HashMap<String,String> getAccountDetails(String no) throws Exception
	{
		HashMap<String,String> hm = new HashMap<>();
		try{
			DBConnect();

			rs=stmt.executeQuery("select ACNO, NAME, BALANCE, STATUS from Account where ACNO='"+no+"'");
			if(rs.next())
			{
				hm.put("ACNO", rs.getString("ACNO")); 
				hm.put("NAME",rs.getString("NAME"));
				hm.put("BALANCE",rs.getString("BALANCE"));
				hm.put("STATUS",rs.getString("STATUS"));
			}
		}catch(Exception e){System.out.println(e);}
		finally{
			DBClose();
		}
		return hm;
	}
	
	
	
	
	
	String addBalance(String no,String amount) throws SQLException
	{
		String responce = null;
		try{
			DBConnect();

			int count=stmt.executeUpdate("UPDATE Account SET BALANCE=BALANCE+'"+amount+"' WHERE ACNO='"+no+"'");
			if(count==1)
			{
				responce="added";
			}else{responce="failed to add amount";}
			
		}catch(Exception e){System.out.println(e);}
		finally{
			DBClose();
		}
		return responce;
		
	}
	

	/*int[] getAccountNumbers() throws Exception
	{
		System.out.println("hi");
		try{
			DBConnect();
			rs=stmt.executeQuery("select ACNO from Account");
			int i=0;
			while(rs.next())
			{
				accountBalances[i] = rs.getInt("ACNO");
				System.out.println(accountBalances[i]);

				i++;
			}
		}catch(Exception e){System.out.println(e);}
		finally{
			rs.close();

			DBClose();
		}
		return accountBalances;
	}*/
	
	public HashMap<String,String> getgetNames() throws Exception
	{
		HashMap<String,String> hs= new HashMap<>();
		
		try{
			DBConnect();

			rs=stmt.executeQuery("select NAME from Account");
			int i=0;
			while(rs.next())
			{
				
				hs.put("NAME", rs.getString("NAME"));
				System.out.println(hs);

				i++;
			}
		}catch(Exception e){System.out.println(e);}
		finally{

			DBClose();
		}
		
		
		return hs;
	}
	
	public ArrayList getAllAccounts() throws Exception
	{
		ArrayList<HashMap<String, String>> al= new ArrayList();
		HashMap<String,String> hs= new HashMap();
		
		try{
			DBConnect();

			rs=stmt.executeQuery("select * from Account");
			while(rs.next())
			{
				hs.put("ACNO", rs.getString("ACNO"));
				hs.put("NAME", rs.getString("NAME"));
				hs.put("BALANCE", rs.getString("BALANCE"));
				hs.put("STATUS", rs.getString("STATUS"));
				System.out.println(hs);
				al.add(hs);
			}
		}catch(Exception e){System.out.println(e);}
		finally{

			DBClose();
		}
		
		return al;
	}
	
	
public boolean userValidation(String s,String s1) throws SQLException
{
	ResultSet rs = null;
	try{
		DBConnect();

		rs=stmt.executeQuery("SELECT * FROM Users WHERE username = '"+s+"' AND password ='"+s1+"'");
		
		if(rs.next())
		{
		return true;	
		}
		else{
		return false;	
		}
	}catch(Exception e){System.out.println(e);}
	finally{
		DBClose();
	}
	
	return false;
	
}
	
public void updateMultileValues(HashMap hm)
{
    String updateString ="UPDATE Account SET BALANCE=BALANCE+?  WHERE ACNO=?";

	try{
		DBConnect();
		PreparedStatement updateSales = null;
		 con.setAutoCommit(false);
	        updateSales = (PreparedStatement) con.prepareStatement(updateString);
	      Set se= hm.entrySet();
	      Iterator i= se.iterator();
	      con.setAutoCommit(false);
	      while(i.hasNext()){  
	    	   Map.Entry m=(Map.Entry)i.next();  
	    	   System.out.println(m.getKey()+" "+m.getValue()); 
	    	   updateSales.setInt(2, (int) m.getKey());
	    	   updateSales.setInt(1, (int) m.getValue());
	    	   updateSales.executeUpdate();
	    	   System.out.println("updated");
	    	   con.commit();
	    	  }  
	    
		
	}catch(Exception e){System.out.println(e);}
	
}
	
	
	/*private void hs(Integer integer, String string) {
		// TODO Auto-generated method stub
		
	}*/

 public void setObj()
{
//	 String updateString ="UPDATE Account SET BALANCE=BALANCE+?  WHERE ACNO=?";

		try{
			DBConnect();
			 File imgfile = new File("/Users/Nagarjuna/Desktop/db.txt");
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
			   
		}catch(Exception e){System.out.println(e);}
		
}
public void getImg() throws SQLException, IOException
{
	OutputStream f;
	try{
		DBConnect();
	
	rs = stmt.executeQuery("select image from image");
		int i = 0;
		while (rs.next()) {
			InputStream in = rs.getBinaryStream(1);
		 f= new FileOutputStream(new File("/Users/Nagarjuna/Desktop/db1.txt"));
			i++;
			int c = 0;
			while ((c = in.read()) > -1) {
				f.write(c);
			}
			
		}
	}finally{System.out.println("bye");}
}

}
