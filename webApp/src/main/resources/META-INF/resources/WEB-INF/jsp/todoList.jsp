<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
	<head>
	    <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
		<title> Welcome to TODO page</title>
	</head>
	<body>
	<div class="container">
		<h1>This is your todo:</h1>
		<table class="table">
			<thead>
				<tr>
					<th>id</th>
					<th>desc</th>
					<th>target date</th>
					<th>Is done?</th>
				</tr>
			</thead>
				<tbody>
					<c:forEach items="${todos}" var="todo">
						<tr>
							<td>${todo.id}</td>
							<td>${todo.desc}</td>
							<td>${todo.targetDate}</td>
							<td>${todo.done}</td>
							<td><a href="delete-todo?id=${todo.id}" class="btn btn-warning">Delete</a></td>
						</tr>
			 		</c:forEach>
				</tbody>
		 	</table>
		 	<a href="add-todo" class="btn btn-success">Add Todo</a>
	</div>
	</body>
	<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
	<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
</html>