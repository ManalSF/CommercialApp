<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<fmt:setLocale value="${language}" scope="session" />
<fmt:setBundle basename="messages.messages" />
<html>
<head>
<style>
		table{
			margin:auto;
		}
		table,tr,td{
			border:solid 2px pink;
		}
		td{
			padding:15px;
		}
	</style>
<meta charset="ISO-8859-1">
<title><fmt:message key="titreIdent" /></title>
</head>
<body bgcolor='silver' >
	<h1><fmt:message key="h1" /></h1>
	<form action = "Identifier" method = "POST">
	<fmt:message key="email" /><input type = "email" name="Email" ></br>
	 <fmt:message key="mdp" /> <input type = "password" name = "MotPasse"></br>
	 <input type = "submit" value = "<fmt:message key="btn" />">
</body>
</html>
