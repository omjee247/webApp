<%@ include file="common/header.jspf" %>
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
    <%@ include file="common/footer.jspf" %>