<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>login page</h1>

	<form action="stuSignIn.do" method="POST"
		modelAttribute="UserDtoKey">
		<table width="100%" border="0">
			<tr>
				<td>User Name: <form:input path="emailId" id="emailId" /></td>
			</tr>
			
			<tr>
				<td>Password: <form:input path="password" id="password" /></td>
			</tr>
			
			<tr> 
			    <td><input type="submit" value="Submit" /></td>
			</tr>


		</table>

	</form>
</body>
</html>