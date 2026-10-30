package com.telusko.jdbclearning;
import java.sql.*;
public class LaunchApp1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		   Class.forName("com.mysql.cj.jdbc.Driver");
		   String url="jdbc:mysql://localhost:3306/jdbc";
		   String user="root";
		   String password="admin@123";
		   
		   Connection connect = DriverManager.getConnection(url, user, password); 
		   Statement statement = connect.createStatement();
		   
		   
		   String sql="insert into studentInfo(id,name, age,city) values(101,'Rahul',30,'Mumbai ')";
		   int n=statement.executeUpdate(sql);
		   if(n==0) {
			   System.out.println("Not able to insert Data");
		   }
		   else {
			   System.out.println("Data Inserted Successfully!!!");
		   }
		   statement.close();
		   connect.close();
	}

}
