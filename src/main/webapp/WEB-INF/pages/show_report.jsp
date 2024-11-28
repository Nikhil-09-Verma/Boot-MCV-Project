<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Report</title>
</head>
<body>
	<c:choose>
		<c:when test="${!empty StuList}">
			<table bgcolor="cyan" align="center">
				<tr bgcolor="yellow">
					<th>Student No</th>
					<th>Student Name</th>
					<th>cource</th>
					<th>fees</th>
					<th>operations</th>


				</tr>
				<c:forEach var="stu" items="${StuList}">
					<tr bgcolor="pink">
						<td>${stu.sno }</td>
						<td>${stu.sname}</td>
						<td>${stu.cource}</td>
						<td>${stu.fee}</td>
						<td><a href="edit?no=${stu.sno }">Edit</a> <a
							href="delete?no=${stu.sno }"
							onclick="return confirm('are you sure to delete')">delete</a></td>
					</tr>


				</c:forEach>

			</table>
		</c:when>
		<c:otherwise>
			<h1 style="color: red; text-align: center;">Record not found</h1>

		</c:otherwise>
	</c:choose>
	<h1 style="color: red; text-align: center;">
		<a href="./">Home</a>
	</h1>
</body>
</html>