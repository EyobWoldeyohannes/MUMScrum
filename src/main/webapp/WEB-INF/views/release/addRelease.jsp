<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>Releases</title>
</head>
<body>
	<section>
		<div class="jumbotron">
			<div class="container">
				<h1>Releases page</h1>
				<p>Add a new one<p>
			</div>
		</div>
	</section>
	<section class="container">
		<form:form  modelAttribute="newRelease" class="form-horizontal"  >
			<fieldset>
				<legend>Add new release</legend>

				<form:errors path="*" cssClass="alert alert-danger" element="div"/>
				<div class="form-group">
					<label class="control-label col-lg-2 col-lg-2" for="releaseNumber"> Release Number</label>
					<div class="col-lg-10">
						<form:input id="releaseNumber" path="releaseNumber" type="number" class="form:input-large"/>
						<form:errors path="releaseNumber" cssClass="text-danger"/>
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="name">Name</label>
					<div class="col-lg-10">
						<form:input id="name" path="name" type="text" class="form:input-large"/>
						<form:errors path="name" cssClass="text-danger"/>
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="startDate">Start Date</label>
					<div class="col-lg-10">
						<div class="form:input-prepend">
							<form:input id="startDate" path="startDate" type="text" class="form:input-large"/>
							<form:errors path="startDate" cssClass="text-danger"/>
						</div>
					</div>
				</div>
				
				<div class="form-group">
					<label class="control-label col-lg-2" for="endDate">End Date</label>
					<div class="col-lg-10">
						<div class="form:input-prepend">
							<form:input id="endDate" path="endDate" type="text" class="form:input-large"/>
							<form:errors path="endDate" cssClass="text-danger"/>
						</div>
					</div>
				</div>
					

				<div class="form-group">
					<div class="col-lg-offset-2 col-lg-10">
						<input type="submit" id="btnAdd" class="btn btn-primary" value ="Add"/>
					</div>
				</div>
				
			</fieldset>
		</form:form>
	</section>
</body>
</html>
