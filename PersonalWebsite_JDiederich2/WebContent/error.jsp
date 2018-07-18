<!DOCTYPE html>
<html>
<head>
<title>Error Page</title>
</head>
<body>
	<h1>Error!</h1>
	<P>Houston, we've had a problem!</P>
	<p>To continue, click the Back button.</p>
	
	<h2>Error Details</h2>
	<p>Type: ${pageContext.exception["class""]}</p>
	<p>Message: ${pageContext.exception.message}</p>
</body>
</html>