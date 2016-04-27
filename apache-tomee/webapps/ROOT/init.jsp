<%@ page import="main.java.car.tp4.*"%>
<%@ page import="java.util.List"%>

<html>

<h1>Library initialized</h1>

<%
	List<Book> books = (List<Book>) request.getAttribute("books");
	if(books != null) {
		out.println("<ul>");
		for(Book b : books) {
		    out.println("<li>Book : "+b.getTitle()+"</li>");
		}
		out.println("</ul>");
	} else {
		out.println("<h3>no book found</h3>");
	}
%>
</html>