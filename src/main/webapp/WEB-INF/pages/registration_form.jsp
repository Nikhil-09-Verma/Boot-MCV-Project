<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration</title>
</head>
<body>
<h1 style="color: red; text-align: center;">Register Student</h1>
<frm:form method="POST" action="register" modelAttribute="stu">
		<table border="0" bgcolor="cyan" align="center">
			<tr>
				<td>Enter Student name::</td>
				<td><frm:input path="sname" /></td>
			</tr>
			<tr>
				<td>Enter Student  course::</td>
				<td><frm:input path="course" /></td>
			</tr>
			<tr>
				<td>Enter Student fees::</td>
				<td><frm:input path="fee" /></td>
			</tr>
			<tr>
				<td>countries::</td>
				<td><frm:select path="country">
				<frm:options items="${cList }"/>
				</frm:select>
				</td>
			</tr>
			<tr>
				<td><input type="submit" value="register"></td>
			</tr>

		</table>
		
		




	</frm:form>
	
	<h2 style="color: red; text-align: center;" ><a href="./">Home</a></h2>
	
</body>
</html>