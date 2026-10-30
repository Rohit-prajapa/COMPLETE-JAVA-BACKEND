package com.telusko.jdbclearning;

import java.sql.*;
import java.util.Scanner;

public class LaunchApp2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            // Load and register Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish Connection
            String url = "jdbc:mysql://localhost:3306/jdbclearnig";
            String username = "root";
            String password = "admin@123";

            Connection connect = DriverManager.getConnection(url, username, password);

            System.out.println("Database Connected Successfully!");

            Statement statement = connect.createStatement();

            System.out.println("\n1. Insert Student");
            System.out.println("2. Update Student");
            System.out.println("3. Delete Student");
            System.out.println("4. Display Students");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

            case 1:

                System.out.print("Enter Student ID: ");
                int id = sc.nextInt();

                sc.nextLine();

                System.out.print("Enter Student Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Student Age: ");
                int age = sc.nextInt();

                sc.nextLine();

                System.out.print("Enter Student City: ");
                String city = sc.nextLine();

                String insertSql = "INSERT INTO studentInfo VALUES ("
                        + id + ", '" + name + "', " + age + ", '" + city + "')";

                int inserted = statement.executeUpdate(insertSql);

                if (inserted > 0) {
                    System.out.println("Student Inserted Successfully!");
                }

                break;

            case 2:

                System.out.print("Enter Student ID: ");
                int updateId = sc.nextInt();

                System.out.print("Enter New Age: ");
                int newAge = sc.nextInt();

                String updateSql = "UPDATE studentInfo SET age = "
                        + newAge + " WHERE id = " + updateId;

                int updated = statement.executeUpdate(updateSql);

                System.out.println(updated > 0 ?
                        "Student Updated Successfully!" :
                        "Student Not Found!");

                break;

            case 3:

                System.out.print("Enter Student ID to Delete: ");
                int deleteId = sc.nextInt();

                String deleteSql = "DELETE FROM studentInfo WHERE id = " + deleteId;

                int deleted = statement.executeUpdate(deleteSql);

                System.out.println(deleted > 0 ?
                        "Student Deleted Successfully!" :
                        "Student Not Found!");

                break;

            case 4:

                String selectSql = "SELECT * FROM studentInfo";

                ResultSet rs = statement.executeQuery(selectSql);

                while (rs.next()) {

                    System.out.println("\nID: " + rs.getInt("id"));
                    System.out.println("Name: " + rs.getString("name"));
                    System.out.println("Age: " + rs.getInt("age"));
                    System.out.println("City: " + rs.getString("city"));

                    System.out.println("----------------------");
                }

                rs.close();

                break;

            default:
                System.out.println("Invalid Choice!");

            }

            statement.close();
            connect.close();

        }
        catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        finally {
            sc.close();
        }

    }
}