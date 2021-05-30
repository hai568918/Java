package Hai.HelloWorld;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.PasswordAuthentication;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.omg.CORBA.Request;

import Hai.model.Account;

/**
 * Servlet implementation class HelloWorld
 */
@WebServlet("/HelloWorld")
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public HelloWorld() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//PrintWriter writer = response.getWriter();
		//swriter.println("Hello World");
		//doPost(c, response);
		doPost(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Account account = new Account();
		account.setUsername("admin");
		account.setPassword("123456");
		String Username = request.getParameter("username");
		String Password = request.getParameter("password");
		PrintWriter writer = response.getWriter();
		if (account.getUsername().equals(Username) && account.getPassword().equals(Password)) {
			request.setAttribute("account", account);
			RequestDispatcher dispatcher = request
					.getRequestDispatcher("ShowView.jsp");
			dispatcher.forward(request, response);
		} else {
			response.sendRedirect("Login.jsp");
		}
	}

}
