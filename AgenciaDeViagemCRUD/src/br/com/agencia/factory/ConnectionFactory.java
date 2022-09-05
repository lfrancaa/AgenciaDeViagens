package br.com.agencia.factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	
		//Nome do usuário do MySQL
		private static final String USERNAME = "root";
		//Senha do banco
		private static final String PASSWORD = "120202";
		//Dados do caminhdo do Banco de Dados, porta e nome da base de dados
		private static final String DATABASE_URL = 
				"jdbc:mysql://localhost:3306/agenciadeviagens";
		/*
		 * Conexão com o banco de dados
		 */
		public static Connection createConnectionToMySQL() throws Exception {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection(DATABASE_URL, 
					USERNAME, PASSWORD);
			return connection;
		}
		
		public static void main(String[] args) throws Exception {
			//Recuperar uma concexão com o banco de dados
			Connection con = createConnectionToMySQL();
			
			//Testar se a conexão é nula
			if(con!=null) {
				System.out.println("Conexão obtida com sucesso!");
				con.close();
			}
		}
}
