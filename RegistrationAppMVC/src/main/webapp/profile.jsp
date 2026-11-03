<%@ page language="java"
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="com.registration.model.User" %>

<%
    User user = (User) request.getAttribute("user");

    if (user == null) {
        response.sendRedirect("login.html");
        return;
    }
%>

<!DOCTYPE html>
<html>

<head>

    <meta charset="UTF-8">

    <title>My Profile</title>

    <style>

        body {
            margin: 0;

            font-family: Arial, sans-serif;

            background: linear-gradient(135deg, #667eea, #764ba2);

            min-height: 100vh;

            display: flex;

            justify-content: center;

            align-items: center;
        }

        .profile {

            width: 500px;

            background: white;

            padding: 35px;

            border-radius: 12px;

            box-shadow: 0 10px 30px rgba(0,0,0,0.25);
        }

        h1 {

            text-align: center;

            color: #333;

            margin-bottom: 25px;
        }

        .row {

            display: flex;

            justify-content: space-between;

            padding: 12px;

            border-bottom: 1px solid #eee;
        }

        .label {

            font-weight: bold;

            color: #444;
        }

        .value {

            color: #666;
        }

        .btn {

            display: block;

            text-align: center;

            margin-top: 25px;

            padding: 12px;

            background: #667eea;

            color: white;

            text-decoration: none;

            border-radius: 6px;

            font-weight: bold;
        }

    </style>

</head>

<body>

    <div class="profile">

        <h1>My Profile</h1>

        <div class="row">
            <span class="label">ID</span>
            <span class="value"><%= user.getId() %></span>
        </div>

        <div class="row">
            <span class="label">Name</span>
            <span class="value"><%= user.getName() %></span>
        </div>

        <div class="row">
            <span class="label">Email</span>
            <span class="value"><%= user.getEmail() %></span>
        </div>

        <div class="row">
            <span class="label">Mobile</span>
            <span class="value"><%= user.getMobile() %></span>
        </div>

        <div class="row">
            <span class="label">Gender</span>
            <span class="value"><%= user.getGender() %></span>
        </div>

        <div class="row">
            <span class="label">Date of Birth</span>
            <span class="value"><%= user.getDob() %></span>
        </div>

        <div class="row">
            <span class="label">City</span>
            <span class="value"><%= user.getCity() %></span>
        </div>

        <a href="dashboard.jsp" class="btn">
            Back to Dashboard
        </a>

    </div>

</body>

</html>