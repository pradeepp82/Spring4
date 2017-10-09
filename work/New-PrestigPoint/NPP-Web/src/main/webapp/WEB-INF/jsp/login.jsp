<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
.div1{
border:0px  ;
box-shadow: 15px 15px 20px 7px  #e74c3c;
background-color: 	#C6E2FF;

padding:10px;
display: inline-block;
margin-left: 20px;
margin-top: 20px;
border-radius:10px;
}
.email
{
margin-bottom: 15px;
}

</style>
</head>
<body>
	<form:form method="post" action="saveLogin.do" modelAttribute="user">
	<div class="div1">
		<table border="0" width="100%">
			<tr>
				<td><label>UserName</label></td>
				<td><form:input cssClass="email" path="email" id="email" /></td>
				<td><form:errors path="email" style="color:red;"></form:errors></td>
			</tr>
			<tr>
				<td><label>Password</label></td>
				<td><form:input cssClass="pass" path="password" id="password" /></td>
				<td><form:errors path="password" style="color:red;"></form:errors></td>
			</tr>
			<tr>
				<td><input type="submit" value="Submit"></td>
			</tr>
</table>
</div>
</form:form>
</body>
</html>