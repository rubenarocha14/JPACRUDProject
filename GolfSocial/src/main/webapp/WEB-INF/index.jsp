<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>



<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>GolfSocial - Home</title>
</head>
<body>


	<h1>Golf Social</h1>
	<h3></h3>

	<c:forEach var="player" items="${players}">
		<li>${player.firstName}</li>





	</c:forEach>

</body>
</html>