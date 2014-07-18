package com.dhsi.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.util.Date;

public class SecondDB {
	private static final String Driver="com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost/Demoj";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    
    private Connection connect = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;
    String s;
    
    public String ReadDB(){
    	try{
    		Class.forName(Driver);
    		connect=DriverManager.getConnection(URL,USERNAME,PASSWORD);
    		statement=connect.createStatement();
    		
    		resultSet= statement.executeQuery("select * from Demoj.COMMENTS");
    		while(resultSet.next())
    		{
    		  String user = resultSet.getString("myuser");
   		      String website = resultSet.getString("webpage");
   		      String summary = resultSet.getString("summary");
   		      Date date = resultSet.getDate("datum");
   		      String comment = resultSet.getString("comments");
   		      String d= resultSet.getString(1);
   		      System.out.println(s);
   		      s+=user+"\n"+website+"\n"+date+"\n"+d+"\n";
    		}
    		resultSet.close();
    		statement.close();
    		connect.close();
    		
    	}catch (Exception e){
    		System.out.println(e);
    	}
    	return s;
    }
	

}
