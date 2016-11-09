<%@ page language="java" 
         contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
         
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Lista de Contatos Cadastrados</title>
	</head>
	
	<body>
	
		<c:import url="/WEB-INF/jsp/cabecalho.jsp" />
		
		<c:if test="not empty param.nomeContato" >
			
			<h1>Parabnéns!</h1>
			<h2>O contato ${param.nomeContato} foi adicionado com sucesso em sua agenda! <br />
			    Se preferir <a href="/cadastrar-contato.jsp">adicione mais um</a> contato.
			</h2>			
		
		</c:if>
		
		<h2>Contatos Cadastrados</h2>
		
		<table border="1px" cellpadding="5px" cellspacing="0">
		
			<tr background="#000">
				<th>Nome</th>
				<th>Endereco</th>
				<th>Data Nascimento</th>
				<th>Celular</th>
				<th>Residencial</th>
				<th>Perfil Facebook</th>
				<th>Perfil LinkedIn</th>
				<th>Perfil GitHub</th>
				<th>Ações</th>
				
			</tr>
			
			<c:forEach var="contato" items="${contatos}">
			
				<tr>
					
					<td>${contato.nome}</td>
					<td>${contato.endereco}</td>
					<td><fmt:formatDate value="${contato.dataNascimento.time}" pattern="dd/MM/yyyy"/></td>
					<td>${contato.telefoneCelular}</td>
					<td>${contato.telefoneResidencial}</td>
					
					<td>
						<c:if test="${not empty contato.perfilFacebook}">
							<a href="${contato.perfilFacebook}" >Facebook</a>
						</c:if>
						<c:if test="${empty contato.perfilFacebook}">
							NÃO INFORMADO
						</c:if>								
						
					</td> 
					
					<td>
						<c:if test="${not empty contato.perfilLinkedIn}">
							<a href="${contato.perfilLinkedIn}" >LinkedIn</a>
						</c:if>
						<c:if test="${empty contato.perfilLinkedIn}">
							NÃO INFORMADO
						</c:if>								
						
					</td> 					
					
					<td>
						<c:if test="${not empty contato.perfilGitHub}">
							<a href="${contato.perfilGitHub}" >GitHub</a>
						</c:if>
						<c:if test="${empty contato.perfilGitHub}">
							NÃO INFORMADO
						</c:if>								
						
					</td> 
					
					<td>
						<a href="#">Alterar</a> | <a href="#">Excluir</a>
					</td>					

				</tr>
			
			</c:forEach>
				
		
		</table>
		
		
		<c:import url="/WEB-INF/jsp/rodape.jsp" />		
		
	</body>
</html>