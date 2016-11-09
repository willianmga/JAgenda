package br.com.agenda.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import br.com.agenda.model.Contato;

public class ContatoDAOJDBC implements DAOContrato<Contato, Integer> {
	
	private Connection connection;
	
	public ContatoDAOJDBC(Connection connection) {
		
		this.connection = connection;
		
	}

	@Override
	public void inserir(Contato obj) {
		
		String sql = "Insert into contato (nome, dataNascimento, endereco, telefoneCelular, telefoneResidencial, " + 
		             "                     perfilFacebook, perfilLinkedIn, perfilGitHub)" + 
				     "values (?,?,?,?,?,?,?,?)";
		
		PreparedStatement stmt;
		try {
			
			stmt = connection.prepareStatement(sql);
			
			stmt.setString(1, obj.getNome());
			//stmt.setDate(2, (SQLDate) obj.getDataNascimento().getTime());
			stmt.setString(3, obj.getEndereco());
			stmt.setString(4, obj.getTelefoneCelular());
			stmt.setString(5, obj.getTelefoneResidencial());
			stmt.setString(6, obj.getPerfilFacebook());
			stmt.setString(7, obj.getPerfilLinkedIn());
			stmt.setString(8, obj.getPerfilGitHub());
			
			stmt.executeUpdate();
			
		} catch (SQLException e) {
			
			
			
		}
		
	}

	@Override
	public void alterar(Contato obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluir(Contato obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Contato> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Contato getById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
