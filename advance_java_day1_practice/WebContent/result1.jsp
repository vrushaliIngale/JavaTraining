<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Welcome to page <%=request.getAttribute("name") %></h3>
<h5>You're details are given below</h5>
<h3><%=request.getAttribute("rollno") %></h3>
<h3><%=request.getAttribute("name") %></h3>
<h3><%=request.getAttribute("age") %></h3>
<h3><%=request.getAttribute("course") %></h3>
</body>
</html>