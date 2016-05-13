package main.java.car.tp4;

import java.io.IOException;
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet( 
		  name="ListCommande",
		  urlPatterns={"/listCommande"}
		) 
public class ServiceListCommande extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@EJB
	protected Library l;
	
	@EJB
	protected CommandList cl;
	
	public void doGet(HttpServletRequest req, HttpServletResponse rep) throws ServletException, IOException {
		Enumeration<String> idsPanier = req.getAttributeNames();
		String idPanier = idsPanier.nextElement();
		String[] idsBook = req.getParameterValues(idPanier);
		LinkedList books = new LinkedList<Book>();
		for(String s : idsBook){
			books.add(l.getBook(s));
		}
		cl.addListBook(books, idPanier);
		req.setAttribute("books", books);
		this.getServletContext().getRequestDispatcher("/listcommande.jsp").forward(req, rep);
	}

}
