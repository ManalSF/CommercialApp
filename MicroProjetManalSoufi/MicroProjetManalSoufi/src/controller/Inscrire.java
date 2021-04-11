package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Clients;
import model.DBConnection;


public class Inscrire extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private DBConnection conn=new DBConnection();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Inscrire() {
        super();
        // TODO Auto-generated constructor stub
    }
    @Override
    	    protected void doGet(
    	      HttpServletRequest request, HttpServletResponse response) 
    	      throws ServletException, IOException {

    	    	String email=request.getParameter("email");
    			String nom=request.getParameter("nom");
    			String prenom=request.getParameter("prenom");
    			String adresse=request.getParameter("adresse");
    			String codePostal=request.getParameter("codepostal");
    			String ville=request.getParameter("ville");
    			String tel=request.getParameter("tel");
    			String motDePasse=request.getParameter("password");
    			Clients clt=new Clients(email,nom,prenom,adresse,codePostal,ville,tel,motDePasse);
    			request.setAttribute("clt", clt);
    			conn.ajoutClt(email, nom, prenom, adresse, codePostal, ville, tel, motDePasse);
    			request.getRequestDispatcher("InternauteConnu.jsp").forward(request, response);    	      
    	    }

    	    @Override
    	    protected void doPost(
    	      HttpServletRequest request, HttpServletResponse response) 
    	      throws ServletException, IOException {
    	        doGet(request, response);
    	    }
    	}