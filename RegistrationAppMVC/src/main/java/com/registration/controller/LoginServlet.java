package com.registration.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import com.registration.dao.UserDAO;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request,
                           HttpServletResponse response)
            throws ServletException, IOException {

        // Get login details
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        // Create DAO object
        UserDAO dao = new UserDAO();

        // Check login
        boolean result = dao.loginUser(email, password);

        if (result) {

            // Create session
            HttpSession session = request.getSession();

            // Store email in session
            session.setAttribute("email", email);

            // Go to dashboard
            response.sendRedirect("dashboard.jsp");

        } else {

            // Login failed
            response.sendRedirect("loginError.jsp");
        }
    }
}