<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<link rel="stylesheet" href="<%=request.getContextPath()%>/bootstrap-4.4.1-dist/css/bootstrap.css">
		<title>SGP - App - nouveau</title>
	</head>
	<body>
		<div style="background: purple;padding:30px;color:white"><h1>Nouveau Collaborateur</h1></div>
		<div class="container" style="margin-top:30px;">
			<form method="post">
				<div class="row justify-content-center">
					<div class="col-sm-2" style="padding:30px;" >
							<div class="form-group">
								<label for="nom">nom :</label>
							</div>
							<div class="form-group">
								<label for="prenom">prenom :</label>
							</div>
							<div class="form-group">
								<label for="date_de_naissance">date de naissance:</label>
							</div>
							
							<div class="form-group">
								<label for="adresse">Adresse</label>
							</div>
							</br></br></br>
							<div class="form-group">
								<label for="num_sec_social">Numéro de sécurité social:</label>
							</div>
					</div>
					<div class="col-sm-6" style="padding:30px;">
							<div class="form-group">
								<input type="text" class="form-control" id="nom" name="nom" placeholder="Votre nom">
							</div>
							<div class="form-group">
								<input type="text" class="form-control" id="prenom" name="prenom" placeholder="Votre prenom">
							</div>
							<div class="form-group">
								<input type="date" class="form-control" id="date_de_naissance" name="date_de_naissance" placeholder="Votre date de naissance">
							</div>
							
							<div class="form-group">
								<textarea class="form-control" id="adresse" name="adresse" rows="3"></textarea>
							</div>
							<div class="form-group">
								<input type="text" class="form-control" id="num_sec_social" name="num_sec_social" placeholder="Votre numéro de sécurité sociale">
							</div>
							<div class="float-right"><button type="submit" class="btn btn-success">Créer</button></div>
					</div>
				</div>
			</form>
		</div>
	</body>
</html>