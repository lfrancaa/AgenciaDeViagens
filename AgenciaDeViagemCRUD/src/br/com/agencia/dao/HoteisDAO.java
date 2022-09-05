package br.com.agencia.dao;

import java.sql.Connection;
import br.com.agencia.factory.ConnectionFactory;
import br.com.agencia.model.Checkout;
import br.com.agencia.model.Hoteis;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.xdevapi.Result;

public class HoteisDAO {

	/*
	 * CRUD
	 * C: CREATE
	 * R: READ
	 * U: UPDATE
	 * D: DELETE
	 */
	public void save(Hoteis hoteis) {
		String sql = "INSERT INTO passageiros(id, Checkin, Noites, Adultos, ValorHospedagem) VALUES (?,?,?,?,?,?)";
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			//Criar uma conexão com o banco de dados
			conn = ConnectionFactory.createConnectionToMySQL();
			
			//Criamos uma PreparedStatementWrapper, para executar uma Query
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			//Adicionar os valoress que são esperados pela query

			pstm.setInt(1, hoteis.getid());
			pstm.setDouble(2, hoteis.getCheckin());
			pstm.setDouble(3, hoteis.getNoites());
			pstm.setDouble(4, hoteis.getAdultos());
			pstm.setDouble(5, hoteis.getValorHospedagem());
			
			//Executar a query
			pstm.execute();
			
			System.out.println("Hotel registrado com sucesso!");
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

	public void update(Hoteis hoteis) {
		
		String sql = "UPDATE checkout SET Checkin = ?, Noites = ?, Adultos = ?, ValorHospedagem = ? " +
		"WHERE id = ?";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		
		try {
			//CRIAR CONEXÃO COM O BANCO
			conn =  ConnectionFactory.createConnectionToMySQL();
			
			//CRIAR A CLASSE PARA EXECUTAR A QUERY
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			
			//ADICONAR OS VALORES PARA ATUALIZAR
			pstm.setDouble(1, hoteis.getCheckin());
			pstm.setDouble(2, hoteis.getNoites());
			pstm.setDouble(3, hoteis.getAdultos());
			pstm.setDouble(4, hoteis.getValorHospedagem());
	
			//QUAL O ID DO REGISTRO QUE DESEJA ATUALIZAR?
			pstm.setInt(5, hoteis.getid());
			
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
		
		String sql = "DELETE FROM hoteis WHERE id = ?";
				
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
		
	

	
	
		public List<Hoteis> getHoteis(){
		
		String sql = "SELECT * FROM hoteis";
		
		List<Hoteis> hoteis = new ArrayList<Hoteis>();
		
		Connection conn = null;
		PreparedStatement pstm = null;
		//Classe que vai recuperar os dados do banco ***SELECT***
		Result reset = null;
		
		try {
			
			conn = ConnectionFactory.createConnectionToMySQL();
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			ResultSet rset = pstm.executeQuery();
			
			while (rset.next()) {
				Hoteis hoteis = new Hoteis();
			
				//Recuperar o id
				hoteis.setId(rset.getInt("id"));
				//Recuperar o Hotel
				hoteis.setHoteis(rset.getString("Hoteis"));
				//Recuperar o Checkin
				hoteis.setChekin(rset.getDouble("Checkin"));
				//Recuperar o Noites
				hoteis.setNoites(rset.getDouble("Noites"));
				//Recuperar o Adultos
				hoteis.setAdultos(rset.getString("Adultos"));
				//Recuperar o Valor Hospedagem
				hoteis.setValorHospedagem(rset.getString("ValorHospedagem"));
				
				hoteis.add(hoteis);
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
			
			return hoteis;	
			
			}
		
		}

		public void deleteByID() {
			// TODO Auto-generated method stub
			
		}

}

