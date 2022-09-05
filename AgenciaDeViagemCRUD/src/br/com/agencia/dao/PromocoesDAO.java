package br.com.agencia.dao;

import java.sql.Connection;
import br.com.agencia.factory.ConnectionFactory;
import br.com.agencia.model.Destino;
import br.com.agencia.model.Promocoes;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.xdevapi.Result;

public class PromocoesDAO {

	/*
	 * CRUD
	 * C: CREATE
	 * R: READ
	 * U: UPDATE
	 * D: DELETE
	 */
	public void save(Promocoes promocoes) {
		String sql = "INSERT INTO passageiros(id, LocalViagem, ValorViagem) VALUES (?,?,?)";
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			//Criar uma conexão com o banco de dados
			conn = ConnectionFactory.createConnectionToMySQL();
			
			//Criamos uma PreparedStatementWrapper, para executar uma Query
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			//Adicionar os valoress que são esperados pela query
			pstm.setInt(1, promocoes.getid());
			pstm.setString(2, promocoes.getLocalViagem());
			pstm.setDouble(3, promocoes.getValorViagem());
			
			//Executar a query
			pstm.execute();
			
			System.out.println("Destino-Promoção registrado com sucesso!");
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

	
	public void update(Promocoes promocoes) {
		
		String sql = "UPDATE checkout SET LocalViagem = ?, ValorViagem = ? " +
		"WHERE id = ?";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		
		try {
			//CRIAR CONEXÃO COM O BANCO
			conn =  ConnectionFactory.createConnectionToMySQL();
			
			//CRIAR A CLASSE PARA EXECUTAR A QUERY
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			
			//ADICONAR OS VALORES PARA ATUALIZAR
			pstm.setString(1, promocoes.getLocalViagem());
			pstm.setDouble(2, promocoes.getValorViagem());
	
			//QUAL O ID DO REGISTRO QUE DESEJA ATUALIZAR?
			pstm.setInt(3, promocoes.getid());
			
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
		
		String sql = "DELETE FROM promocoes WHERE id = ?";
				
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
		
	

		public List<Promocoes> getPromocoes(){
		
		String sql = "SELECT * FROM promocoes";
		
		List<Promocoes> promocoes = new ArrayList<Promocoes>();
		
		Connection conn = null;
		PreparedStatement pstm = null;
		//Classe que vai recuperar os dados do banco ***SELECT***
		Result reset = null;
		
		try {
			
			conn = ConnectionFactory.createConnectionToMySQL();
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			ResultSet rset = pstm.executeQuery();
			
			while (rset.next()) {
				Promocoes promocoes = new Promocoes();
				
				//Recuperar o id
				promocoes.setId(rset.getInt("id"));
				//Recuperar o Local Viagem
				promocoes.setLocalViagem(rset.getString("LocalViagem"));
				//Recuperar o Valor Viagem
				promocoes.setValorViagem(rset.getFloat("ValorViagem"));
				
				
				promocoes.add(promocoes);
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
			
			return promocoes;	
			
			}
		
		}


		public void deleteByID() {
			// TODO Auto-generated method stub
			
		}




	
	
}
