<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>Employees</title>
</head>
<body>
	<section>
		<div class="jumbotron">
			<div class="container">
				<%-- <img src="<spring:url value='/resource/images/kemosabes.jpg' />" /> --%>
				<h1>Our MUMScrum Employees</h1>
				<!-- <p>All of the contributors to our great proje!!!</p> -->
			</div>
			
			
			<a href="<c:url value="/employees/add" />"
				class="btn btn-danger btn-mini pull-right">Add a new Employee</a> <a
				href="<c:url value="/employees/employee/6" />"
				class="btn btn-danger btn-mini pull-right">Find Employee BY Id</a>
		</div>

<div class="well">
			<h4 class="margin-t-0">Search By Name</h4>
			<form action="listByID" method="GET">
				<div class="input-group">
					<label class="sr-only" for="search-form">Search the site</label> <input
						name="name" type="text" class="form-control" id="search-form" />
					<span class="input-group-btn">
						<button  class="btn btn-danger btn-mini"  type="submit" value="Submit">
							<span class="glyphicon glyphicon-search"></span> <span
								class="sr-only"></span> 
								
								
						</button>
					</span>
				</div>
			</form>
		</div>




	</section>

	<section class="container">
		<div class="row">
			<c:forEach items="${employees}" var="employee">
				<div class="col-sm-6 col-md-3" style="padding-bottom: 15px">
					<div class="thumbnail">
						<div class="caption">
							
							<h3>First Name - ${employee.firstName}</h3>
							<h3>Last Name - ${employee.lastName}</h3>
							<p>Age - ${employee.age}</p>
							<p>Title - ${employee.title}</p>
							<p>NUMBER - ${employee.employeeNumber}</p>
						<!-- 	<a href="c:url value="/employees/edit/${employee.employeeNumber}" />Edit</a>
							<a href="c:url value="/employees/employee/${employee.employeeNumber}" />Details</a> -->
							
							
				<a href="<c:url value="/employees/edit/${employee.employeeNumber }" />"
				class="btn btn-danger btn-mini ">Edit</a> <a
				href="<c:url value="/employees/employee/${employee.employeeNumber }" />"
				class="btn btn-danger btn-mini ">Details</a>
					
				<a href="<c:url value="/employees/delete/${employee.id }" />"
				class="btn btn-danger btn-mini ">Delete</a>	
							
							<p>
								<!--a
									href=" <spring:url value="/products/product?id=${product.productId}" /> "
									class="btn btn-primary"> <span
									class="glyphicon-info-sign glyphicon" /></span> Details
								</a-->
							</p>

						</div>
					</div>
				</div>
			</c:forEach>
		</div>
	</section>
</body>
</html>
