<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>Welcome</title>
</head>
<body>
	<section>
		<div class="jumbotron">
			<div class="container">
				<%-- <img src="<spring:url value='/resource/images/loneRanger.jpg' />" /> --%>
				<h1> ${greeting} </h1>
				<p> ${tagline} </p>
			</div>	 
 
				  
				   <a href="<c:url value="/employees/login" />" class="btn btn-danger btn-mini ">Login</a>
				  
				      <!--
				   <a href="<c:url value="/employees/add" />" class="btn btn-danger btn-mini ">Sign up</a>
				   
				   
				  <a href="<c:url value="/sprints/add" />" class="btn btn-danger btn-mini ">Add a new sprint</a>
				  <a href="<c:url value="/userStories/add" />" class="btn btn-danger btn-mini ">Add a new UserStory</a>
				  <a href="<c:url value="/hello/add1" />" class="btn btn-danger btn-mini ">Test</a>
				  -->
		</div>	
	</section>
	
</body>
</html>
