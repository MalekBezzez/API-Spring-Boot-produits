<%@ page language="java" contentType="text/html; charset=windows-1256"
pageEncoding="windows-1256" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html><head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
<title>Liste Produits</title>
</head><body><h1> Liste des Produits</h1>
<table >
<tr><th>ID</th><th>Nom Produit</th><th>Prix</th><th>Date Cr�ation</th></tr>
<c:forEach items="${produits}" var="p">
<tr>
<td>${p.idProduit }</td>
<td>${p.nomProduit }</td>
<td>${p.prixProduit }</td>
<td><fmt:formatDate pattern="dd/MM/yyyy" value="${p.dateProduit}" /></td>
</tr>
</c:forEach>
</table></body></html>