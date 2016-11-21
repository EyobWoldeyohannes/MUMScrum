<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>Welcome to Product owner's page</title>
</head>
<body>
<section>
		<div class="jumbotron">
			<div class="container">
				<h1>Product owner's Page</h1>
				<p>You are logged in as a product owner! <p>
			</div>
		</div>
	</section>
	
	<section>
		
			<div class="container">
				<%-- <img src="<spring:url value='/resource/images/loneRanger.jpg' />" /> --%>
				<h1> ${greeting} </h1>
				<p> ${tagline} </p>
			</div>	 
 
				  <a href="<c:url value="/productBacklog/add" />" class="btn btn-danger btn-mini ">Add a new product backlog</a>
				    <a href="<c:url value="/releaseBacklog/add" />" class="btn btn-danger btn-mini ">Add a new release backlog</a>
				  <a href="<c:url value="/userStories/add" />" class="btn btn-danger btn-mini ">Add a new UserStory</a>
				  <a href="<c:url value="/userStories/list" />" class="btn btn-danger btn-mini ">View all user stories</a>
				   <a href="<c:url value="/releaseBacklog/list" />" class="btn btn-danger btn-mini ">View all all release backlogs</a>
				    <a href="<c:url value="/productBacklog/list" />" class="btn btn-danger btn-mini ">View all product backlogs</a>
				  <a href="<c:url value="/" />" class="btn btn-danger btn-mini ">Sign out</a>

	
	</section>
	
</body>
</html>
