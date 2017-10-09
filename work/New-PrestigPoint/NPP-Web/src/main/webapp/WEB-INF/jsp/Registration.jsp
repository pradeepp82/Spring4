<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>
<meta charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
.ta
{
margin-top: 25px;
}

div.tab{
background-color:black;
color:white;padding:20px;
}
div.link
{
background-color:#e11717;
color:white;padding:20px;
}
span
{

color: white;
}
a
{
text-decoration:none;
}
a :HOVER {
	text-shadow: 0 0 3px #000000, 0 0 5px #000000;
}
</style>
</head>
<body>
<form:form method="post" action="saveRegist.do" modelAttribute="user">
<div class="link">
<h2><a href="Registration.do?lang=hi_IN"><span>Hindi</span></a></h2> 
</div>
<div class="link">
<h2><a href="Registration.do?lang=en"><span>English</span></a></h2> 

</div>
<div class="tab">

<table border="0" width="100%" class="ta">
			
			<tr>
			<td><label> <strong><spring:message code="label.fname" text="fname"></spring:message></strong>
			</label></td>
			<td><form:input path="fname"/></td>
			<td><form:errors path="fname" style="color:red;"></form:errors></td>
			<tr>
			
				<td><label><strong><spring:message code="label.lname"></spring:message></strong></label></td>
				<td><form:input path="lname"/></td>
				<td><form:errors path="lname" style="color:red;"></form:errors></td>
			</tr>
			<tr>
			
				<td><label><strong><spring:message code="label.address"></spring:message></strong></label></td>
				<td><form:input path="address"/></td>
				<td><form:errors path="address" style="color:red;"></form:errors></td>
			</tr>
			<tr>
			
				<td><label><strong><spring:message code="label.mobileNo"></spring:message></strong></label></td>
				<td><form:input path="mobileNo" /></td>
				<td><form:errors path="mobileNo" style="color:red;"></form:errors></td>
			</tr>
			<tr>
			
				<td><label><strong><spring:message code="label.email"></spring:message></strong></label></td>
			<td><form:input path="email"/></td>
		<td><form:errors path="email" style="color:red;"></form:errors></td>
			</tr>
			<tr> 
			
				<td><label><strong><spring:message code="label.password"></spring:message></strong></label></td>
				<td><form:input path="password"/></td>
				<td><form:errors path="password" style="color:red;"></form:errors></td>
			</tr>
			<tr>
			<td><spring:message code="label.submit" var="labelSubmit"></spring:message></td>
				<td><input type="submit" value="${labelSubmit}"></td>
			</tr>
</table>
</div>
</form:form>


</body>
</html>