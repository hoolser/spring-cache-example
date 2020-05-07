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

<h2>Submitted Information</h2>
    <table>
    	<tr>
			<td>Id</td>
			<td>${Id}</td>
		</tr>
        <tr>
            <td>Name :</td>
            <td>${name}</td>
        </tr>
        <tr>
            <td>Surname :</td>
            <td>${surname}</td>
        </tr>
        <tr>
            <td>Phone :</td>
            <td>${phone}</td>
        </tr>
        <tr>
            <td>Email :</td>
            <td>${email}</td>
        </tr>
    </table>
 <hr>
 <button type="button" name="back" onclick="history.back()">back</button>   
    
</body>
</html>