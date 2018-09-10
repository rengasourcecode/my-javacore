package exercises;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.awt.Button;
import java.awt.Frame;
import java.sql.*;


public class Frames extends Frame {
/*
	 void jdbc()  {
		try{  
			 
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			  
 
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","nisar","nisar123");  
			  
			
			Statement stmt= con.createStatement();
				
			ResultSet rs=stmt.executeQuery("insert into t1 values(4,'Vijay')"); 
			
			
			ResultSet rs1=stmt.executeQuery("Select * from t1");
			while(rs1.next())  
			System.out.println(rs1.getInt(1)+"  "+rs1.getString(2));  
			  
			//step5 close the connection object  
			con.close();  
			  
			}catch(Exception e){ System.out.println(e);}  
			  
			} */
 
		Frames(){  
		Button b=new Button("click me");  
		b.setBounds(30,100,80,30);// setting button position  
		add(b);//adding button into frame  
		setSize(300,300);//frame size 300 width and 300 height  
		setLayout(null);//no layout manager  
		setVisible(true);//now frame will be visible, by default not visible  
		}  
		
		
		public static void main(String args[]){  
		Frames f=new Frames();  
		}
	}


