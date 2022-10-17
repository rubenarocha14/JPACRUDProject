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
		<li>ID:${player.id}</li>
		<li>First Name: ${player.firstName}</li>
		<li>Last Name: ${player.lastName}</li>
		<li>Handicap: ${player.handicap}</li>
		<li>City: ${player.city}</li>
		<li>State: ${player.state}</li>
		<li>Image: ${player.image}</li>
		<hr>





	</c:forEach>


	<form action="create.do" method="GET">
		<button type="submit">Create New Profile</button>
	</form>

	<form action="delete.do" method="POST">
		<input name="playerId" value="${player.id }" type="text" /> <input
			name="submit" value="Delete By Id" type="submit" />
	</form>
	
	<form action="chooseProfileToUpdate.do" method="POST">
		<input name="playerId" value="id" type="text" /> 
		<input name="submit" value="Update By Id" type="submit" />
	</form>

</body>
</html>