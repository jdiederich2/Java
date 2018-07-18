<!DOCTYPE html>
<html>
	<head>
		<title>Movies: Home</title>
		<meta name= "description" content="This is a MVC Web application that outputs the a list of movies 
		from an Excel spreadsheet 
		to a web page.">
<%@ include file="includes/styles.jsp" %>		
	</head>
	<body>
		<div class="container">
			<div class="hero-unit">
				<h1>My Movies</h1>
			</div>
<%@ include file="includes/navigation.jsp" %>
			<div class="container2">
				<h2>Favorite Movies</h2>
				<p>To view a few of my favorite movies, please use the "View All" drop down
				link.</p>
				<p>I hope you take time to watch them if you haven't already seen them!</p> 
				<p id="thanks">Thanks for visiting!</P>
			</div>
<%@ include file="includes/footer.jsp" %>
		</div>
<%@ include file="includes/scripts.jsp" %>
	</body>
</html>