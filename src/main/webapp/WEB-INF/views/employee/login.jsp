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
				<p>Login as employee<p>
			</div>
		</div>
	</section>
	<section class="container">
		<form:form  modelAttribute="employee" action= "login2" class="form-horizontal"  method = "post">
			<fieldset>
				<legend>Employee Login</legend>

				<form:errors path="*" cssClass="alert alert-danger" element="div"/>
				
				<div class="form-group">
					<label class="control-label col-lg-2" for="username">User name</label>
					<div class="col-lg-10">
						<form:input id="username" path="username" type="text" class="form:input-large"/>
						<form:errors path="username" cssClass="text-danger"/>
					</div>
				</div>
				
				<div class="form-group">
					<label class="control-label col-lg-2" for="password">Password</label>
					<div class="col-lg-10">
						<form:input id="password" path="password" type="text" class="form:input-large"/>
						<form:errors path="password" cssClass="text-danger"/>
					</div>
				</div>
				

				<div class="form-group">
					<div class="col-lg-offset-2 col-lg-10">
						<input type="submit" id="btnAdd" class="btn btn-primary" value ="Login"/>
					</div>
				</div>
				
			</fieldset>
		</form:form>
	</section>
</body>
</html> 
