<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Movie: Add Movie</title>
		<meta name= "description" content="This is a JSP example that demonstrates how to use a form to add
		a new movie to the database.">
<%@ include file="includes/styles.jsp" %>		
	</head>
	<body>
		<div class="container">
			<div class="hero-unit">
				<h1>Add Movie</h1>
			</div>
<%@ include file="includes/navigation.jsp" %>
			<div class="container">
				<form action="AddMovie" method="post">
					<label for="title"><strong>Movie Title: </strong></label>
					<input name="title"><br>
					
					<label for="director"><strong>Movie Director: </strong></label>
					<input name="director"><br>
					
					<label for="lengthInMinutes"><strong>Movie Length in Minutes: </strong></label>
					<input name="lengthInMinutes"><br>
					
					<label for="movieDesc"><strong>Movie Description: </strong></label>
					<input name="movieDesc"><br>
					
					<input type="submit" value="Add Movie">
				</form>
			</div>
<%@ include file="includes/footer.jsp" %>
		</div>
<%@ include file="includes/scripts.jsp" %>
	</body>
</html>