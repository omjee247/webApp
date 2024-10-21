<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ include file="common/header.jspf" %>

		<title> Welcome to TODO page</title>
	</head>
	<body>
	<%@ include file="common/navigation.jspf" %>>
	<div class="container">
		<h1>This is your todo:</h1>
		<table class="table">
			<thead>
				<tr>
					<th>Description</th>
					<th>target date</th>
					<th>Is done?</th>
				</tr>
			</thead>
				<tbody>
					<c:forEach items="${todos}" var="todo">
						<tr>
							<td>${todo.desc}</td>
							<td>${todo.targetDate}</td>
							<td>${todo.done}</td>
							<td><a href="delete-todo?id=${todo.id}" class="btn btn-warning">Delete</a></td>
							<td><a href="update-todo?id=${todo.id}" class="btn btn-success">Update</a></td>
						</tr>
			 		</c:forEach>
				</tbody>
		 	</table>
		 	<a href="add-todo" class="btn btn-success">Add Todo</a>
	</div>
	    <%@ include file="common/footer.jspf" %>