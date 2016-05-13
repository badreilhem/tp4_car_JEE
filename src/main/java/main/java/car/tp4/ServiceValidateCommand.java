package main.java.car.tp4;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet( 
		  name="ValidateCommand",
		  urlPatterns={"/validate"}
		) 
public class ServiceValidateCommand extends HttpServlet {

	@EJB
	protected CommandList list;
	@EJB
	protected Cart cart;
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		Panier command = null;
		
		String customer = (String) request.getAttribute("customer");
		cart.setName(customer);
		
		String author = (String) request.getAttribute("author1");
		String title = (String) request.getAttribute("title1");
		String year = (String) request.getAttribute("year1");
		cart.addBook(new Book(author, title, year));
		
		author = (String) request.getAttribute("author2");
		title = (String) request.getAttribute("title2");
		year = (String) request.getAttribute("year2");
		cart.addBook(new Book(author, title, year));
		
		/*command = cart.validateCommand();
		
		if(command != null) {
			list.add(command);
			response.getWriter().println("ok");
		} else {
			response.getWriter().println("ko");
		}*/
	}

}
