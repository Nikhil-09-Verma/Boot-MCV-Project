<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit</title>
</head>
<body>

<h1 style="color: red; text-align: center;">Edit form</h1>

	<frm:form modelAttribute="stu">
		<table border="0" bgcolor="cyan" align="center">
			<tr>
				<td>Student No::</td>
				<td><frm:input path="sno" readonly="true" /></td>
			</tr>
			
			<tr>
				<td>student Name::</td>
				<td><frm:input path="sname" /></td>
			</tr>
			
			<tr>
				<td>student  Course::</td>
				<td><frm:input path="course" /></td>
			</tr>
			<tr>
				<td>student fees::</td>
				<td><frm:input path="fee" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="edit"></td>
			</tr>

		</table>




	</frm:form>
	
	<h2 style="color: red; text-align: center;" ><a href="./">Home</a></h2>
</body>
</html>