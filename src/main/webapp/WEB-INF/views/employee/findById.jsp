<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello Guys find by ID!  
</h1>
<a href="<c:url value="/employees/employee" />"
 class="btn btn-danger btn-mini pull-right">Find Employee BY Id</a>

<input type="text" name="id" />
<input type="submit" />
<P>  The time on the server is ${serverTime}. </P>
</body>
</html>
