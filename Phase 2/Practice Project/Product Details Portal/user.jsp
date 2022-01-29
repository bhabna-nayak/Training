<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Details Entered</title>
</head>
<body>
<br><br>ID - <%= session.getAttribute("id") %> 
<br><br>First Name - <%= session.getAttribute("name1") %> 
<br><br>Last Name - <%= session.getAttribute("name2") %> 
<br><br>Password - <%= session.getAttribute("password") %>
</body>
</html>