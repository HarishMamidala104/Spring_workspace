<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container">
		<form:form action="update"  modelAttribute="EditList">
		<table>
		<tr><form:hidden path="pid" />
			</tr>
			<tr>Employee Name:<form:input path="pname" />
			</tr>
			<tr>
				Qty:
				<form:input path="Qty"/>
			</tr>
			<tr>
				price
				<form:input path="price"  />
			</tr>
			</br>
			<tr>
				<input type="submit" value="update">
			</tr>
		</table>
	</form:form>
	</div>
</body>
</html>