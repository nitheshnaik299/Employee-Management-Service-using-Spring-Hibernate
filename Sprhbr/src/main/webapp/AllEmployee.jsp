<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<center><h2>All Employee Information</h2></center>
<table class="w3-table w3-bordered w3-striped w3-border">
<tr class="w3-green">
	<th>Employee Id</th>
	<th>Employee Name</th>
	<th>Date of Birth</th>
	<th>Salary</th>
	<th>Delete</th>
	<th>Update</th>
</tr>
<c:forEach items="${empList}" var="emp">
<tr>
<td>${emp.id}</td>
     <td>${emp.empname}</td>
     <td>${emp.age}</td>
</tr>
</c:forEach>
</table>
</body>
</html>