<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
	<title>Weather App</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
	<link rel="stylesheet" href="<spring:url value="/resources/css/home.css"/>" type="text/css"/>
	<link rel="stylesheet" href="<spring:url value="/resources/css/bootstrap-select.min.css"/>" type="text/css"/>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
	<script src="<spring:url value="/resources/js/bootstrap-select.min.js"/>"></script>

	<style>
body {
    background-image: url("images/weathers.jpg");    
	background-size: cover;
	background-position: top center;
	background-repeat: no-repeat;
}
#submit {
 color: #fff;
 font-size: 0;
 width: 135px;
 height: 60px;
 border: none;
 margin: 0;
 padding: 0;
 background: #0c0 url(images/getW.gif"") 0 0 no-repeat; 
}
</style>
</head>
<body>
<center><h1>
	Spring MVC Weather App!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
<%-- <form action = "main.jsp" method = "GET">
         Zip Code: <input type = "text" name = "first_name" />
         </br>
         <input type = "submit" value = "Get Weather Now" />
      </form> --%></center>
      	<div class="container">	
		<div class="row">
			<spring:url value="/city" var="formUrl"/>
			<form:form modelAttribute="city" action="${formUrl}" method="GET" cssClass="col-md-8 col-md-offset-2">
			
				<div class="form-group">
					<label for="city-zip">Country</label>
					<form:input id="city-zip" 
							cssClass="form-control" path="country"/>
				</div>

				
			
				<button type="submit" class="btn btn-default">Submit</button>
	
			</form:form>
			</div></div></div>
</body>
</html>
