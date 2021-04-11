<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
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
<title><fmt:message key="catalogue" /></title>
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
</head>
<body>
    <h1><fmt:message key="catalogue" /></h1>
	
	<table>
		<tr>
			<td><fmt:message key="ref" /></td>
			<td><fmt:message key="titre" /></td>
			<td><fmt:message key="prix" /></td>
			<td><fmt:message key="panier" /></td>
		</tr>
		<% List<Articles> articles=(ArrayList<Articles>)request.getAttribute("articles");
			for(Articles a:articles){
		%>
		<tr>
			<td><a href="Description?var=<%= a.getCodeArticle() %>"><%= a.getCodeArticle() %></a></td>
			<td><%= a.getDesignation() %></td>
			<td><fmt:formatNumber value="<%= a.getPrix() %>" type="currency" /></td>
			<td><a href="Panier"><fmt:message key="ajoutpanier" /></a></td>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>