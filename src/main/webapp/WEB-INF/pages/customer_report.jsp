<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
<h1 style="color:red;text-alignt:center">Register Employee</h1>
<a href="/add">Add Employee</a>
<c:choose>
	<c:when test="${!empty CustomerData}">
		<h1>waiting for record</h1>
	
	</c:when>
	<c:otherwise>
		<h1>Records not Found</h1>
	</c:otherwise>

</c:choose><br><br>
</body>
</html>