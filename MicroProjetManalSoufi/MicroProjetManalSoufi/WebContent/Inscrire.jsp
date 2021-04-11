<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<fmt:setBundle basename="messages.messages" />
<!DOCTYPE html>
<fmt:setLocale value="${language}" scope="session" />
<fmt:setBundle basename="messages.messages" />
<html>
<head>
<meta charset="ISO-8859-1">
<title><fmt:message key="titreinsc" /></title>
</head>
<body bgcolor='silver' >
      <h3><fmt:message key="h3" /></h3>
      <form action="Inscrire"  method='POST'>
		<fmt:message key="nom" /><input type = "text" name = "nom"></br>
		<fmt:message key="prenom" /><input type = "text" name = "prenom"></br>
		<fmt:message key="adresse" /><input type = "text" name = "adresse"></br>
		<fmt:message key="cp" /><input type = "text" name ="codepostal"></br>
		<fmt:message key="ville" /><input type = "text" name ="ville"></br>
		<fmt:message key="tel" /><input type = "text" name ="tel"></br>
		<fmt:message key="email" /><input type = "email" name = "email" required></br>
		<fmt:message key="mdp" /><input type = "password" name ="motDePasse" required></br>
		<input type = "submit" value=" <fmt:message key="btni" />" >

     </form>
	<div style ="color : yellow ">
	   <fmt:message key="mdpObli" /></br>
	   <fmt:message key="emObli" />
	
	</div>
</body>
</html>
 