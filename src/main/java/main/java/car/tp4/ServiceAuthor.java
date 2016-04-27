package main.java.car.tp4;

import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "Authors", urlPatterns = "/authors")
public class ServiceAuthor extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@EJB
	protected Library l;
	
	public void doGet(HttpServletRequest req, HttpServletResponse rep) throws ServletException, IOException {
		List<String> a = l.getListAuthors();
		req.setAttribute("authors", a);
		this.getServletContext().getRequestDispatcher("/authors.jsp").forward(req, rep);
	}
	
}
