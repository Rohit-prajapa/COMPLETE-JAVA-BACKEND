package com.telusko.jdbclearning;

import java.sql.*;

public class LaunchApp1 {

    public static void main(String[] args) throws SQLException {

        try {

            // 1. Load and register the Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Establish the connection
            String url = "jdbc:mysql://localhost:3306/jdbclearning";
            String username = "root";
            String password = "admin@123";

            Connection connect = DriverManager.getConnection(url, username, password);

            System.out.println("Database Connected Successfully!");

            // 3. Create Statement
            Statement statement = connect.createStatement();

            // 4. INSERT Operation
            String insertSql = "INSERT INTO studentInfo(id, name, age, city) VALUES "
                    + "(1, 'Rohit', 19, 'Varanasi'),"
                    + "(2, 'Ravi', 20, 'Mumbai')";

            // Uncomment to execute INSERT
            // int inserted = statement.executeUpdate(insertSql);
            // System.out.println(inserted + " Rows Inserted");

            // 5. UPDATE Operation
            String updateSql = "UPDATE studentInfo SET age=37 WHERE name='Rohit'";

            // Uncomment to execute UPDATE
            // int updated = statement.executeUpdate(updateSql);
            // System.out.println(updated + " Rows Updated");

            // 6. SELECT Operation
            String selectSql = "SELECT * FROM studentInfo";

            ResultSet rs = statement.executeQuery(selectSql);

            while (rs.next()) {

                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Age: " + rs.getInt("age"));
                System.out.println("City: " + rs.getString("city"));

                System.out.println("-----------------------");
            }

            rs.close();

            // 7. DELETE Operation
            String deleteSql = "DELETE FROM studentInfo WHERE id=1";

            // Uncomment to execute DELETE
            // int deleted = statement.executeUpdate(deleteSql);
            // System.out.println(deleted + " Rows Deleted");

            // 8. Close resources
            statement.close();
            connect.close();

            System.out.println("Connection Closed Successfully!");

        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        catch(Exception e) {
        	e.printStackTrace();
        }
        finally {
           Connection sc = null;
		   sc.close();
        }

    }
}