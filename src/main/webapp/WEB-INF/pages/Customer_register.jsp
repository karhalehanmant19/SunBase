<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form:form modelAttribute="cum">
	<table>
		<tr>
			<td>CUSTOMER Id</td>
			<td> <form:input path="id"/> </td>
		</tr>
		<tr>
			<td>FIRST NAME</td>
			<td> <form:input path="firstName"/> </td>
		</tr>
		<tr>
			<td>LAST NAME</td>
			<td> <form:input path="lastName"/> </td>
		</tr>
		<tr>
			<td>STREET</td>
			<td> <form:input path="street"/> </td>
		</tr>
		<tr>
			<td>ADDRESS</td>
			<td> <form:input path="address"/> </td>
		</tr>
		<tr>
			<td>CITY</td>
			<td> <form:input path="city"/> </td>
		</tr>
		<tr>
			<td>STATE</td>
			<td> <form:input path="state"/> </td>
		</tr>
		<tr>
			<td>EMAIL</td>
			<td> <form:input path="email"/> </td>
		</tr>
		<tr>
			<td>PHONE NUMBER</td>
			<td> <form:input path="phoneNumber"/> </td>
		</tr>
	
		<tr>
			<td>
				<input type="submit" value="Customer_register">
			</td>
		</tr>
	</table>


</form:form>
</body>
</html>