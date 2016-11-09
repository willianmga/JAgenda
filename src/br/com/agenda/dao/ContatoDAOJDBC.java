package br.com.agenda.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.agenda.model.Contato;

public class ContatoDAOJDBC implements DAOContrato<Contato, Integer> {
	
	private Connection connection;
	
	public ContatoDAOJDBC(Connection connection) {
		
		this.connection = connection;
		
	}

	@Override
	public void inserir(Contato obj) {

		try {
			
			String sql = "Insert into contato (nome, dataNascimento, endereco, telefoneCelular, telefoneResidencial, " + 
		                 "                     perfilFacebook, perfilLinkedIn, perfilGitHub)" + 
				         "values (?,?,?,?,?,?,?,?)";			
			
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			stmt.setString(1, obj.getNome());
			stmt.setDate(2, new Date(obj.getDataNascimento().getTimeInMillis()));
			stmt.setString(3, obj.getEndereco());
			stmt.setString(4, obj.getTelefoneCelular());
			stmt.setString(5, obj.getTelefoneResidencial());
			stmt.setString(6, obj.getPerfilFacebook());
			stmt.setString(7, obj.getPerfilLinkedIn());
			stmt.setString(8, obj.getPerfilGitHub());
			
			stmt.executeUpdate();
			
		} catch (SQLException e) {
			
			System.out.println("SQLExeption: " + e.toString());
			e.printStackTrace();
			
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

		try {
			
			PreparedStatement stmt = connection.prepareStatement("Select * from contato");
			ResultSet rs = stmt.executeQuery();
			
			List<Contato> contatos = new ArrayList<Contato>();
			
			while (rs.next()) {
				
				Contato contato = new Contato();
				contato.setCodigo(rs.getInt("id"));
				
				try {
					
					Calendar nascimento = Calendar.getInstance();
					nascimento.setTime(rs.getDate("dataNascimento"));
					contato.setDataNascimento(nascimento);
					
				} catch(NullPointerException e) {
					contato.setDataNascimento(null);
				}
				
				contato.setNome(rs.getString("nome"));
				contato.setEndereco(rs.getString("endereco"));
				contato.setTelefoneCelular(rs.getString("telefoneCelular"));
				contato.setTelefoneResidencial(rs.getString("telefoneResidencial"));
				contato.setPerfilFacebook(rs.getString("perfilFacebook"));
				contato.setPerfilLinkedIn(rs.getString("perfilLinkedIn"));
				contato.setPerfilGitHub(rs.getString("perfilGitHub"));
				
				contatos.add(contato);
				
			}
			
			rs.close();
			stmt.close();			
			
			return contatos;
			
		} catch(SQLException e) {

			e.printStackTrace();
			return new ArrayList<Contato>();
			
		}

	}

	@Override
	public Contato getById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
