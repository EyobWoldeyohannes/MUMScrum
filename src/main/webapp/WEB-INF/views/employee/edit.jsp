<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>Products</title>
</head>
<body>
	<section>
		<div class="jumbotron">
			<div class="container">
				<h1>Valued Employees</h1>
				<p>Edit An employee<p>
			</div>
		</div>
	</section>
	<section class="container">
		<form:form  modelAttribute="employee" action="update" class="form-horizontal"  >
			<fieldset>
				<legend>Edit employee</legend>

				<form:errors path="*" cssClass="alert alert-danger" element="div"/>
				
				<div class="form-group">
					<div class="col-lg-10">
						<form:hidden path="id"   class="form:input-large"/>
						
					</div>
				</div>
				
				
				<div class="form-group">
					<label class="control-label col-lg-2 col-lg-2" for="employeeNumber"> Employee Number</label>
					<div class="col-lg-10">
					
						<form:input id="employeeNumber" path="employeeNumber" type="text" class="form:input-large"/>
						<form:errors path="employeeNumber" cssClass="text-danger"/>
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="firstName">First Name</label>
					<div class="col-lg-10">
						<form:input id="firstName" path="firstName" type="text" class="form:input-large"/>
						<form:errors path="firstName" cssClass="text-danger"/>
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="lastName">Last Name</label>
					<div class="col-lg-10">
						<div class="form:input-prepend">
							<form:input id="lastName" path="lastName" type="text" class="form:input-large"/>
							<form:errors path="lastName" cssClass="text-danger"/>
						</div>
					</div>
				</div>
				
					<div class="form-group">
					<label class="control-label col-lg-2" for="age">age</label>
					<div class="col-lg-10">
						<div class="form:input-prepend">
							<form:input id="age" path="age" type="text" class="form:input-large"/>
							<form:errors path="age" cssClass="text-danger"/>
						</div>
					</div>
				</div>

				<legend>Address</legend>
				<div class="form-group">
					<label class="control-label col-lg-2" for="Street">Street</label>
					<div class="col-lg-10">
						<div class="form:input-prepend">
							<form:input id="Street" path="address.street" type="text" class="form:input-large"/>
							<form:errors path="address.street" cssClass="text-danger"/>
						</div>
					</div>
				</div>
				
				<div class="form-group">
					<label class="control-label col-lg-2" for="City">City</label>
					<div class="col-lg-10">
						<div class="form:input-prepend">
							<form:input id="City" path="address.city" type="text" class="form:input-large"/>
							<form:errors path="address.city" cssClass="text-danger"/>
						</div>
					</div>
				</div>
				
				<div class="form-group">
					<label class="control-label col-lg-2" for="State">State</label>
					<div class="col-lg-10">
						<div class="form:input-prepend">
							<form:input id="State" path="address.state" type="text" class="form:input-large"/>
							<form:errors path="address.state" cssClass="text-danger"/>
						</div>
					</div>
				</div>
				
				<div class="form-group">
					<label class="control-label col-lg-2" for="zipcode">Zip Code</label>
					<div class="col-lg-10">
						<div class="form:input-prepend">
							<form:input id="zipcode" path="address.zipCode" type="text" class="form:input-large"/>
							<form:errors path="address.zipCode" cssClass="text-danger"/>
						</div>
					</div>
				</div>
				
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
					<label class="control-label col-lg-2" for="role">Role</label>
					<div class="col-lg-10">
						<form:input id="role" path="role" type="text" class="form:input-large"/>
						<form:errors path="role" cssClass="text-danger"/>
					</div>
				</div>

				<div class="form-group">
					<div class="col-lg-offset-2 col-lg-10">
						<input type="submit" id="btnAdd" class="btn btn-primary" value ="update"/>
					</div>
				</div>
				
			</fieldset>
		</form:form>
	</section>
</body>
</html> 