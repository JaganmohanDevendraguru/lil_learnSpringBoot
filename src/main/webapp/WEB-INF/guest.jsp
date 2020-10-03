<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="context" value="${pageContext.request.contextPath}"></c:set>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css"
	href="${context}/webjars/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css"
	href="${context}/webjars/bootstrap-datepicker/css/bootstrap-datepicker.css">
<script src="${context}/webjars/jquery/jquery.min.js"></script>
<script src="${context}/webjars/popper.js/umd/popper.js"></script>
<script src="${context}/webjars/bootstrap/js/bootstrap.min.js"></script>
<script
	src="${context}/webjars/bootstrap-datepicker/js/bootstrap-datepicker.js"></script>
<title>${title}</title>
</head>
<body>
	<nav class="navbar navbar-inverse navbar-fixed-top">
		<div class="container">
			<div class="navbar-header">
				<a class="navbar-brand" href="/">Landon Hotels</a>
			</div>
		</div>
	</nav>
	<div class="container">
		<div class="page-header">
			<h1>Welcome to the Reservations Page</h1>
		</div>
		<table class="table table-striped table-bordered">
			<tr>
				<td>First Name</td>
				<td>Last Name</td>
				<td>Email</td>
			</tr>
			<c:forEach items="${guests}" var="guest">
				<tr>
					<td>${guest.firstName}</td>
					<td>${guest.lastName}</td>
					<td>${guest.email}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
	<footer class="footer navbar-inverse navbar-fixed-bottom">
		<div class="container">
			<div class="row">
				<div class="col-md-4"></div>
				<div class="col-md-4">
					<p class="text-muted">@Copyright 2017 Frank Moley</p>
				</div>
			</div>
		</div>
	</footer>
</body>
</html>