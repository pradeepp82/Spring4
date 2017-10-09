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
</head>
<body>
	<form:form action="editUrl.do"  method="post" modelAttribute="edit">
	<div class="d1">
	<c:forEach items="${list1}"  var="listValue">
		<table class="t1">
		<tr>
					<td><form:hidden path="cid" value="${listValue.cid}"/></td>
					</tr>
		<tr>
					<td>Course Name</td>
					<td><form:input path="cName" value="${listValue.cName}" /></td>
					
					</td>
				</tr>
			<tr>
				<td>Facality Name</td>
				<td><form:input path="facalityName" value="${listValue.facalityName}" /></td>
			</tr>
			<tr>
				<td>Start Date</td>
				<td><form:input path="cStartDate" value="${listValue.cStartDate}" /></td>
			</tr>
			<tr>
				<td>End Date</td>
				<td><form:input path="cEndDate" value ="${listValue.cEndDate}"/></td>
			</tr>
			<tr>
				<td><form:button value="submit">Update</form:button></td>
			</tr>
		</table>
					</c:forEach>
		
	</div>
	</form:form>
</body>
</html>