<%@ page import="main.java.car.tp4.*"%>
<%@ page import="java.util.List"%>

<html>

<h1>Book list</h1>

<%
	List<Book> books = (List<Book>) request.getAttribute("books");
	Panier p = (Panier) request.getAttribute("panier");
	if(books != null && !books.isEmpty()) {
		out.println("<form action=\"/listeCommande\" method=\"get\">");
		for(Book b : books) {
			out.println("<input type=\"checkbox\">" +"Le Livre : " + b.getTitle()+", de l\'auteur : "+b.getAuthor()+", de l\'année : "+b.getYear()+"<br>");
		}
		out.println("<input type=\"submit\" value=\"Confirme Commande\">");
		out.println("</forme>");
		
	} else {
		out.println("<h3>no book found</h3>");
	}
%>
</html>