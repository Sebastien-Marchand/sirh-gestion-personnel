<%@page import="java.util.List"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page import="java.util.List, dev.sgp.entite.*, dev.sgp.service.*"%>

<!DOCTYPE html>
<html>
	<head>
	
		<meta charset="UTF-8">
		<title>SGP - App</title>
		<link rel="stylesheet" href="<%=request.getContextPath()%>/bootstrap-4.4-2.1-dist/css/bootstrap.css">
		<link rel="stylesheet" href="<%=request.getContextPath()%>/css/lister.css">
		
	</head>

	<body>
										<!-- Pour chacun des collaborateurs on répètera l'affichage -->
										
		<h1>Les collaborateurs by Sébastien</h1>
		<div class="row justify-content-center">
			<%
				List<Collaborateur> collaborateurs = (List<Collaborateur>) request.getAttribute("collaborateurs");
				for (Collaborateur collaborateur : collaborateurs) {
			%>
					<div class="col-sm-2" style="padding:30px;" >
				<div>
					<div class="form-group">
						<label for="nom">nom :</label>
						<%=collaborateur.getNom()%>
					</div>
					<div class="form-group">
						<label for="prenom">prenom :</label>
						<%=collaborateur.getPrenom()%>
					</div>
					<div class="form-group">
						<label for="mail">mail :</label>
						<%=collaborateur.getEmailPro()%>
					</div>
				</div>
			</div>
			
			<%
				}
			%>
			
		</div>
	</body>
</html>