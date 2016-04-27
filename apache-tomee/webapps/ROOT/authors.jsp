<%@ page import="main.java.car.tp4.*"%>
<%@ page import="java.util.List"%>

<html>

<%
	List<String> authors = (List<String>) request.getAttribute("authors");
	if(authors != null) {
		out.println("<ul>");
		for(String a : authors) {
		    out.println("<li>Author : "+a+"</li>");
		}
		out.println("</ul>");
	} else {
		out.println("<h3>no author found</h3>");
	}
%>

</html>