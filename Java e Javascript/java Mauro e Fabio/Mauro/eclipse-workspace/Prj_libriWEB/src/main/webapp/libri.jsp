<%@page import="model.Libri"%>
<%@page import="presentation.MVCController"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Libri</title>
</head>
<body>


	<% MVCController controller = new MVCController(); %>
	
	<h1>Libri</h1>
	<a href="leggimi">Add libro</a>
	<table>
		<tr>
		<th>Titolo</th>
		<th>Prezzo</th>
		<th>Pagine</th>
		
		<% for (Libri l : controller.mostraLibri()){ %>
	  
		  <tr>
		    <td> <a target="_blank" href="https://www.google.com/search?q=<%= l.getTitolo() %>"><%= l.getTitolo() %></a> </td>
		    <td><a target="_blank" href="https://www.google.com/search?q=<%= l.getPrezzo() %>"><%= l.getPrezzo() %></a></td>
		    <td><a target="_blank" href="https://www.google.com/search?q=<%= l.getPagine() %>"><%= l.getPagine() %></a></td>
		  </tr>
	  
	  <% } %>
	</table>
</body>
</html>