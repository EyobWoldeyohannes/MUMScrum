<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>Welcome to Admin's page</title>
</head>
<body>
<section>
		<div class="jumbotron">
			<div class="container">
				<h1>Admin's Page</h1>
				<p>You are logged in as an admin! <p>
			</div>
		</div>
	</section>
	
	<section>
		
			<div class="container">
				<%-- <img src="<spring:url value='/resource/images/loneRanger.jpg' />" /> --%>
				<h1> ${greeting} </h1>
				<p> ${tagline} </p>
			</div>	 
 
				  <a href="<c:url value="/employees/add" />" class="btn btn-danger btn-mini ">Add new employee</a>
				  <a href="<c:url value="/userStories/add" />" class="btn btn-danger btn-mini ">Add a new UserStory</a>
				  <a href="<c:url value="/employees/list" />" class="btn btn-danger btn-mini ">View all employees</a>
				  <a href="<c:url value="/" />" class="btn btn-danger btn-mini ">Sign out</a>

	
	</section>
	
</body>
</html>
