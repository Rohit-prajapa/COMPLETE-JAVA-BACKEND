
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Registration Failed</title>
</head>
<body>

    <h1>Failed to Register!</h1>

    <%
        String name = (String) session.getAttribute("name");
    %>

    <h2>
        Hey <%= name %>, You Could Not Register Successfully!
    </h2>

    <a href="index.html">Try Again</a>

</body>
</html>
