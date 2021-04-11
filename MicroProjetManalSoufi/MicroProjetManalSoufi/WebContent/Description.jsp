<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
    <%@ page import="java.util.*" %>
<%@ page import="model.Articles" %>
<!DOCTYPE html>
<fmt:setLocale value="${language}" scope="session" />
<fmt:setBundle basename="messages.messages" />
<html>
<head>
<meta charset="ISO-8859-1">
<title><fmt:message key="desc" /></title>
</head>
<body>
    <h3> <fmt:message key="detail" /> </h3>
    <% Articles article=(Articles) request.getAttribute("article");
		%>


    <label><fmt:message key="ref" /></label><input type="text" value="${article.getCodeArticle()}" ReadOnly /><br />
	<label><fmt:message key="qte" /></label><input type="text" value="${article.getStock()}" ReadOnly /><br />
	<label><fmt:message key="titre" /></label><input type="text" value="${article.getDesignation()}" ReadOnly /><br />
	<label><fmt:message key="prix" /></label><input type="text" value="${article.getPrix()}" ReadOnly /><br />
	<a href="Catalogue"><fmt:message key="retour" /> </a><br>
    <a href="Panier"> <fmt:message key="ajoutpanier" /></a><br>
</body>
</html>