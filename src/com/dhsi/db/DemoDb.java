package com.dhsi.db;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;

public class DemoDb {
	   // JDBC driver name and database URL
	 static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	   static final String DB_URL = "jdbc:mysql://localhost/demo";
	
	   //  Database credentials
	   static final String USER = "root";
	   static final String PASS = "";
	  
	   public static void main(String[] args) throws Exception{
		   Connection conn = null;
		   Statement stmt = null;
		   try{
			 //STEP 2: Register JDBC driver
			      Class.forName("com.mysql.jdbc.Driver");  
			   //STEP 3: Open a connection
			      System.out.println("Connecting to database...");
			      conn = DriverManager.getConnection(DB_URL,USER,PASS);
			      
			    //STEP 4: Execute a query
			      System.out.println("Creating statement...");
			      stmt = conn.createStatement();
			      BufferedReader ip= new BufferedReader(new InputStreamReader(System.in));
		    	  System.out.println("do you want insert student details type 'y' otherwise enter any key");  

			      String s=ip.readLine();
			      System.out.println(s);
			      
			      while((s.equalsIgnoreCase("y")))
			      {
			    	  
			    	System.out.println("Enter student ID");  
			    	  int SID=Integer.parseInt(ip.readLine()) ;
			    	  
			    	  System.out.println(SID);
			    	  System.out.println("Enter student name");  
			    	  String name= ip.readLine();
			    	  System.out.println(name);
			    	  System.out.println("Enter student address");  
			    	  String add= ip.readLine();
			    	 System.out.println(add);
			    	  System.out.println("Enter student Fee");  
			    	  int Fee= Integer.parseInt(ip.readLine() );
			    	  System.out.println(Fee);
			    	int i=  stmt.executeUpdate("INSERT INTO Demo (SID, Sname, SAdd, SFee) VALUES ("+SID+",'"+name+"','"+add+"',"+Fee+")");
			    	  System.out.println(i);
			    	  System.out.println("do you want insert another student details type 'y' otherwise enter any key");  
			    	  s= ip.readLine();
			      }
			      
			      
			      String sql;
			      sql = "SELECT * FROM Demo";
			      ResultSet rs = stmt.executeQuery(sql);
			      
			    //STEP 5: Extract data from result set
			      while(rs.next()){
			         //Retrieve by column name
			         int id  = rs.getInt("SID");
			         String name = rs.getString("Sname");
			         String add = rs.getString("SAdd");
			         int fee = rs.getInt("SFee");

			         //Display values
			         System.out.print("SID: " + id);
			         System.out.print(", Sname: " + name);
			         System.out.print(", SAdd: " + add);
			         System.out.println(", Fee: " + fee);
			      }
			    //STEP 6: Clean-up environment
			      rs.close();
			      stmt.close();
			      conn.close();
			   }catch(SQLException se){
			      //Handle errors for JDBC
			      se.printStackTrace();
			   }catch(Exception e){
			      //Handle errors for Class.forName
			      e.printStackTrace();
			   }finally{
			      //finally block used to close resources
			      try{
			         if(stmt!=null)
			            stmt.close();
			      }catch(SQLException se2){
			      }// nothing we can do
			      try{
			         if(conn!=null)
			            conn.close();
			      }catch(SQLException se){
			         se.printStackTrace();
			      }//end finally try
			   }//end try
			   System.out.println("Goodbye!");
	   
	   }
}
