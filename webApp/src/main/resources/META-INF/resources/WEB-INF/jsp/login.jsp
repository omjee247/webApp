<html>
	<head>
		    <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
			<title> Login HTML Page - JSP</title>
	</head>
	<body>
	    <div class="container">
		    <pre>${errorCredential}</pre>
			
			<form method="post">
				Name: <input type = "text" name = "name"/>
				Password <input type = "password" name = "password">
				<input type = "submit"/>
			</form>
	    </div>
	</body>
	<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
	<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
</html>