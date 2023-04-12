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
String un=request.getParameter("t1");
out.println("Name is"+un);

String pass=request.getParameter("t2");
out.println("Password is"+pass);

String email=request.getParameter("t3");
out.println("Email is"+email);

String mobile=request.getParameter("t4");
out.println("Mobile is"+mobile);

%>

</body>
</html>