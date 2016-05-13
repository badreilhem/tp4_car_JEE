package main.java.car.tp4;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map.Entry;

import javax.ejb.EJB;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet( 
		  name="Commands",
		  urlPatterns={"/commands"}
		) 
public class ServiceCommands extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@EJB
	protected CommandList list;
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
	/*	List<Panier> commands = list.getListCommands();

		PrintWriter out = response.getWriter();	
		
		
		if(commands != null) {
			for(Panier command : commands) {
				out.println(command.getCustomer());
				if(command.getBooks() != null)
					for(Entry<Book, Integer> book : command.getBooks()) {
						out.println("-" + book.getKey().getTitle() + " : " + book.getValue());
					}
			}
		} else {
			out.println("ko");
		}*/
	}
}
