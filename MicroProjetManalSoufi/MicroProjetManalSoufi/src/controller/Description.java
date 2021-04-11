package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Articles;
import model.DBConnection;
import model.Articles;
import model.Clients;
import model.DBConnection;
import model.Internaute;

public class Description extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private DBConnection conn=new DBConnection();
	
    public Description() {
        super();
        // TODO Auto-generated constructor stub
    }

   
  	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  		
  		String CodeArticle =request.getParameter("var");
		Articles ar = conn.MontrerArticle(CodeArticle);
		request.setAttribute("article", ar);
		request.getRequestDispatcher("Description.jsp").forward(request, response);
  	}

  	/**
  	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
  	 */
  	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  		// TODO Auto-generated method stub
  		doGet(request, response);
  	}

  }

