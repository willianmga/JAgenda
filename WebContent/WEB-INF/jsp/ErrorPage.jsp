<%@ page language="java" 
         contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
         
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>         
         
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Ops. Aconteceu um erro inesperado</title>
	</head>
	<body>
	
		<c:import url="/WEB-INF/jsp/cabecalho.jsp" />
		
		<h1>Ops. Aconteceu um erro inesperado..</h1>
		<h2>Mas estamos nos recuperando deste erro. Fique traquilo</h2>
		<h2>Se preferir, <a href="index.jsp" title="volte à página inicial">volte à página inicial</a> </h2>
		
		<c:import url="/WEB-INF/jsp/rodape.jsp" />
	
	</body>
</html>