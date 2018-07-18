<!DOCTYPE html>
<html>
<head>
<title>Contact Page</title>
<link rel="stylesheet" href="styles/main.css" type="text/css">
</head>
<body>
	<h1>Contact Page</h1>
	<h3>I would love to hear from you!</h3>
	
	<p>Please fill out the form below and I will contact you shortly!</p>
		
	<p><em>${message}</em></p>
	
	<form action="connect">

		<label for="firstName">First name: </label>
		<input name="firstName" value="${user.firstName}"><br>  		
		<br>
		<label for="lastName">Last name: </label>
		<input name="lastName" value="${user.lastName}"><br>
		<br>
		<label for="email">Email: </label>
		<input name="email" value="${user.email}"><br>
		<br>
		<input type="submit" value="Connect!">			
	</form>
	
	<p>You should check out my <a href="bio.html">Bio Page</a>!
			Or, return to my <a href=".">Home Page</a>.</p>
</body>
</html>