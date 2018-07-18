<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Movies: Search</title>
		<meta name= "description" content="This is a MVC Web application searches a database and outputs the resuts 
		to a web page.">
<%@ include file="includes/styles.jsp" %>		
	</head>
	<body>
		<div class="container">
			<div class="hero-unit">
				<h1>Search</h1>
			</div>
<%@ include file="includes/navigation.jsp" %>
			<div class="container2">
				<form action="Search" method="post">
					<label for="title"><strong>Search by title: </strong></label>
					<input name="title">
					<input type="submit" value="Search!">
				</form>
			</div>
<%@ include file="includes/footer.jsp" %>
		</div>
<%@ include file="includes/scripts.jsp" %>
	</body>
</html>