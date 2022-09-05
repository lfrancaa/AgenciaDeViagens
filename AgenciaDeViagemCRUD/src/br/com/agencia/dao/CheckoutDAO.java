package br.com.agencia.dao;

import java.sql.Connection;
import br.com.agencia.factory.ConnectionFactory;
import br.com.agencia.model.Checkout;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.xdevapi.Result;

public class CheckoutDAO {

	/*
	 * CRUD
	 * C: CREATE
	 * R: READ
	 * U: UPDATE
	 * D: DELETE
	 */
	public void save(Checkout checkout) {
		String sql = "INSERT INTO passageiros(id, Nome, Sobrenome, Email, Endereco, Complemento, Pais, Estado, Cep, PrecoPassagem, FormasPagamento) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			//Criar uma conexão com o banco de dados
			conn = ConnectionFactory.createConnectionToMySQL();
			
			//Criamos uma PreparedStatementWrapper, para executar uma Query
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			//Adicionar os valoress que são esperados pela query
						
			pstm.setInt(1, checkout.getid());
			pstm.setString(2, checkout.getNome());
			pstm.setString(3, checkout.getSobrenome());
			pstm.setString(4, checkout.getEmail());
			pstm.setString(5, checkout.getEndereco());
			pstm.setString(6, checkout.getComplemento());
			pstm.setString(7, checkout.getPais());
			pstm.setString(8, checkout.getEstado());
			pstm.setDouble(9, checkout.getCep());
			pstm.setDouble(10, checkout.getPrecoPassagem());
			pstm.setString(11, checkout.getFormasPagamento());			
	
			//Executar a query
			pstm.execute();
			
			System.out.println("Pedido validado com sucesso!");
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
	
	
	public void update(Checkout checkout) {
		
		String sql = "UPDATE checkout SET Nome = ?, Sobrenome = ?, Email = ?, Endereco = ?, Complemento = ?, Pais = ?, Estado = ?, Cep = ?, PrecoPassagem = ?, FormasPagamento = ? " +
		"WHERE id = ?";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		
		try {
			//CRIAR CONEXÃO COM O BANCO
			conn =  ConnectionFactory.createConnectionToMySQL();
			
			//CRIAR A CLASSE PARA EXECUTAR A QUERY
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			
			//ADICONAR OS VALORES PARA ATUALIZAR
			pstm.setString(1, checkout.getNome());
			pstm.setString(2, checkout.getSobrenome());
			pstm.setString(3, checkout.getEmail());
			pstm.setString(4, checkout.getEndereco());
			pstm.setString(5, checkout.getComplemento());
			pstm.setString(6, checkout.getPais());
			pstm.setString(7, checkout.getEstado());
			pstm.setDouble(8, checkout.getCep());
			pstm.setDouble(9, checkout.getPrecoPassagem());
			pstm.setString(10, checkout.getFormasPagamento());
	
			//QUAL O ID DO REGISTRO QUE DESEJA ATUALIZAR?
			pstm.setInt(11, checkout.getid());
			
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
		
		String sql = "DELETE FROM checkout WHERE id = ?";
				
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
		
	
	
	
	public List<Checkout> getCheckouts(){
		
		String sql = "SELECT * FROM checkouts";
		
		List<Checkout> checkouts = new ArrayList<Checkout>();
		
		Connection conn = null;
		PreparedStatement pstm = null;
		//Classe que vai recuperar os dados do banco ***SELECT***
		Result reset = null;
		
		try {
			
			conn = ConnectionFactory.createConnectionToMySQL();
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			ResultSet rset = pstm.executeQuery();
			
			while (rset.next()) {
				Checkout checkout = new Checkout();
				
				//Recuperar o id
				checkout.setId(rset.getInt("id"));
				//Recuperar o nome
				checkout.setNome(rset.getString("Nome"));
				//Recuperar o sobrenome
				checkout.setSobrenome(rset.getString("Sobrenome"));
				//Recuperar o Email
				checkout.setEmail(rset.getString("Email"));
				//Recuperar o Endereço
				checkout.setEndereco(rset.getString("Endereco"));
				//Recuperar o Complemento
				checkout.setComplemento(rset.getString("Complemento"));
				//Recuperar o Pais
				checkout.setPais(rset.getString("Pais"));
				//Recuperar o Estado
				checkout.setEstado(rset.getString("Estado"));
				//Recuperar o CEP
				checkout.setCep(rset.getDouble("Cep"));
				//Recuperar o Preço
				checkout.setPrecoPassagem(rset.getDouble("PrecoPassagem"));
				//Recuperar o Formas de Pagamento
				checkout.setFormasPagamento(rset.getString("FomasPagamento"));
				
				checkout.add(checkout);
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
			
			return checkouts;	
			
			}
		
		}


	public static void deleteByID() {
		// TODO Auto-generated method stub
		
	}





}

