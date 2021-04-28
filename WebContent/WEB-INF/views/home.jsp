<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>HOLA</h1>

	<table border="1">
		<tr>
			<td>descripcion</td>
			<td>tipo/td>
		</tr>

		<c:forEach items="${estados }" var="estado">
			<tr>
				<td>${estado.descripcion }</td>
				<td>${estado.tipo }/td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>