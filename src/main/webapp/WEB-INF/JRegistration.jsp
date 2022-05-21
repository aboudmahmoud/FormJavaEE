<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
 String  messg = (String) request.getAttribute("Messge");
 String name = request.getParameter("uname");
 
 out.print(messg+" "+ name);
%>
</body>
</html>