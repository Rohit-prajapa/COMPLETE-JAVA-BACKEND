package com.telusko.jdbclearning;
import java.sql.*;
public class LaunchApp2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		 String url="jdbc:mysql://localhost:3306/jdbc";
		 String user="root";
		 String password="admin@123";
		Connection connect = DriverManager.getConnection(url, user, password); 
		 Statement statement = connect.createStatement();
		 String sql="update studentInfo set name='Rohit Prajapati' where id=1";
		 int n=statement.executeUpdate(sql);
		 if(n==0) {
			 System.out.println("NOthing is happining");
		 }
		 else {
			 System.out.println("Data Update successfully!!!");
		 }
	}

}
