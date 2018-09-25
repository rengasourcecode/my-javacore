package com.bix.jdbctesting;
import java.sql.*;
public class JdbcTesting {

	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		//loading and registering the driver (jar files are loaded here)
		Class.forName("oracle.jdbc.driver.OracleDriver");  
		
		//creating connection object
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","rengaoracle","db1989"); 
		
		//creating statement
		Statement state = con.createStatement();
		
		//executing the query
		ResultSet result= state.executeQuery("select numberplate,engine from CARDETAILS");
		
		result.next();
		
		System.out.println(result.getString(1)+ " "+ result.getString(2));
		
		//closing the connection
		
		con.close();

	}

}
