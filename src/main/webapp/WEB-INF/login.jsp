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
      <form class="form-signin" method="post" action="/login">
        <h2 class="form-signin-heading">Please sign in</h2>
        <p>
          <label for="username" class="sr-only">Username</label>
          <input type="text" id="username" name="username" class="form-control" placeholder="Username-1" required autofocus>
        </p>
        <p>
          <label for="password" class="sr-only">Password</label>
          <input type="password" id="password" name="password" class="form-control" placeholder="Password" required>
        </p>
<input name="_csrf" type="hidden" value="3e780f6f-f11a-43a0-b2c9-baa7d33d6f67" />
        <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
      </form>
</div><footer class="footer navbar-inverse navbar-fixed-bottom">
    <div class="container">
        <div class="row">
            <div class="col-md-4"></div>
            <div class="col-md-4"><p class="text-muted">@Copyright 2020 Jaganmohan D.</p></div>
        </div>
    </div>
</footer>

</body>
</html>