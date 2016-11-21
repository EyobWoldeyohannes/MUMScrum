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
				<h1>My Sprint</h1>
				<p>Add a new Sprint<p>
			</div>
		</div>
	</section>
	<section class="container">
		<form:form  modelAttribute="newSprint" class="form-horizontal"  >
			<fieldset>
				<legend>Add Sprint</legend>

				<form:errors path="*" cssClass="alert alert-danger" element="div"/>
				
				
				<div class="form-group">
					<label class="control-label col-lg-2" for="sprintId">sprintId</label>
					<div class="col-lg-10">
						<div class="form:input-prepend">
							<form:input id="sprintId" path="sprintId" type="text" class="form:input-large"/>
							<form:errors path="sprintId" cssClass="text-danger"/>
						</div>
					</div>
				</div>
				

				<div class="form-group">
					<label class="control-label col-lg-2" for="startDate">startDate</label>
					<div class="col-lg-10">
						<form:input id="startDate" path="startDate" type="text" class="form:input-large"/>
						<form:errors path="startDate" cssClass="text-danger"/>
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="dueDate">dueDate</label>
					<div class="col-lg-10">
						<div class="form:input-prepend">
							<form:input id="dueDate" path="dueDate" type="text" class="form:input-large"/>
							<form:errors path="dueDate" cssClass="text-danger"/>
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
