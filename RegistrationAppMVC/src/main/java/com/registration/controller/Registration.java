package com.registration.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import com.registration.model.User;
import com.registration.dao.UserDAO;

@WebServlet("/register")
public class Registration extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public Registration() {
        super();
    }

    @Override
    protected void doPost(HttpServletRequest request,
                           HttpServletResponse response)
            throws ServletException, IOException {

        System.out.println("Registration Controller Started");

        // Get data from HTML form
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String confirmPassword = request.getParameter("confirmPassword");
        String mobile = request.getParameter("mobile");
        String gender = request.getParameter("gender");
        String dob = request.getParameter("dob");
        String city = request.getParameter("city");

        // Create Model object
        User user = new User();

        user.setName(name);
        user.setEmail(email);
        user.setPassword(password);
        user.setConfirmPassword(confirmPassword);
        user.setMobile(mobile);
        user.setGender(gender);
        user.setDob(dob);
        user.setCity(city);
        user.setTerms(true);

        // Create DAO object
        UserDAO dao = new UserDAO();

        // Save user
        boolean result = dao.registerUser(user);

        // Response
        if (result) {

            response.sendRedirect("success.jsp");

        } else {

            response.sendRedirect("error.jsp");

        }
    }
}