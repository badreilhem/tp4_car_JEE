<%@ page import="main.java.car.tp4.*"%>
<%@ page import="java.util.List"%>

<html>

<%

Book b = (Book) request.getAttribute("book");

if ( b != null ) {
	out.print("<h1>Book added</h1>");
    String title = b.getTitle();
    String year = b.getYear();
    String author = b.getAuthor();
    out.print("Auteur : "+author+"<br/>");
    out.print("Titre : "+title+"<br/>");
    out.print("Ann&eacute;e : "+year+"<br/><p/>");
} else {
	out.print("<h1>No book added</h1>");
}

%>
<a href="/addbook.html">Add a book</a><br/>
<a href="/books">Books list</a><br/><p/>

</html>