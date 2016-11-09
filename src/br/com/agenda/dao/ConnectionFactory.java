package br.com.agenda.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	private static Connection connection;
	private static int qtdeVezesConectado;
	
	private ConnectionFactory() {
		
		// singleton
		
	}
	
	public static Connection getConnection() {
		
	//	if (connection == null) {
			abreConexao();
		//}
		
		return connection;
		
	}
	
	private static void abreConexao() {
		
		
        String servidor = "YOUR_SERVER_IP"; 
        String porta = "SERVER_PORT";
        String dataBase = "DATABASE_NAME";

		
		try {
			
	   	    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	    	  
	        String connectionUrl = "jdbc:sqlserver://" + servidor + ":" + porta + ";" +
	                             "databaseName="+ dataBase +";user=SERVER_USERNAME;password=SERVER_PASSWORD";			
			
			connection = DriverManager.getConnection(connectionUrl);
			qtdeVezesConectado ++;
			
			System.out.println("Qtde Vezes Conectado: " + qtdeVezesConectado);
			
		} catch (ClassNotFoundException | SQLException e) {
			
			System.out.println("Falha ao acessar o banco de dados. \n" + 
						       "Possíveis Causas: \n\n" +
						       "- Seu computador não está conectado à internet.\n" + 
						       "- O Servidor não está disponível.\n\n" + 
					           "Verifique os itens acima e tente novamente\n" + 
						       e.toString());
			
		}
		
		
	}
	
}
