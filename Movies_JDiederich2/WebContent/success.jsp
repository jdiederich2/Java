<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Movies: Success</title>
		<meta name= "description" content="This is a JSP that displays a success page when a movie is successfully
		added to the movie application.">
<%@ include file="includes/styles.jsp" %>		
	</head>
	<body>
		<div class="container">
			<div class="hero-unit">
				<h1>Success!</h1>
			</div>
<%@ include file="includes/navigation.jsp" %>
			<div class="container">
				<p>The movie was successfully added!</p>
			</div>
<%@ include file="includes/footer.jsp" %>
		</div>
<%@ include file="includes/scripts.jsp" %>
	</body>
</html>