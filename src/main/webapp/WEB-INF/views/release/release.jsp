<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>Release</title>
</head>
<body>
	<section>
		<div class="jumbotron">
			<div class="container">
				<img src="<spring:url value='/resource/images/kemosabes.jpg' />" />
				<h1>A Release</h1>
				<p>Release by its first Name!!!</p>
			</div>
			
			<a href="<c:url value="/releases/add" />" class="btn btn-danger btn-mini pull-right">Add a new Release</a>
						
 			
		</div>
	</section>

	<section class="container">
		<div class="row">
				<div class="col-sm-6 col-md-3" style="padding-bottom: 15px">
					<div class="thumbnail">
 						<div class="caption">
							<h3>Name - ${release.name}</h3>
							<h3>Start Date - ${release.startDate}</h3>
							<h3>End Date - ${release.endDate}</h3>
							
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
		</div>
	</section>
</body>
</html>
