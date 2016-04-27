package main.java.car.tp4;

import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Init", urlPatterns = "/init")
public class ServiceInit extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	@EJB
	protected Library l;

	public void doGet(HttpServletRequest req, HttpServletResponse rep) throws ServletException, IOException {
		l.initBooks();
		List<Book> books = l.getListBook();
		req.setAttribute("books", books);
		this.getServletContext().getRequestDispatcher("/init.jsp").forward(req, rep);
	}
	
	
}
