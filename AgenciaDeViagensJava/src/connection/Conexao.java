package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

	// NOME DO USUÁRIO DO MYSQL
	private static final String USERNAME = "root";

	// SENHA DO MySQL
	private static final String PASSWORD = "120202";

	// DADOS DE CAMINHO, PORTA E NOME DA BASE DE DADOS IRÁ SER FEITA A CONEXÃO
	private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/agenciadeviagens";

	/*
	 * CRIAR UMA CONEXÃO COM O BANCO DE DADOS MySQL UTILIZANDO O NOME DE USUÁRIO E
	 * SENHA FORNECIDOS
	 * 
	 * @param username
	 * 
	 * @param senha
	 * 
	 * @return uma conexão com o banco de dados
	 * 
	 * @throws Exception
	 */

	public static Connection createConnectionToMySQL() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver"); // FAZ COM QUE A CLASSE SEJA CARREGADA PELA JVM

		// CRIA A CONEXÃO COM O BANCO DE DADOS
		Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
		return connection;
	}

}
