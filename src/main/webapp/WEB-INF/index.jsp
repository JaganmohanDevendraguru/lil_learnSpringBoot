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

		<div class="input-group date">
			<input type="text" class="form-control" placeholder="Select Date" id="pickyDate">
			<div class="input-group-addon">
				<span class="glyphicon glyphicon-th"></span>
			</div>
		</div>
</body>
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
</html>