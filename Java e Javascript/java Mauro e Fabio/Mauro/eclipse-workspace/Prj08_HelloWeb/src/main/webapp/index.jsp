<%@page import="model.Prodotto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <h1>HelloWeb</h1>
 
 <%

Prodotto p = new Prodotto();
 p.nome = "giacca";

 
 
 
 
 
 %>
 <h2><%= p %>></h2>
</body>
</html>