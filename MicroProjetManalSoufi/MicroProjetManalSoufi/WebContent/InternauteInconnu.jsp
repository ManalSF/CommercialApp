<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var="language" value="${not empty param.language ? param.language : not empty language ? language : pageContext.request.locale}" scope="session" />

<fmt:setLocale value="${language}" scope="session" />
<fmt:setBundle basename="messages.messages" />

<!DOCTYPE html>
<html>
<head>
<style>
		body{
			margin:auto;
				background-color:#D2E6F5;
		}
		h2{
		color:#052C49;
		}
		input{
		background-color:#F7C600;
		 padding:6px; 
		 border-radius: 14px
		}
	</style>
<meta charset="ISO-8859-1">
<title>Manal Soufi</title>
</head>
<body>
   
  	<header><h2><fmt:message key="bienvenue" /></h2></header>
    <a href="IntInconnu?var=Identifier"><fmt:message key="identi" /></a><br>
    <a href="IntInconnu?var=Inscrire"> <fmt:message key="inscrit" /></a> <br /> 
    
    
     <form method="post" action="#">
       <select style"padding: 6px" name="language">
          <option value="fr_FR">Français</option>
          <option value="en_US">English</option>
       </select>
       <input type="submit" value="<fmt:message key="langue" />">
    </form> 
</body>
</html>

   