<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Form</title>
</head>
<body>
<form:form modelAttribute="user" action="reg" method="post">
  <form:label path="name">Name</form:label>
  <form:input path="name"/>
  <br><br>
  <form:label path="age">Age</form:label>
  <form:input path="age"/>
  <br><br>
  <form:label path="phone">Phone</form:label>
  <form:input path="phone"/>
  <br><br>
  <form:label path="password">Password</form:label>
  <form:input path="password"/>
  <br><br>
  
<form:button >Register</form:button>
<br>

<a href="login">LOGIN</a>

</form:form>
</body>
</html>