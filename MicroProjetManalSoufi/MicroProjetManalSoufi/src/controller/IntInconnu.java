package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class IntInconnu
 */

public class IntInconnu extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IntInconnu() {
        super();
        // TODO Auto-generated constructor stub
    }
    
  	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  		
  		String url="Inscrire.jsp";
	    if(request.getParameter("var").equals("Identifier")) 
		{
			url="Identifier.jsp";
		}
	
		request.getRequestDispatcher(url).forward(request, response);
	  }

  	/**
  	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
  	 */
  	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  		// TODO Auto-generated method stub
  		 doGet(request, response);
  	}

  }


