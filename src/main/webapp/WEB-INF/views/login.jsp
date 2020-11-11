<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	<h2>Login Details</h2>
	<Form action="processlogin" method="post">
		User Name <input type="text" name="uname" /> 
		<Br /> 
		Password <input	type="password" name="pwd" /> 
		<Br /> 
		<Input type="Submit" value="Process" />
	</Form>
</body>
</html>