<%@ page import="main.java.car.tp4.*"%>
<%@ page import="java.util.List"%>

<html>

<h1>Command Liste</h1>

<%
	List<Book> books = (List<Book>) request.getAttribute("books");
	if(books != null && !books.isEmpty()) {
		out.println("<table>");
		
		out.println("<tr>");
		out.println("<td>Title</td>");
		out.println("<td>Author</td>");
		out.println("<td>Year</td>");
		out.println("</tr>");
		
		for(Book b : books) {
			out.println("<tr>");
		    out.println("<td>"+b.getTitle()+"</td>");
		    out.println("<td>"+b.getAuthor()+"</td>");
		    out.println("<td>"+b.getYear()+"</td>");
			out.println("</tr>");
		}
		out.println("</table>");
	} else {
		out.println("<h3>no book found</h3>");
	}
%>
</html>