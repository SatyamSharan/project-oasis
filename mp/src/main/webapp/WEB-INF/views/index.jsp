<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="description" content="Dayalbagh Marriage Panchayat Portal">
<meta name="author" content="Satyam Sharan, Parth Mehta">
<title>Marriage Panchayat</title>
<c:set var="context" value="${pageContext.request.contextPath}" />

<link rel="stylesheet" type="text/css" href="${context}/assets/css/common.css" />
<!-- Latest compiled and minified CSS -->
<!--<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">-->
<link rel="stylesheet" href="${context}/assets/css/bootstrap.min.css">
<link rel="stylesheet" href="${context}/assets/css/bootstrap-theme.min.css">

<script src="${context}/assets/js/script.js"></script>

<!-- <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.3.15/angular.min.js"></script> -->
<script src="${context}/assets/js/angular.min.js"></script>
<script src="${context}/assets/js/jquery-2.1.3.min.js"></script>
<script src="${context}/assets/js/bootstrap.min.js"></script>

<!--[if lt IE 9]>
<script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>
<![endif]-->

</head>
<body>


	<!-- Navigation -->
	<div class="wrapper">
		<nav class="navbar navbar-default navbar-fixed-top" role="navigation">
			<div class="container">
				<span class="navbar-brand">Marriage Panchayat</span>

				<ul class="nav navbar-nav ">
					<li class="active"><a href="#"><span class="glyphicon glyphicon-home"></span> Home</a></li>
					<li class=""><a href="#"><span class="glyphicon glyphicon-file"></span> Form</a></li>
					<li class=""><a href="#"><span class="glyphicon glyphicon-search"></span> Search</a></li>
				</ul>
				<ul class="nav navbar-nav navbar-right">
					<li class="dropdown"><a href="#" data-toggle="dropdown" class="dropdown-toggle"><span class="glyphicon glyphicon-user"></span><b class="caret"></b></a>
						<ul class="dropdown-menu">
							<li><a href="#"><span class="glyphicon glyphicon-comment"></span> Notifications</a></li>
							<li><a href="#"><span class="glyphicon glyphicon-cog"></span> Settings</a></li>
							<li class="divider"></li>
							<li><a href="#"><span class="glyphicon glyphicon-log-out"></span> Sign Out</a></li>
						</ul></li>
				</ul>
			</div>
			<!-- /.container -->
		</nav>
		
		<div class="container bodyDiv">
			<h4>Dayalbagh Marriage Panchayat</h4>
			
		</div>
		
		<div class="push"></div>
	</div>
	<div class="footer navbar-inverse">
		<div class="container">
			<span class="h5 navbar-text ">Copyright &copy; 2015 - Dayalbagh Marriage Panchayat</span>
			<a href="http://www.dayalbagh.org.in/"><span class="h5 navbar-right navbar-link">Radhasoami Satsang Sabha, Dayalbagh, Agra, UP, India 282005</span></a>
		</div>
	</div>
</body>
</html>