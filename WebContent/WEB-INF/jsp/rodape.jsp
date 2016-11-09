<%@ page import="java.util.Calendar" 
		 import="java.util.Date"
%>

<% 
	
	String author = "Willian";
	
	int anoAtual = Calendar.getInstance().get(Calendar.YEAR);

%>

<h4>Developed by <%= author %></h4>
<h4>Copyright 1993-<%= anoAtual %></h4>