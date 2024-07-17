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

<form:form modelAttribute="user">
	<table>
		<tr>
			<td>Login id</td>
			<td> <form:input path="login_id"/> </td>
		</tr>
	
		<tr>
			<td>Password</td>
			<td> <form:input path="password" /> </td>
		</tr>
		<tr>
			<td>
				<input type="submit" value="customer_report">
			</td>
		</tr>
	</table>


</form:form>

</body>
<style type="text/css">
	body{
            background-color: blanchedalmond;
            color: brown;
        }
        table{
            padding: 70px 0;
            border: 3px solid green;
            background-color: rgb(255, 255, 255);
            text-align: center;
            
        }
        td{
            color:red;
        }
</style>
</html>