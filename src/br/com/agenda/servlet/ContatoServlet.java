package br.com.agenda.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.agenda.dao.ContatoDAOJDBC;
import br.com.agenda.model.Contato;

public class ContatoServlet extends HttpServlet {

	private static final long serialVersionUID = -3669248415472496966L;
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// validar se os dados foram preenchidos
		if (request.getParameter("nome").isEmpty())
			throw new ServletException("O nome deve ser informado");
		
		if (request.getParameter("dataNascimento").isEmpty())
			throw new ServletException("A data de nascimento deve ser informada");		
		
		// montar o novo contato
		
		Contato contato = new Contato();
		contato.setNome(request.getParameter("nome"));
		
		try {
			
			Date data = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("dataNascimento"));
			Calendar nascimento = Calendar.getInstance();
			nascimento.setTime(data);
			contato.setDataNascimento(nascimento);
			
		} catch(ParseException e) {
			
			contato.setDataNascimento(Calendar.getInstance());
			//throw new ServletException("Data de nascimento inválida.");
			
		}

		contato.setEndereco(request.getParameter("endereco"));
		
		contato.setTelefoneCelular(request.getParameter("telefoneCelular"));
		contato.setTelefoneResidencial(request.getParameter("telefoneResidencial"));
		contato.setPerfilFacebook(request.getParameter("perfilFacebook"));
		contato.setPerfilLinkedIn(request.getParameter("perfilLinkedIn"));
		contato.setPerfilGitHub(request.getParameter("perfilGitHub"));
		
		// inserir o contato no banco
		
		ContatoDAOJDBC dao = new ContatoDAOJDBC((Connection) request.getAttribute("connection"));
		
		dao.inserir(contato);
		
		// redirecionar para a listagem de contatos
		
		request.getRequestDispatcher("/WEB-INF/jsp/lista-contato.jsp?nomeContato=" + contato.getNome()).forward(request, response);
		
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ContatoDAOJDBC dao = new ContatoDAOJDBC((Connection) request.getAttribute("connection"));
		request.setAttribute("contatos", dao.getAll());
		request.getRequestDispatcher("/WEB-INF/jsp/lista-contato.jsp").forward(request, response);
		
	}



}
