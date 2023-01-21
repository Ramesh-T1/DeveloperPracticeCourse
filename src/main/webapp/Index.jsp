<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HomePage</title>
</head>
<body>
MVC Home page <br/>
<a href="<%=request.getContextPath() %>/controller?page=Login">Login</a>
<br/>
<a href="<%=request.getContextPath() %>/controller?page=SignUp">SignUp</a>
<br/>
<a href="<%=request.getContextPath() %>/controller?page=about">about</a>
</body>
</html>