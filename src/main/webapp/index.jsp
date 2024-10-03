<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>My First JSP Page</title>
</head>
<body>
<h1>Welcome to My JSP Page!</h1>
<p>This is a simple JSP page running on a Maven web application.</p>

<%-- This is an example of embedding Java code in a JSP file --%>
<%
    String message = "Hello from Java code!";
    out.println("<p>" + message + "</p>");
%>
</body>
</html>
