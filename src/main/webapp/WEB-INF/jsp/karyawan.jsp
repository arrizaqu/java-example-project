<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ page isELIgnored="false" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<td>name</td>
				<td>email</td>
			</tr>
		</thead>
		<tbody>
			
			<c:forEach var="emp" items="${requestScope.kars }">
				<tr>
					<td>${emp.name }</td>
					<td><c:out value="${emp.email }"/></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>