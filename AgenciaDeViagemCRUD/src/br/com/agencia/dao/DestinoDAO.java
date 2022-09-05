package br.com.agencia.dao;

import java.sql.Connection;
import br.com.agencia.factory.ConnectionFactory;
import br.com.agencia.model.Checkout;
import br.com.agencia.model.Destino;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.xdevapi.Result;

public class DestinoDAO {

	/*
	 * CRUD
	 * C: CREATE
	 * R: READ
	 * U: UPDATE
	 * D: DELETE
	 */
	public void save(Destino destino) {
		String sql = "INSERT INTO passageiros(id, LocalViagem, ValorViagem) VALUES (?,?,?)";
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			//Criar uma conexão com o banco de dados
			conn = ConnectionFactory.createConnectionToMySQL();
			
			//Criamos uma PreparedStatementWrapper, para executar uma Query
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			//Adicionar os valoress que são esperados pela query
			pstm.setInt(1, destino.getid());
			pstm.setString(2, destino.getLocalViagem());
			pstm.setFloat(3, destino.getValorViagem());
			
			//Executar a query
			pstm.execute();
			
			System.out.println("Destino registrado com sucesso!");
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
	
	
		public void update(Destino destino) {
		
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
			pstm.setString(1, destino.getLocalViagem());
			pstm.setDouble(2, destino.getValorViagem());
	
			//QUAL O ID DO REGISTRO QUE DESEJA ATUALIZAR?
			pstm.setInt(3, destino.getid());
			
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
			
			String sql = "DELETE FROM destino WHERE id = ?";
					
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
			
		

	
	public List<Destino> getDestino(){
		
		String sql = "SELECT * FROM destino";
		
		List<Destino> destino = new ArrayList<Destino>();
		
		Connection conn = null;
		PreparedStatement pstm = null;
		//Classe que vai recuperar os dados do banco ***SELECT***
		Result reset = null;
		
		try {
			
			conn = ConnectionFactory.createConnectionToMySQL();
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			ResultSet rset = pstm.executeQuery();
			
			while (rset.next()) {
				Destino destino = new Destino();
				
				//Recuperar o id
				destino.setId(rset.getInt("id"));
				//Recuperar o Local Viagem
				destino.setLocalViagem(rset.getString("LocalViagem"));
				//Recuperar o Valor Viagem
				destino.setValorViagem(rset.getFloat("ValorViagem"));
				
				
				destino.add(destino);
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
			
			return destino;	
			
			}
		
		}


	public void deleteByID() {
		// TODO Auto-generated method stub
		
	}


	

	
	
}
