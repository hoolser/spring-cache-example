<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring Boot</title>

<link rel="stylesheet" href="/resources/css/style.css">
<script type="text/javascript" src="/resources/js/app.js"></script>


</head>
<body>
<h1>Spring Boot - Web Application Demo</h1>
<hr>
<h3>Register:</h3>
<div class="form">
	<form action="hello" method="post" onsubmit="return validate()" >
		<table>
			<tr>
				<td>Name</td>
				<td><input id="name" name="name"></td>
			</tr>
			<!---->
			 <tr>
				<td>Surname</td>
				<td><input id="surname" name="surname"></td>
			</tr>
			<tr>
				<td>Phone</td>
				<td><input id="phone" name="phone"></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input id="email" name="email"></td>
			</tr> 
			<tr>
                    <td><input type="submit" value="Submit"/></td>
            </tr>
		</table>
	</form>
	<br>
	<hr>
	<button onclick="location.href = '/login';" id="Login" class="float-left submit-button" >Log in</button>
</div>
<!-- div class="form">
	<form:form method="POST" action="/spring-mvc-xml/addData" modelAttribute="data">
		<table>
			<tr>
				<td>Name</td>
				<td><input id="name" name="name"></td>
			</tr>
			<tr>
				<td>Surname</td>
				<td><input id="surname" name="surname"></td>
			</tr>
			<tr>
				<td>Phone</td>
				<td><input id="phone" name="phone"></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input id="email" name="email"></td>
			</tr>
			<tr>
                    <td><input type="submit" value="Submit"/></td>
            </tr>
		</table>
	</form:form>
</div-->

</body>
</html>