package com.registration.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import com.registration.dao.UserDAO;
import com.registration.model.User;

@WebServlet("/profile")
public class ProfileServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession(false);

        // Check login
        if (session == null ||
            session.getAttribute("email") == null) {

            response.sendRedirect("login.html");
            return;
        }

        // Get email from session
        String email = (String) session.getAttribute("email");

        // Get user from database
        UserDAO dao = new UserDAO();

        User user = dao.getUserByEmail(email);

        if (user != null) {

            // Send User object to JSP
            request.setAttribute("user", user);

            request.getRequestDispatcher("profile.jsp")
                   .forward(request, response);

        } else {

            response.sendRedirect("error.jsp");
        }
    }
}