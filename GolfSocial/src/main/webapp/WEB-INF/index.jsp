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
		<li>${player.lastName}</li>
		<li>${player.handicap}</li>
		<li>${player.city}</li>
		<li>${player.state}</li>
		<li>${player.image}</li>





	</c:forEach>

 <form action="create.do" method="post"><button type="submit">Create Profile</button></form>
 <form action="deleteProfile" method="post"><button type="submit">Delete Profile</button></form>
 <form action="updateProfile" method="post"> <button type="submit">Update Profile</button></form>

</body>
</html>