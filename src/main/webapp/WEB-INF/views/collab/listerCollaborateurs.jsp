<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>SGP - App</title>
</head>
	<body>
		<h1>Les collaborateurs by Sébastien</h1>
			<ul>
				<%
				List<String> listeNoms =(List<String>)request.getAttribute("listeNoms");
				for (String nom : listeNoms) {%>
					<li><%= nom %></li>
				<%
				}
				%>
			</ul>
	</body>
</html>