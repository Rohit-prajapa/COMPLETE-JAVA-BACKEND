package com.telusko.jdbclearning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class LaunchApp5 {

    public static void main(String[] args) {

        try {

            // 1. Load and register MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Establish the connection
            String url = "jdbc:mysql://localhost:3306/jdbc";
            String user = "root";
            String password = "admin@123";

            Connection connect = DriverManager.getConnection(url, user, password);

            System.out.println("Database connected successfully!");

            // 3. SQL Query
            String sql = "INSERT INTO studentInfo(id, name, age, city) VALUES (?, ?, ?, ?)";

            // 4. Create PreparedStatement
            PreparedStatement preparestatement = connect.prepareStatement(sql);

            // 5. Take input from user
            Scanner sc = new Scanner(System.in);

            System.out.println("Please Enter the Following Details:");

            System.out.println("Enter Your Id:");
            int id = sc.nextInt();

            sc.nextLine(); // consume leftover newline

            System.out.println("Enter Your Name:");
            String name = sc.nextLine();

            System.out.println("Enter Your Age:");
            int age = sc.nextInt();

            sc.nextLine(); // consume leftover newline

            System.out.println("Enter Your City:");
            String city = sc.nextLine();

            // 6. Set values in PreparedStatement
            preparestatement.setInt(1, id);
            preparestatement.setString(2, name);
            preparestatement.setInt(3, age);
            preparestatement.setString(4, city);

            // 7. Execute INSERT query
            int n = preparestatement.executeUpdate();

            // 8. Process result
            if (n > 0) {
                System.out.println("Data inserted successfully!");
                System.out.println("Rows affected: " + n);
            } else {
                System.out.println("Data not inserted.");
            }

            // 9. Close resources
            preparestatement.close();
            connect.close();
            sc.close();

        } catch (ClassNotFoundException e) {

            System.out.println("MySQL JDBC Driver not found!");
            e.printStackTrace();

        } catch (SQLException e) {

            System.out.println("Database error occurred!");
            e.printStackTrace();
        }
    }
}