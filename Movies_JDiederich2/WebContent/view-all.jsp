<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Movies: Movie List</title>
		<meta name= "description" content="This is a JSP that outputs every Movie in our database to a web page.">
<%@ include file="includes/styles.jsp" %>		
	</head>
	<body>
		<div class="container">
			<div class="hero-unit">
				<h1>Movie List</h1>
			</div>
<%@ include file="includes/navigation.jsp" %>
			<div class="container2">
				<c:choose>
					<c:when test= "${empty movies}">
					 	<p>Sorry, the list of movies is empty.</p>
				 	</c:when>
				 	<c:otherwise>
				 		<c:forEach var="movie" items="${movies}">
				 			<div class="span4">
				 				<h2>${movie.title}</h2> 
				 				<p><b>Director</b>: ${movie.director} &nbsp; &nbsp; <b>Duration</b>: ${movie.lengthInMinutes} minutes.</p>
				 				<p>${movie.movieDesc}</p>
				 			</div>
				 		</c:forEach>
				 	</c:otherwise>					 
				</c:choose>
			</div>
<%@ include file="includes/footer.jsp" %>
		</div>
<%@ include file="includes/scripts.jsp" %>
	</body>
</html>