package main.java.car.tp4;

import java.io.IOException;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet( 
		  name="Panier",
		  urlPatterns={"/selection"}
		) 
public class ServiceSelection extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@EJB
	protected Library l;

	@EJB
	protected CommandList cl;
	
	public void doGet(HttpServletRequest req, HttpServletResponse rep) throws ServletException, IOException {
		String name = req.getParameter("nom");
		@SuppressWarnings("unused")
		String mdp = req.getParameter("mdp");
		
		Panier p = new Panier(name);
		l.initBooks();
		cl.initCommands();
		cl.add(p);
		List<Book> books = l.getListBook();
		req.setAttribute("books", books);
		req.setAttribute("panier", p);
		this.getServletContext().getRequestDispatcher("/selection.jsp").forward(req, rep);
	}

}
