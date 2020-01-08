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

	resp.setContentType("text/html");
	
	if(matri==null)
	{
		resp.setStatus(400);
		resp.getWriter().write("<h1>Un matricule est attendu</h1>");

	}
	else
	{
		resp.setStatus(200);
		resp.getWriter().write("<h1>Liste des collaborateurs</h1> </br> <p>Matricule :"+matri+"</p>");

	}
	}

}
