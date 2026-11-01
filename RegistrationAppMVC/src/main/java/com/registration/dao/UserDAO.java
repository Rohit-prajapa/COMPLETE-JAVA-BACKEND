package com.registration.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.ResultSet;

import com.registration.model.User;

public class UserDAO {

    // Database details
    private String url = "jdbc:mysql://localhost:3306/registration_db";
    private String username = "root";
    private String dbPassword = "admin@123";


    // =====================================================
    // REGISTRATION
    // =====================================================

    public boolean registerUser(User user) {

        boolean result = false;

        String query = "INSERT INTO users "
                + "(name, email, password, confirm_password, mobile, gender, dob, city, terms) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {

            // 1. Load MySQL Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Create Connection
            Connection con = DriverManager.getConnection(
                    url,
                    username,
                    dbPassword
            );

            // 3. Create PreparedStatement
            PreparedStatement ps = con.prepareStatement(query);

            // 4. Set values
            ps.setString(1, user.getName());
            ps.setString(2, user.getEmail());
            ps.setString(3, user.getPassword());
            ps.setString(4, user.getConfirmPassword());
            ps.setString(5, user.getMobile());
            ps.setString(6, user.getGender());
            ps.setString(7, user.getDob());
            ps.setString(8, user.getCity());
            ps.setBoolean(9, user.isTerms());

            // 5. Execute query
            int rows = ps.executeUpdate();

            if (rows > 0) {
                result = true;
            }

            // 6. Close resources
            ps.close();
            con.close();

        } catch (ClassNotFoundException e) {

            e.printStackTrace();

        } catch (SQLException e) {

            e.printStackTrace();
        }

        return result;
    }

    public User getUserByEmail(String email) {

        User user = null;

        String query = "SELECT * FROM users WHERE email = ?";

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    url,
                    username,
                    dbPassword
            );

            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, email);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                user = new User();

                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setEmail(rs.getString("email"));
                user.setPassword(rs.getString("password"));
                user.setConfirmPassword(rs.getString("confirm_password"));
                user.setMobile(rs.getString("mobile"));
                user.setGender(rs.getString("gender"));
                user.setDob(rs.getString("dob"));
                user.setCity(rs.getString("city"));
                user.setTerms(rs.getBoolean("terms"));
            }

            rs.close();
            ps.close();
            con.close();

        } catch (ClassNotFoundException e) {

            e.printStackTrace();

        } catch (SQLException e) {

            e.printStackTrace();
        }

        return user;
    }

    // =====================================================
    // LOGIN
    // =====================================================

    public boolean loginUser(String email, String password) {

        boolean result = false;

        String query = "SELECT * FROM users "
                + "WHERE email = ? AND password = ?";

        try {

            // 1. Load MySQL Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Create Connection
            Connection con = DriverManager.getConnection(
                    url,
                    username,
                    dbPassword
            );

            // 3. Create PreparedStatement
            PreparedStatement ps = con.prepareStatement(query);

            // 4. Set login values
            ps.setString(1, email);
            ps.setString(2, password);

            // 5. Execute SELECT query
            ResultSet rs = ps.executeQuery();

            // 6. Check user
            if (rs.next()) {
                result = true;
            }

            // 7. Close resources
            rs.close();
            ps.close();
            con.close();

        } catch (ClassNotFoundException e) {

            e.printStackTrace();

        } catch (SQLException e) {

            e.printStackTrace();
        }

        return result;
    }
}