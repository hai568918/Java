<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%= request.getAttribute("userName0") %>
	<form action='Servlet3'>
		<input type='hidden' name='uname1' value='<%= request.getAttribute("userName0") %>'>
		<input type='hidden' name='uname2' value='<%= request.getAttribute("userName1") %>'>
		<input type='hidden' name='uname3' value='<%= request.getAttribute("userName2") %>'>
		<input type='submit' value='go'>
	</form>
</body>
</html>