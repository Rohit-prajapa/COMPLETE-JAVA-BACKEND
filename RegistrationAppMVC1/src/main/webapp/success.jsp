
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Registration Success</title>
</head>
<body>

    <h1>Successfully Registered!</h1>

    <%
        String name = (String) session.getAttribute("name");
    %>

    <h2>Congratulations <%= name %>!</h2>

    <p>Your registration has been completed successfully.</p>

    <a href="index.html">Register Another Student</a>

</body>
</html>
