package br.com.agenda.filter;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import br.com.agenda.dao.ConnectionFactory;

public class ConnectionFilter implements javax.servlet.Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filter) throws IOException, ServletException {
		
		try {
			
			Connection conexao = ConnectionFactory.getConnection();
			
			request.setAttribute("connection", conexao);
			
			filter.doFilter(request, response);			
			
			conexao.close();
			
		} catch (SQLException e) {
			
			throw new ServletException(e);
			
		}
		
		
	}

	

}
