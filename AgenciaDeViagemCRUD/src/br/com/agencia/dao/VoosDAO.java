package br.com.agencia.dao;
import java.sql.Connection;
import br.com.agencia.factory.ConnectionFactory;
import br.com.agencia.model.Checkout;
import br.com.agencia.model.Voos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.xdevapi.Result;

public class VoosDAO {

	/*
	 * CRUD
	 * C: CREATE
	 * R: READ
	 * U: UPDATE
	 * D: DELETE
	 */
	public void save(Voos voos) {
		String sql = "INSERT INTO passageiros(id, LinhaAerea, Origem, Destino, Partida, Chegada, Paradas, ValorVoo) VALUES (?,?,?)";
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			//Criar uma conexão com o banco de dados
			conn = ConnectionFactory.createConnectionToMySQL();
			
			//Criamos uma PreparedStatementWrapper, para executar uma Query
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			//Adicionar os valoress que são esperados pela query
			
			pstm.setInt(1, voos.getid());
			pstm.setString(2, voos.getLinhaAerea());
			pstm.setString(3, voos.getOrigem());
			pstm.setString(4, voos.getDestino());
			pstm.setFloat(5, voos.getPartida());
			pstm.setFloat(6, voos.getChegada());
			pstm.setDouble(7, voos.getParadas());
			pstm.setDouble(8, voos.getValorVoo());
			
			//Executar a query
			pstm.execute();
			
			System.out.println("Voo registrado com sucesso!");
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
		
	
	public void update(Voos voos) {
		
		String sql = "UPDATE checkout SET LinhaAerea = ?, Origem = ?, Destino = ?, Partida = ?, Chegada = ?, Paradas = ?, ValorVoo = ? " +
		"WHERE id = ?";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		
		try {
			//CRIAR CONEXÃO COM O BANCO
			conn =  ConnectionFactory.createConnectionToMySQL();
			
			//CRIAR A CLASSE PARA EXECUTAR A QUERY
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			
			//ADICONAR OS VALORES PARA ATUALIZAR
			pstm.setString(1, voos.getLinhaAerea());
			pstm.setString(2, voos.getOrigem());
			pstm.setString(3, voos.getDestino());
			pstm.setDouble(4, voos.getPartida());
			pstm.setFloat(5, voos.getChegada());
			pstm.setDouble(6, voos.getParadas());
			pstm.setDouble(7, voos.getValorVoo());
	
			//QUAL O ID DO REGISTRO QUE DESEJA ATUALIZAR?
			pstm.setInt(8, voos.getid());
			
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
		
		String sql = "DELETE FROM voos WHERE id = ?";
				
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
		
	
	
		public List<Voos> getVoos(){
		
		String sql = "SELECT * FROM voos";
		
		List<Voos> voos = new ArrayList<Voos>();
		
		Connection conn = null;
		PreparedStatement pstm = null;
		//Classe que vai recuperar os dados do banco ***SELECT***
		Result reset = null;
		
		try {
			
			conn = ConnectionFactory.createConnectionToMySQL();
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			ResultSet rset = pstm.executeQuery();
			
			while (rset.next()) {
				Voos voos = new Voos();
				
				//Recuperar o id
				voos.setId(rset.getInt("id"));
				//Recuperar o Linha Aerea
				voos.setLinhaAerea(rset.getString("LinhaAerea"));
				//Recuperar o Origem
				voos.setOrigem(rset.getString("Origem"));
				//Recuperar o Destino
				voos.setDestino(rset.getString("Destino"));
				//Recuperar o Partida
				voos.setPartida(rset.getDouble("Partida"));
				//Recuperar o Chegada
				voos.setChegada(rset.getDouble("Chegada"));
				//Recuperar o Paradas
				voos.setParadas(rset.getDouble("Paradas"));
				//Recuperar o Paradas
				voos.setValorVoo(rset.getDouble("ValorVoo"));
				
				voos.add(voos);
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
			
			return voos;	
			
			}
		
		}


		public void deleteByID() {
			// TODO Auto-generated method stub
			
		}

	

	
	
}
