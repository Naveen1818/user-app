<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Page</title>
</head>
<body>
	 <c:if test="${u!=null }">   
		<form:form action="Edit" modelAttribute="user">
		
			<form:label path="id">ID</form:label>
			<form:input path="id" value="${u.getId()}" readonly="true" />
			<br>
			<form:label path="name">Name</form:label>
			<form:input path="name" value="${u.getName() }" />
			<br>
			<form:label path="age">Age</form:label>
			<form:input path="age" value="${u.getAge() }" />
			<br>
			<form:label path="phone">Phone</form:label>
			<form:input path="phone" value="${u.getPhone }" />
			<br>
			<form:label path="password">Password</form:label>
			<form:input path="password" value="${u.getPassword() }" />
			<br>
			<form:button>Update</form:button>
		</form:form>
	 </c:if>
</body>
</html>