package dev.sgp.web;

	import java.io.IOException;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
	import java.util.List;
import java.util.ResourceBundle;

import javax.servlet.ServletException;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;

	import dev.sgp.entite.Collaborateur;
	import dev.sgp.service.CollaborateurService;
	import dev.sgp.util.Constantes;
/**
 * Servlet implementation class CreerCollaborateurController
 */
public class CreerCollaborateurController extends HttpServlet {
	
	private CollaborateurService collabService = Constantes.COLLAB_SERVICE;
			
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// utilisation du service
				List<Collaborateur> collaborateurs = collabService.listerCollaborateurs();
				
				// A ajouter
				req.getRequestDispatcher("/WEB-INF/views/collab/nouveau.jsp")
				.forward(req, resp);
				
	}
	
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String nom = req.getParameter("nom");
		String prenom = req.getParameter("prenom");
		String adresse = req.getParameter("adresse");
		String num_sec_social = req.getParameter("num_sec_social");
		
		//permet de formate la date
		//DateTimeFormatter formatterdate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println(req.getParameter("date_de_naissance"));
		//enregistrer la date formaté
		//LocalDate date_de_naissance = LocalDate.parse(req.getParameter("date_de_naissance"),formatterdate);
		LocalDate date_de_naissance = LocalDate.parse(req.getParameter("date_de_naissance"));
		ZonedDateTime dateHeureCreation = ZonedDateTime.now();
		
		//chargement des propriété de l'application
		ResourceBundle bundle = ResourceBundle.getBundle("application");
		String emailSociete = bundle.getString("emailsociete");
		
		String emailPro = prenom + "." + nom + "@" + emailSociete;
		
		if ( num_sec_social.length() != 15 || nom != null || prenom != null || adresse != null) {
			
			Collaborateur collaborateur = new Collaborateur("Ma01", nom, prenom, date_de_naissance, adresse,
					num_sec_social, emailPro, "no photo", dateHeureCreation, true);
			collabService.sauvegarderCollaborateur(collaborateur);
			resp.sendRedirect(req.getContextPath() + "/collaborateurs/lister");
			
		}
		else {
			resp.setStatus(400);
			resp.getWriter().write("Les paramètres sont incorrects ");
			req.setAttribute("nom", nom);
			req.setAttribute("prenom", prenom);
			req.setAttribute("adresse", adresse);
			req.getRequestDispatcher("/WEB-INF/views/collab/nouveau.jsp").forward(req, resp);
		}
	}
}

