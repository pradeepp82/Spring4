<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style type="text/css">
.detail1 {
	margin-top: 10px;
}

.detail1 td {
	padding: 5px;
}

.course1 td {
	padding: 10px;
}

td.in {
	opacity: 0.6;
}
a:HOVER { color:red;

 }
 
 .ta2{
 border: solid 1px;
 background-color:  #B3EE3A;

 }
 .ta2 td{
 padding: 15px;
 }
 .ta1 td{
 font-size: 25px;
 }
 
</style>
<title>Insert title here</title>
</head>
<body>
	<form:form action="coureseSave.do" modelAttribute="courese"
		method="post">
		<div class="course1">
			<table class="ta1">
				<tr>
					<td>Course Name</td>
					<td class="in"><form:input path="cName"
							placeholder="Course Name" /></td>
					<td><form:errors path="cName" style="color:green;"></form:errors>
					</td>
				</tr>
				<tr>
					<td>Facality Name</td>
					<td class="in"><form:input path="facalityName"
							placeholder="Facality Name" /></td>
					<td><form:errors path="facalityName" style="color:green;"></form:errors>
					</td>
				</tr>
				<tr>
					<td>Start Date</td>
					<td class="in"><form:input path="cStartDate"
							placeholder="yyyy-mm-dd" /></td>
					<td><form:errors path="cStartDate" style="color:green;"></form:errors>
					</td>
				</tr>
				<tr>
					<td>End Date</td>
					<td class="in"><form:input path="cEndDate"
							placeholder="yyyy-mm-dd" /></td>
					<td><form:errors path="cEndDate" style="color:green;"></form:errors>
					</td>
				</tr>
				<tr>

					<td><form:button value="submit"><marquee>Submit</marquee></form:button></td>
				</tr>
			</table>
		</div>
		<div class="detail1">

			<table class="ta2" border="1px"  width="100%">

				<%-- <c:out value="${list}"></c:out> --%>
				<c:forEach items="${list}" var="listValue">
					<tr>
						<td><b>${listValue.cid}</b></td>
						<td><b>${listValue.cName}</b></td>
						<td><b>${listValue.facalityName}</b></td>
						<td><b>${listValue.cStartDate}</b></td>
						<td><b>${listValue.cEndDate}</td>
						<td><a href="delete.do?id=${listValue.cid}">Delete</a></td>
						<td><a target="_blank"  href="CourseEdit.do?id=${listValue.cid}">Edit</a></td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</form:form>
</body>
</html>