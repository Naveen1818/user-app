<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
       <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home page </title>
</head>
<body>
<c:if test="${user!=null }">

 <h3><a href="Edit">Edit</a></h3>
 <br>
 <h3><a href="profile">Profile</a></h3>
 <br>
 <h3><a href="delete?id=${user.getId() }">Delete</a></h3>
 <br>
<h3><a href="logout">LogOut</a></h3>
 <br>
   </c:if>
</body>
</html>