<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>JSP Web Application To Generate Dynamic Response</h1>

 <%@ page import="java.util.Date"

  %>
<%!

int age=18;


%>
<%

String name=request.getParameter("name");
String city=request.getParameter("city");

   Date date=new Date();

out.println("Name is :"+name);

%>
<h1><%= date %></h1>
<h2><%=city %></h2>
</body>
</html>