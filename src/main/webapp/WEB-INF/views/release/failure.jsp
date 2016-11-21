<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>Login</title>
</head>
<body>
	<section>
		<div class="jumbotron">
			<div class="container">
				<h1>Employee Login</h1>
				<p>Login <p>
			</div>
		</div>
	</section>
	<section class="container">
	<h1>Employee Login Failed!</h1>
	<a class="btn btn-primary" href="<spring:url value="/employees/login"/>">Try
		again?</a>
	</section>
</body>
</html>
