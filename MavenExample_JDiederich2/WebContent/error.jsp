<!DOCTYPE html>
<html>
	<head>
		<title>Java Web Programming: Error</title>
		<meta name= "description" content="This is a JSP example that demonstrates an Error response page for when we encounter 
		problems in our web applications.">
<%@ include file="includes/styles.jsp" %>		
	</head>
	<body>
		<div class="container">
			<div class="hero-unit">
				<h1>Error</h1>
			</div>
<%@ include file="includes/navigation.jsp" %>
			<div class="container">
				<p>Houston, we've had a problem.</p>
				<p>To continue, click the back button.</p>
				<p><strong>Error Details</strong></p>
				<p>Type: ${pageContext.exception["class"]}</p>
				<p>Message: ${pageContext.exception.message}</p>
			</div>
<%@ include file="includes/footer.jsp" %>
		</div>
<%@ include file="includes/scripts.jsp" %>
	</body>
</html>