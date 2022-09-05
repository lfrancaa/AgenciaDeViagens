package br.com.agencia.dao;

import java.sql.Connection;
import br.com.agencia.factory.ConnectionFactory;
import br.com.agencia.model.Checkout;
import br.com.agencia.model.Passagens;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.xdevapi.Result;

public class PassagensDAO {

	/*
	 * CRUD
	 * C: CREATE
	 * R: READ
	 * U: UPDATE
	 * D: DELETE
	 */
	public void save(Passagens passagens) {
		String sql = "INSERT INTO passageiros(id, HoraViagem, NomeLocalOrigem, NomeLocalDestino, DataViagemIda, DataViagemVolta) VALUES (?,?,?)";
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			//Criar uma conexão com o banco de dados
			conn = ConnectionFactory.createConnectionToMySQL();
			
			//Criamos uma PreparedStatementWrapper, para executar uma Query
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			//Adicionar os valoress que são esperados pela query
			pstm.setInt(1, passagens.getid());
			pstm.setDouble(2, passagens.getHoraViagem());
			pstm.setString(3, passagens.getNomeLocalOrigem());
			pstm.setString(4, passagens.getNomeLocalDestino());
			pstm.setDouble(5, passagens.getDataViagemIda());
			pstm.setDouble(6, passagens.getDataViagemVolta());			
			//Executar a query
			pstm.execute();
			
			System.out.println("Passagem registrada com sucesso!");
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
	
	
	public void update(Passagens passagens) {
		
		String sql = "UPDATE checkout SET HoraViagem = ?, NomeLocalOrigem = ?, NomeLocalDestino = ?, DataViagemIda = ?, DataViagemVolta = ? " +
		"WHERE id = ?";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		
		try {
			//CRIAR CONEXÃO COM O BANCO
			conn =  ConnectionFactory.createConnectionToMySQL();
			
			//CRIAR A CLASSE PARA EXECUTAR A QUERY
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			
			//ADICONAR OS VALORES PARA ATUALIZAR
			pstm.setDouble(1, passagens.getHoraViagem());
			pstm.setString(2, passagens.getNomeLocalOrigem());
			pstm.setString(3, passagens.getNomeLocalDestino());
			pstm.setDouble(4, passagens.getDataViagemIda());
			pstm.setDouble(5, passagens.getDataViagemVolta());
	
			//QUAL O ID DO REGISTRO QUE DESEJA ATUALIZAR?
			pstm.setInt(6, passagens.getid());
			
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
		
		String sql = "DELETE FROM passagens WHERE id = ?";
				
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
			

	public List<Passagens> getPassagens(){
		
		String sql = "SELECT * FROM passagens";
		
		List<Passagens> checkouts = new ArrayList<Passagens>();
		
		Connection conn = null;
		PreparedStatement pstm = null;
		//Classe que vai recuperar os dados do banco ***SELECT***
		Result reset = null;
		
		try {
			
			conn = ConnectionFactory.createConnectionToMySQL();
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			ResultSet rset = pstm.executeQuery();
			
			while (rset.next()) {
				Passagens passagens = new Passagens();
				
				//Recuperar o id
				passagens.setId(rset.getInt("id"));
				
				//Recuperar o Hora Viagem
				passagens.setHoraViagem(rset.getDouble("HoraVaigem"));
				
				//Recuperar o Nome Local Origem
				passagens.setNomeLocalOrigem(rset.getString("NomeLocalOrigem"));
				//Recuperar o Nome Local Destino
				passagens.setNomeLocalDestino(rset.getString("NomeLocalDestino"));
				//Recuperar o Data Viagem Ida
				passagens.setDataViagemIda(rset.getDouble("DataViagemIda"));
				//Recuperar o Data Viagem Volta
				passagens.setDataViagemIda(rset.getDouble("DataViagemIda"));
				
				
				passagens.add(passagens);
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
			
			return getPassagens();	
			
			}
		
		}


	public void deleteByID() {
		// TODO Auto-generated method stub
		
	}




	
}
