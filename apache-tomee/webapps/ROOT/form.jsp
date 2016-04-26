<%@ page import="main.java.car.tp4.*"%>
<html>

<%

Library l = (Library) application.getAttribute("library");

String author = request.getParameter("author");
if ( author != null ) {
    String title = request.getParameter("title");
    String year = request.getParameter("year");
    out.print("Auteur : "+author+"<br/>");
    out.print("Titre : "+title+"<br/>");
    out.print("Ann&eacute;e : "+year+"<br/><p/>");
    
    if(l != null) {
    	l.add(new Book(title, author, year));
    	out.println("<h3>Added book</h3>");
    } else {
    	out.println("<h3>No library found</h3>");
    }
}

if(l != null) {
	out.println("<h2>Books in Library</h2>");
	
	out.println("<ul>");
	for(Book book : l.getListBook()) {
		out.println("<li><ul>");
	    out.println("<li>Title : "+book.getTitle()+"</li>");
	    out.println("<li>Author : "+book.getAuthor()+"</li>");
	    out.println("<li>Year : "+book.getYear()+"</li>");
	    out.println("</ul></li>");
	}
	out.println("</ul>");
} else {
   	out.println("<h3>No library found</h3>");
}
%>

<form action="form.jsp">
Auteur : <input type="text" name="author" value='<%=request.getParameter("author")%>'><br/>
Titre : <input type="text" name="title" value='<%=request.getParameter("title")%>'><br/>
Ann&eacute;e : <input type="text" name="year" value='<%=request.getParameter("year")%>'><br/>
<input type="submit">
</form>
</html>
