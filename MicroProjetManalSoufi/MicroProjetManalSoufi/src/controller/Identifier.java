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

public class Identifier extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private DBConnection conn=new DBConnection();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Identifier() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String Email=request.getParameter("Email");
		String MotPasse=request.getParameter("MotPasse");
		Clients clt=conn.MontrerClient(Email, MotPasse);
		if(clt!=null) {
			request.setAttribute("clt", clt);
			request.getRequestDispatcher("InternauteConnu.jsp").forward(request, response);
		}
		else {
			System.out.println("hello");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 doGet(request, response);
	}

}
