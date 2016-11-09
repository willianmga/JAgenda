package br.com.agenda.dao;

import java.sql.Connection;

import br.com.agenda.model.Contato;

public class DAOFactory {

	private static Connection getConnection() {
		
		return ConnectionFactory.getConnection();
		
	}
	

	public static DAOContrato<Contato, Integer> getContatoDAO() {
		
		return new ContatoDAOJDBC(getConnection());
		
	}
	
}
