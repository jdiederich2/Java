<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Movies: Populate Database</title>
		<meta name= "description" content="This is a MVC Web application that populates a database with a list of movies 
		from an Excel spreadsheet 
		to a web page.">
<%@ include file="includes/styles.jsp" %>		
	</head>
	<body>
		<div class="container">
			<div class="hero-unit">
				<h1>Populate Movie Database</h1>
			</div>
<%@ include file="includes/navigation.jsp" %>
			<div class="container2">
				<form action="PopulateMovies" method="post">
					<p>Click on the populate button to populate the movie database</p>
					<p>Warning: Submitting this form will reset the database and it will only contain movies in the original spreadsheet.</p>
					<input type="submit" value="Populate!">
				</form>
			</div>
<%@ include file="includes/footer.jsp" %>
		</div>
<%@ include file="includes/scripts.jsp" %>
	</body>
</html>