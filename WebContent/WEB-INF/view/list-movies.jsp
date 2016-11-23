<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link rel="stylesheet" type="text/css" 
href="${pageContext.request.contextPath}/resources/css/main.css">
<title>Movies</title>
</head>
<body>
<div class="main">
<p style="text-align:right;color:red;font-size:0.8em">ver20Nov2016</p>
New Content here

<p><a href="showFormMovies" class="button">Add Movie</a></p>

<table class="del">
<tr><td>by Id</td><td><form action="deleteMovie1">
<input type="text" name="id"/>
<input type="submit" value="Delete" class="save"/>
</form></td>
<td>by Title</td><td><form action="deleteMovie2">
<input type="text" name="title"/>
<input type="submit" value="Delete" class="save"/>
</form></td></tr>
<tr><td>by Director</td><td><form action="deleteMovie3">
<input type="text" name="director"/>
<input type="submit" value="Delete" class="save"/>
</form></td>
<td>by Year</td><td><form action="deleteMovie4">
<input type="text" name="year"/>
<input type="submit" value="Delete" class="save"/>
</form></td></tr>
</table>
<table>
<tr><th colspan="4">TOP MOVIES</th></tr>
<tr>
<th>Id</th>
<th>Title</th>
<th>Director</th>
<th>Year</th>
</tr>
<c:forEach var="movie" items="${movies}">
<tr>
<td>${movie.id}.</td>
<td>${movie.title}</td>
<td>${movie.director}</td>
<td>${movie.year}</td>
</tr>
</c:forEach>

</table>
</div>
</body>
</html>