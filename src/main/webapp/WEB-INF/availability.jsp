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
<script src="${context}/js/site.js"></script>
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
    		<div class="input-group date">
			<input type="text" class="form-control" placeholder="Select Date" id="pickyDate" aria-describedby="basic-addon1">
			<div class="input-group-addon">
				<span class="glyphicon glyphicon-th"></span>
			</div>
		</div>
    <table class="table table-striped table-bordered">
        <tr>
            <td>Room</td>
            <td>Room Number</td>
            <td>Guest</td>
        </tr>
        
        <c:forEach items="${bookings}" var="roomReservation" >
        <tr>
            <td>${roomReservation.roomName}</td>
            <td>${roomReservation.roomNumber}</td>
            <td><c:out value="${roomReservation.lastName != null ? roomReservation.lastName : 'VACANT'}" /></td>
            </tr>
        </c:forEach>
        
    </table>
</div>
<footer class="footer navbar-inverse navbar-fixed-bottom">
    <div class="container">
        <div class="row">
            <div class="col-md-4"></div>
            <div class="col-md-4"><p class="text-muted">@Copyright 2017 Frank Moley</p></div>
        </div>
    </div>
</footer>

	<script type="text/javascript">
	$(document).ready(function() {
		$('#pickyDate').datepicker({
			format : "yyyy-MM-dd",
			todayHighlight : true,
			autoclose : true,
			daysOfWeekHighlighted:[0,6],
			ok : '',
			showClear:true,
			todayBtn : true,
			clearBtn:true,
			closeBtn:true,
			clear: 'glyphicon glyphicon-trash',
            close: 'glyphicon glyphicon-remove'
		});
	});
</script>
</body>
</html>