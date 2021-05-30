<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 	<jsp:useBean id="account" class="Hai.model.Account" scope="request" />
 		<%= account.getUsername()%>
 		<%= account.getPassword()%>
 	Output:<%=(String) getServletContext().getAttribute("name") %>
	<a href="http://localhost:8080/ServletDemo/Servlet2">Servlet2</a>    
 	
 	
</body>
</html>