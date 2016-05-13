package main.java.car.tp4;

import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "AddBook", urlPatterns = "/addbook")
public class ServiceAddBook extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@EJB
	protected Library l;
	
	public void doGet(HttpServletRequest req, HttpServletResponse rep) throws ServletException, IOException {
		String author = req.getParameter("author");
		String title = req.getParameter("title");
		String year = req.getParameter("year");
		
		Book b = new Book(author, title, year);
		l.add(b);
		req.setAttribute("book", b);
		this.getServletContext().getRequestDispatcher("/addbook.jsp").forward(req, rep);
	}

}
