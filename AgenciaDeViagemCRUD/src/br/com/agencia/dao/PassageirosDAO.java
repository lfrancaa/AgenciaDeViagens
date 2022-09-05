package br.com.agencia.dao;

import java.sql.Connection;
import br.com.agencia.factory.ConnectionFactory;
import br.com.agencia.model.Checkout;
import br.com.agencia.model.Hoteis;
import br.com.agencia.model.Passageiros;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.xdevapi.Result;

public class PassageirosDAO {

	/*
	 * CRUD
	 * C: CREATE
	 * R: READ
	 * U: UPDATE
	 * D: DELETE
	 */
	public void save(Passageiros passageiros) {
		String sql = "INSERT INTO passageiros(id, Nome, Rg, Cpf, DataNascimento, Endereco, Complemento, Cep, Estado, Email, Telefone) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			//Criar uma conexão com o banco de dados
			conn = ConnectionFactory.createConnectionToMySQL();
			
			//Criamos uma PreparedStatementWrapper, para executar uma Query
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			//Adicionar os valoress que são esperados pela query
			pstm.setInt(1, passageiros.getid());
			pstm.setString(2, passageiros.getNome());
			pstm.setString(3, passageiros.getRg());
			pstm.setString(4, passageiros.getCpf());
			pstm.setFloat(5, passageiros.getDataNascimento());
			pstm.setString(6, passageiros.getEndereco());
			pstm.setString(7, passageiros.getComplemento());
			pstm.setString(8, passageiros.getCep());
			pstm.setString(9, passageiros.getEstado());
			pstm.setString(10, passageiros.getEmail());
			pstm.setString(11, passageiros.getTelefone());
			//Executar a query
			pstm.execute();
			
			System.out.println("Contato salvo com sucesso!");
		}catch (Exception e){
			e.printStackTrace();
		}finally {
			
			//Fechar as conexões
			try {
				if(pstm!=null) {
					pstm.close();
				}				
				if(conn!=null) {
					conn.close();
				}									
			}catch (Exception e) {
				e.printStackTrace();
			}				
		}
	}
	

	
	public void update(Passageiros passageiros) {
		
		String sql = "UPDATE checkout SET Nome = ?, Rg = ?, Cpf = ?, DataNascimento = ?, Endereco = ?, Complemento = ?, Cep = ?, Estado = ?, Email = ?, Telefone = ? " +
		"WHERE id = ?";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		
		try {
			//CRIAR CONEXÃO COM O BANCO
			conn =  ConnectionFactory.createConnectionToMySQL();
			
			//CRIAR A CLASSE PARA EXECUTAR A QUERY
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			
			//ADICONAR OS VALORES PARA ATUALIZAR
			pstm.setString(1, passageiros.getNome());
			pstm.setString(2, passageiros.getRg());
			pstm.setString(3, passageiros.getCpf());
			pstm.setFloat(4, passageiros.getDataNascimento());
			pstm.setString(5, passageiros.getEndereco());
			pstm.setString(6, passageiros.getComplemento());
			pstm.setString(7, passageiros.getCep());
			pstm.setString(8, passageiros.getEstado());
			pstm.setString(9, passageiros.getEmail());
			pstm.setString(10, passageiros.getTelefone());
	
			//QUAL O ID DO REGISTRO QUE DESEJA ATUALIZAR?
			pstm.setInt(11, passageiros.getid());
			
			//EXECUTAR A QUERY
			pstm.execute();
			
		
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (pstm!=null) {
					pstm.close();
				}
				
				if(conn!=null) {
					conn.close();
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
	public void deleteByID(int id) {
		
		String sql = "DELETE FROM passageiros WHERE id = ?";
				
		Connection conn = null;
		
		PreparedStatement pstm = null;
		
		try {
			
			conn = ConnectionFactory.createConnectionToMySQL();
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			pstm.setInt(1,id);
			
			pstm.execute();
		}catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				if(pstm != null) {
					pstm.close();
				}
				
				if(conn != null) {
					conn.close();
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
			}	
		}
		


	
		public List<Passageiros> getPassageiros(){
		
		String sql = "SELECT * FROM passageiros";
		
		List<Passageiros> passageiros = new ArrayList<Passageiros>();
		
		Connection conn = null;
		PreparedStatement pstm = null;
		//Classe que vai recuperar os dados do banco ***SELECT***
		Result reset = null;
		
		try {
			
			conn = ConnectionFactory.createConnectionToMySQL();
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			ResultSet rset = pstm.executeQuery();
			
			while (rset.next()) {
				Passageiros passageiros = new Passageiros();
			
				//Recuperar o id
				passageiros.setId(rset.getInt("id"));
				//Recuperar o nome
				passageiros.setNome(rset.getString("Nome"));
				//Recuperar o RG
				passageiros.setRg(rset.getString("Rg"));
				//Recuperar o CPF
				passageiros.setCpf(rset.getString("Cpf"));
				//Recuperar o Data de Nascimento
				passageiros.setDataNascimento(rset.getString("DataNascimento"));
				//Recuperar o Endereço
				passageiros.setEndereco(rset.getString("Endereco"));
				//Recuperar o Complemento
				passageiros.setComplemento(rset.getString("Complemento"));
				//Recuperar o CEP
				passageiros.setCep(rset.getString("Cep"));
				//Recuperar o Estado
				passageiros.setEstado(rset.getString("Estado"));
				//Recuperar o Email
				passageiros.setEmail(rset.getString("Email"));					
				//Recuperar o Telefone
				passageiros.setTelefone(rset.getString("Telefone"));
				
				passageiros.add(passageiros);	
			
			}
			}catch (Exception e) {
				e.printStackTrace();
			}finally {
				try {
					Object rset;
					if(rset!=null) {
						rset.close();
					}
					
					if(pstm!=null) {
						pstm.close();
					}
					
					if(conn!=null) {
						conn.close();
					}
				}catch(Exception e) {
					e.printStackTrace();
				}
			
			return passageiros;	
			
			}
		
		}



		public void deleteByID() {
			// TODO Auto-generated method stub
			
		}



}
