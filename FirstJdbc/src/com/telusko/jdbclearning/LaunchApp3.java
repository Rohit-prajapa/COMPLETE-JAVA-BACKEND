package com.telusko.jdbclearning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LaunchApp3 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		 String url="jdbc:mysql://localhost:3306/jdbc";
		 String user="root";
		 String password="admin@123";
		 
		Connection connect = DriverManager.getConnection(url, user, password); 
		 Statement statement = connect.createStatement();
		String sql="select * from studentInfo";
		ResultSet rs=statement.executeQuery(sql);
		
		while(rs.next()) {
//			int id=rs.getInt(1);
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));
			
		}
		

	}

}
