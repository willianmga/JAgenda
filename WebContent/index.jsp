<%@ page language="java" 
         contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
         
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>         
         
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>JAgenda - Sua agenda virtual</title>
	</head>
	<body>

		<c:import url="/WEB-INF/jsp/cabecalho.jsp" />
		
		<h2>P�gina Inicial</h2>
		
		<form action="cadastrar-contato.jsp" method="post">
			<input type="submit" value="Cadastrar novo contato"/>
		</form>
		
		<form action="contato" method="get">
			<input type="submit" value="Listar todos contatos"/>
		</form>			
		
		<c:import url="/WEB-INF/jsp/rodape.jsp" />
			
	</body>
</html>