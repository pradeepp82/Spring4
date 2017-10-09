<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>EMPLOYEE REGISTRATIONS</title>
<style type="text/css">
div{
background-color:#0AF2C0;
color: #000104; }
b{ font-size: 22px;}
</style>
</head>
<body>
<form:form action="EmpRegister.do" modelAttribute="emp" method="post">
<div>
<table>

<tr>
<td><label><b>Name</b></label></td>
<td> <form:input path="name"/> </td>
</tr>
<tr>
<tr>
<td><label><b>Mobile No</b></label></td>
<td> <form:input path="mobNo"/> </td>
</tr>
<tr>
<tr>
<td><label><b>Pin Number</b></label></td>
<td> <form:input path="listAdd[0].pNo"/> </td>
</tr> 
<tr>
<tr>
<td><label><b>City Name</b></label></td>
<td> <form:input path="listAdd[0].city"/></td>
</tr>
<tr>
<tr>
<td><label><b>State Name</b></label></td>
<td> <form:input path="listAdd[0].state"/></td>
</tr>
<tr>
<td> <input type="submit" value="submit"> </td>
</tr>
</table>
</div>
</form:form>
</body>
</html>