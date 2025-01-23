<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Displayform</title>
</head>
<body>

<form action="displayForm" method="post" modelAttribute="user">
<table align="center">

<tr>
<td> Welcome:</td>
<td><core:out value="${user.userName}"/></td>
</tr>

<tr>
<td> Your Email:</td>
<td><core:out value="${user.email}"/></td>
</tr>

</table>
 
</form>



</body>
</html>