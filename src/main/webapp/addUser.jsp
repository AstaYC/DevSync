<%--
  Created by IntelliJ IDEA.
  User: Youcode
  Date: 10/4/2024
  Time: 07:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Add User</title>
</head>
<body>
<h2>Register New User</h2>

<form action="addUser" method="post">
  <label for="username">Username:</label>
  <input type="text" id="username" name="username" required><br><br>

  <label for="password">Password:</label>
  <input type="password" id="password" name="password" required><br><br>

  <label for="firstName">First Name:</label>
  <input type="text" id="firstName" name="firstName" required><br><br>

  <label for="lastName">Last Name:</label>
  <input type="text" id="lastName" name="lastName" required><br><br>

  <label for="email">Email:</label>
  <input type="email" id="email" name="email" required><br><br>

  <input type="submit" value="Register">
</form>

<a href="listUsers">Back to User List</a>
</body>
</html>

