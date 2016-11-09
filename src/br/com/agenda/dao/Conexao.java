package br.com.agenda.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

	private static Connection connection;
	private static int qtdeVezesConectado;
	
	private Conexao() {
		
		// singleton
		
	}
	
	public static Connection getConnection() {
		
		if (connection == null) {
			abreConexao();
		}
		
		return connection;
		
	}
	
	private static void abreConexao() {

		String servidor = "localhost";
		String database = "agenda";
		String usuario = "easy";
		String senha = "!d@t2b@s3#";
		
		String url = "jdbc:mysql://" + servidor + "/" + database + "?characterEncoding=UTF-8;autoReconnect=true;useSSL=false";
		
		try {
			connection = DriverManager.getConnection(url, usuario, senha);
			qtdeVezesConectado ++;
			
			System.out.println("Qtde Vezes Conectado: " + qtdeVezesConectado);
			
		} catch (SQLException e) {
			
			System.out.println("Erro ao conectar no banco de dados.. " + e.toString());
			
		}
		
		
	}
	
}
