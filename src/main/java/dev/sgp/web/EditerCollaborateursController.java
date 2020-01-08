package dev.sgp.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EditerCollaborateursController extends HttpServlet 
{ 
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
	String matri = req.getParameter("matricule");
	String titre = req.getParameter("titre");
	String nom = req.getParameter("nom");
	String prenom = req.getParameter("prenom");
	boolean test=true;
	resp.setContentType("text/html");
	
	if(matri==null)
	{
		resp.setStatus(400);
		matri=" ";
		test=false;
	}
	if(titre==null)
	{
		resp.setStatus(400);
		titre=" ";
		test=false;
	}
	if(nom==null)
	{
		resp.setStatus(400);
		nom=" ";
		test=false;
	}
	if(prenom==null)
	{
		resp.setStatus(400);
		prenom=" ";
		test=false;
	}
	
	if(resp.getStatus()==400)
	{
			resp.getWriter().write("<h1>Liste des collaborateurs</h1> </br> <h2>Erreur Les paramètres suivants sont incorrects :</h2>"
					+ "<ul>");
			if(matri.equals(" "))
				resp.getWriter().write("<li>matricule  "+ matri + "</li>");
			if(titre.equals(" "))
				resp.getWriter().write("<li>titre  "+ titre + "</li>");
			if(nom.equals(" "))
				resp.getWriter().write("<li>nom  "+ nom + "</li>");
			if(prenom.equals(" "))
				resp.getWriter().write("<li>prenom  "+ prenom + "</li>");
			resp.getWriter().write("</ul>");
	}
	if(resp.getStatus()!=400)
	{
			resp.setStatus(200);
			resp.getWriter().write("<h1>Liste des collaborateurs</h1> </br>"
					+ "<ul>"
					+ "<li>Matricule ="+ matri + "</li>"
					+ "<li>titre ="+ titre + "</li>"
					+ "<li>nom ="+ nom + "</li>"
					+ "<li>prenom ="+ prenom + "</li>"
					+ "</ul>");
	}
		
	}
}




