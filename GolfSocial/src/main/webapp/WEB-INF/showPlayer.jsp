<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>

${player.firstName},${player.lastName}, ${player.handicap}, ${player.city},
${player.state, ${player.imageUrl}} ">
<a href="update.do?id=${player.id}">Update Property</a>

</body>
</html>