package main.java.car.tp4;

import javax.servlet.ServletConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;


@WebServlet(name = "Starter", urlPatterns = "/starter", loadOnStartup = 1)
public class Starter extends HttpServlet {
	
	protected Library l;
	
	public void init(ServletConfig config) {
		l = new Library();
		l.init();
		System.out.println("initialized");
		config.getServletContext().setAttribute("library", l);
	}	
	
}
