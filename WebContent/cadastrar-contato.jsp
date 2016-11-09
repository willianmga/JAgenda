<%@ page language="java" 
         contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Cadastro de Contatos</title>
	</head>
	<body>
	
		<c:import url="/WEB-INF/jsp/cabecalho.jsp" />
	
		<h2>Cadastrar novo contato</h2>
		<h3>Preencha os dados abaixo e clique em Salvar</h3>
		
		<form action="contato" method="post">
			
			<table border="1px" cellpadding="5px" cellspacing="0">
				
				<tr>
					<td>Nome:</td> 
					<td><input type="text" name="nome"/></td>	
				</tr>
				<tr>
					<td>Data Nascimento:</td> 
					<td><input type="text" name="dataNascimento"/></td>	
				</tr>				
				<tr>
					<td>Endereco:</td> 
					<td><input type="text" name="endereco"/></td>	
				</tr>				
				<tr>
					<td>Telefone Cel:</td> 
					<td><input type="text" name="telefoneCelular"/></td>	
				</tr>				
				<tr>
					<td>Telefone Res:</td> 
					<td><input type="text" name="telefoneResidencial"/></td>	
				</tr>				
				<tr>
					<td>Perfil Facebook:</td> 
					<td><input type="text" name="perfilFacebook"/></td>	
				</tr>				
				<tr>
					<td>Perfil LinkedIn:</td> 
					<td><input type="text" name="perfilLinkedIn"/></td>	
				</tr>
				<tr>
					<td>Perfil GitHub:</td> 
					<td><input type="text" name="perfilGitHub"/></td>	
				</tr>
				
				<tr>
					<td></td>
					<td><input type="submit" value="Salvar" /></td>
				</tr>						
			
			</table>
			
		</form>
		
		<c:import url="/WEB-INF/jsp/rodape.jsp" />
	
	</body>
</html>