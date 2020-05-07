<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring Boot</title>
</head>
<body>
<h1>Spring Boot - Web Application Demo</h1>
<hr>

<h3>Enter user's ID:</h3>
<div class="form">
	<form action="userview" method="post" onsubmit="return validate()" >
		<table>
			<tr>
				<td>Id</td>
				<td><input id="Id" name="Id"></td>
			</tr>
			<tr>
                    <td><input type="submit" value="Log in"/></td>
            </tr>
		</table>
	</form>
	<br>

<hr>
 <button type="button" name="back" onclick="history.back()">back</button>   
    
</body>
</html>