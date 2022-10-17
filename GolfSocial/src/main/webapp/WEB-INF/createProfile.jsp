<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>




<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create Profile</title>
</head>
<body>
<h1>Create Profile</h1>

<form action="submitCreate.do">
  <label for="firstName">First name:</label>
  <input type="text" id="firstName" name="firstName"><br><br>
  <label for="lastName">Last name:</label>
  <input type="text" id="lastName" name="lastName"><br><br>
  <label for="handicap">Handicap:</label>
  <input type="text" id="handicap" name="handicap"><br><br>
  <label for="city">City:</label>
  <input type="text" id="city" name="city"><br><br>
  <label for="state">State:</label>
  <input type="text" id="state" name="state"><br><br>
  <label for="picture">Profile Picture Url:</label>
  <input type="text" id="picture" name="picture"><br><br>
  <input type="submit" value="Submit">
</form>


</body>
</html>