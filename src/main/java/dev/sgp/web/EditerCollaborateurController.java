package dev.sgp.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EditerCollaborateurController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws
	ServletException, IOException {

		resp.setContentType("text/html");
		
		String matricule = req.getParameter("matricule");
		String titre = req.getParameter("titre");
		String nom = req.getParameter("nom");
		String prenom = req.getParameter("prenom");
		if(matricule == null || titre == null || nom == null || prenom == null)						//si il manque une information
		{
			resp.setStatus(400);																	//renvoie le status 400 et liste les params oublier
			resp.getWriter().write("<h1>Edition des collaborateurs</h1>");
			resp.getWriter().write("<ul>" + "<li>Les paramètres suivant sont incorrects :</li>");
			if(matricule == null)
			{
				resp.getWriter().write("<li>Un matricule est attendu</li>");
			}
			if(titre == null)
			{
				resp.getWriter().write("<li>Un titre est attendu</li>");
			}
			if(nom == null)
			{
				resp.getWriter().write("<li>Un nom est attendu</li>");
			}
			if(prenom == null)
			{
				resp.getWriter().write("<li>Un prenom est attendu</li>");
			}
			resp.getWriter().write("</ul>");
		}
		else
		{
			resp.setStatus(201);
			resp.getWriter().write("<h1>Edition des collaborateurs</h1>"
				+ "<ul>"
				+"<li>Creation d’un collaborateur avec les informations suivantes :</li>"
				+ "<li>Matricule :"+ matricule + "</li>"
				+ "<li>titre :"+ titre + "</li>"
				+ "<li>nom :"+ nom + "</li>"
				+ "<li>prenom :"+ prenom + "</li>"
				+ "</ul>");
		}
		
		
	}
}
