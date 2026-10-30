package com.telusko.jdbclearning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class LaunchApp4 {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	 String url="jdbc:mysql://localhost:3306/jdbc";
	 String user="root";
	 String password="admin@123";
	 Connection connect = DriverManager.getConnection(url, user, password); 
	 Statement statement = connect.createStatement();
	 String sql="delete from studentInfo where id=101";
	 int n=statement.executeUpdate(sql);
	 if(n==0) {
		 System.out.println("No data is Deleted");
	 }
	 else {
		 System.out.println("Data is Deleted successFully!!!!!");
	 }
	
}
}
