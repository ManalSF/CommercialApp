<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
    <!DOCTYPE html>
   
<fmt:setLocale value="${language}" scope="session" />
<fmt:setBundle basename="messages.messages" />

 <html>
<head>
<meta charset="ISO-8859-1">
<title><fmt:message key="accueil" /></title>
</head>
<body>
   <header><h2><fmt:message key="h2" /></h2></header>
    <a href="Catalogue"><fmt:message key="consulter" /> </a><br>
    <a href="Commandes"><fmt:message key="suivre" /></a><br>
    <a href="Panier"><fmt:message key="visualiserpanier" /></a><br>
</body>

</html>
