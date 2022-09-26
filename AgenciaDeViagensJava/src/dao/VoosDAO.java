package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import connection.Conexao;
import modelo.Voos;

public class VoosDAO {

	Connection conn = null;
	PreparedStatement pstm = null;
	
	public void save(Voos _voos) {
		
 // ISSO É UMA SQL COMUM, OS "?" - SÃO OS PARÂMETROS QUE NÓS VAMOS ADICIONAR NA BASE DE DADOS
		String sql = "INSERT INTO voos(LinhaAerea, Origem, Destino, Partida, Chegada, Paradas, ValorVoo)" + " VALUES(?,?,?,?,?,?,?)";

		// TRY - TENTE EXECUTAR ESTES COMANDOS, MAS SE FALHAR CAIA NA EXCEÇÃO GENÉRICA (CATCH) 
		
		try {
			// CRIAR UMA CONEXÃO COM O BANCO
			conn = Conexao.createConnectionToMySQL();

			// CRIAR UM PREPAREDSTATMENT, CLASSE USADA PARA EXECUTAR A QUERY
			pstm = conn.prepareStatement(sql);  

			// ADICIONAR O VALOR DO 1° PARÂMETRO DA SQL
			pstm.setString(1, _voos.getLinhaAerea()); 
			
			// ADICIONAR O VALOR DO 2° PARÂMETRO DA SQL
			pstm.setString(2, _voos.getOrigem()); 
			
			// ADICIONAR O VALOR DO 3° PARÂMETRO DA SQL
			pstm.setString(3, _voos.getDestino()); 
			
			// ADICIONAR O VALOR DO 4° PARÂMETRO DA SQL
			pstm.setString(4, _voos.getPartida());

			// ADICIONAR O VALOR DO 5° PARÂMETRO DA SQL
			pstm.setString(5, _voos.getChegada());  
			
			// ADICIONAR O VALOR DO 6° PARÂMETRO DA SQL
			pstm.setDouble(6, _voos.getParadas());
												
			// ADICIONAR O VALOR DO 7° PARÂMETRO DA SQL
			pstm.setDouble(7, _voos.getValorVoo()); 
			
			// EXECUTA A SQL QUE RECEBEU POR PARÂMETRO PARA INSERÇÃO DOS DADOS NO BD
			pstm.execute();
			
		// O CATCH É O CONTROLE DE EXCEÇÃO CASO TENHA ALGUM ERRO (EXCEÇÃO GENÉRICA)
		} catch (Exception e) {

			e.printStackTrace(); // TRAZ UM RESUMO DO ERRO, QUE VOCÊ PODE ESTAR RECEBENDO
	    
		// O FINALLY SERÁ EXECUTADO DE UMA FORMA OU DE OUTRA, SUA IDEIA É FECHAR AS CONEXÕES
		} finally {

			// FECHAR AS CONEXÕES
			try {
				if (pstm != null) {
					pstm.close(); // POR EXEMPLO - O OBJ "PSTM" PRECISA SER FECHADO, POIS SE FORMOS USAR ELE EM OUTRA PARTE DO CÓDIGO NÃO IRÁ DAR CONFLITO
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) { //OUTRO CACTH PARA ESTE 2° TRY
				e.printStackTrace();
			}
		}
	}

	public void removeById(int _IdVoo) {

		String sql = "DELETE FROM voos WHERE IdVoo = ?";

		try {
			conn = Conexao.createConnectionToMySQL(); // CRIA A CONEXÃO
			pstm = conn.prepareStatement(sql); // PASSA O COMANDO SQL PARA O OBJETO PSTM
			
			// SETA O ID NO COMANDO SQL
			pstm.setInt(1, _IdVoo); 
			
			pstm.execute(); // EXECUTA O COMANDO SQL QUE ESTÁ NO OBJETO PSTM
		} catch (Exception e) { //CATCH É O CONTROLE DE EXCEÇÃO
			e.printStackTrace(); //RESUMO DO ERRO
		} finally { // FECHAR AS CONEXÕES
			try {
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) { //OUTRO CACTH PARA ESTE 2° TRY
				e.printStackTrace();
			}
		}
	}

	public void update (Voos _voos) {
		
	// UPDATE RECEBE POR PARÂMETRO UM OBJETO "_voos". ATENÇÃO, voos (TABELA DO BANCO) NA STRING sql é != _voos,
	// SET LOCALVIAGEM (TABELA DO BD) O "?" INDICA QUE VAMOS SETAR - MUDAR/CONFIGURAR UM NOVO VALOR (ATRIBUTO), 
    // ESTE VALOR VIRÁ DO OBJETO, IREMOS ALTEREAR PELO ID DO ATRIBUTO DA TABELA.
		String sql = "UPDATE voos SET LinhaAerea = ?, Origem = ?, Destino = ?, Partida = ?, Chegada = ?, Paradas = ?, ValorVoo = ?" + " WHERE IdVoo = ?"; 
		try {
			conn = Conexao.createConnectionToMySQL();  // CRIA A CONEXÃO
			pstm = conn.prepareStatement(sql); // PASSA O COMANDO SQL PARA O OBJETO PSTM
			
			// ADICIONA O VALOR AO PARÂMETRO DA SQL
			pstm.setString(1, _voos.getLinhaAerea()); 
			// ADICIONA O VALOR AO PARÂMETRO DA SQL
			pstm.setString(2, _voos.getOrigem()); 		
			// ADICIONA O VALOR AO PARÂMETRO DA SQL
			pstm.setString(3, _voos.getDestino()); 		
			// ADICIONA O VALOR AO PARÂMETRO DA SQL
			pstm.setString(4, _voos.getPartida());
			// ADICIONA O VALOR AO PARÂMETRO DA SQL
			pstm.setString(5, _voos.getChegada());  			
			// ADICIONA O VALOR AO PARÂMETRO DA SQL
			pstm.setDouble(6, _voos.getParadas());											
			// ADICIONA O VALOR AO PARÂMETRO DA SQL
			pstm.setDouble(7, _voos.getValorVoo());	
			
	// ESTAMOS SETANDO O ID (NÃO PARA A TABELA), MAS PARA USAR COMO CONDIÇÃO DE ATUALIZAÇÃO (WHERE IdVoo = ?)
	// SE NÃO HOUVER ESTE COMANDO "pstm.setInt(3, _voos.getIdVoo());" O CÓDIGO IRÁ ATUALIZAR TODOS OS CONTATOS.
			pstm.setInt(8, _voos.getIdVoo());	
			
			pstm.execute(); // EXECUTA O COMANDO SQL QUE ESTÁ NO OBJETO PSTM
		} catch (Exception e) { //CATCH É O CONTROLE DE EXCEÇÃO
			e.printStackTrace(); //RESUMO DO ERRO
		} finally { // FECHAR AS CONEXÕES
			try {
				if (pstm != null) {
					pstm.close(); 
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) { //OUTRO CACTH PARA ESTE 2° TRY
				e.printStackTrace();
			}
		}	
	}
	
	public List<Voos> getVoos(){
	
//COMO ESTAMOS DANDO UM SELECT NO BANCO IRÁ VIR +1 INFORMAÇÃO - LISTA DE VOOS.
	String sql = "SELECT * FROM voos";
	
//COMO IRÁ VIR UMA LISTA DE VOOS, IREMOS CRIAR UMA LISTA DA CLASSE VOOS QUE CHAMAREMOS DE "voos",
//ESTA VARIÁVEL "voos" IRÁ RECEBER UMA COLEÇÃO DO OBJETO VOOS E ARMAZENARÁ INTERNAMENTE.
	List<Voos> voos = new ArrayList<Voos>();
	
//CLASSE QUE VAI RECUPERAR OS DADOS DO BANCO DE DADOS - "ResultSet" É UM OBJETO DO TIPO PLANILHA (MATRIZ VIRTUAL) PARA ORGANIZAR OS DADOS QUE VEEM DO BANCO DE DADOS
//O "ResultSet" IRÁ RECEBER ESTA COLEÇÃO DA VARIÁVEL "voos".	
	ResultSet rset = null;

	try {
		conn = Conexao.createConnectionToMySQL();  // CRIA A CONEXÃO
		pstm = conn.prepareStatement(sql); // PASSA O COMANDO SQL PARA O OBJETO PSTM
		
//EXECUÇÃO DO COMANDO E DEVOLVE O RESULTADO DENTRO DO "rset". TODOS OS DADOS QUE ESTÃO NA TABELA VOOS FICARÃO DENTRO DESTE OBJETO "rset".
//SE ELE ESTA DENTRO DESTE OBJETO, ENTÃO DEVEMOS VARRER ESTE OBJETO (RODAR CADA POSIÇÃO DESTE OBJETO)		
		rset = pstm.executeQuery(); 
		
  //COMO ELE É UMA PLANILHA IREMOS RODAR DESTA FORMA - ENQUANTO EXISTIR DADOS NO BANCO DE DADOS, FAÇA:
		while (rset.next()) { //LAÇO DE REPETIÇÃO PQ IREMOS PERCORRER VÁRIAS VEZES O OBJETO "rset", IREMOS BUSCAR TODOS OS SEUS DADOS QUE NO CASO ELE IRÁ RODAR 3 VEZES.
			Voos _voos = new Voos();
			
			//RECUPERA O IdVoo DO BANCO E ATRIBUI ELE AO OBJETO
			_voos.setIdVoo(rset.getInt("IdVoo"));

			//RECUPERA O LinhaAerea DO BANCO E ATRIBUI ELE AO OBJETO
			_voos.setLinhaAerea(rset.getString("LinhaAerea"));;
			
			//RECUPERA O Origem DO BANCO E ATRIBUI ELE AO OBJETO
			_voos.setOrigem(rset.getString("Origem"));
			
			//RECUPERA O Destino DO BANCO E ATRIBUI ELE AO OBJETO
			_voos.setDestino(rset.getString("Destino"));

			//RECUPERA O Partida DO BANCO E ATRIBUI ELE AO OBJETO
			_voos.setPartida(rset.getString("Partida"));
			
			//RECUPERA O Chegada DO BANCO E ATRIBUI ELE AO OBJETO
			_voos.setChegada(rset.getString("Chegada"));
			
			//RECUPERA O Paradas DO BANCO E ATRIBUI ELE AO OBJETO
			_voos.setParadas(rset.getDouble("Paradas"));
			
			//RECUPERA O ValorVoo DO BANCO E ATRIBUI ELE AO OBJETO
			_voos.setValorVoo(rset.getDouble("ValorVoo"));
			
			//ADICIONO OS VOOS RECUPERADOS, À LISTA DE VOOS
			voos.add(_voos); //CADA VEZ QUE ELE RODAR IRÁ CRIAR UM NOVO OBJETO (_voos) 
			//E GUARDAR OS DADOS DESTE OBJETO (IdVoo, LinhaAerea, Origem, Destino, Partida, Chegada, Paradas, ValorVoo) EM "_voos" 
			//QUE ADICIONARÁ LÁ EM BAIXO (voos.add(_voos)) DENTRO DA LISTA "voos", ESTE MÉTODO DEVOLVE A LISTA COMPLETA.	
			}
		
		}catch (Exception e) { //CATCH É O CONTROLE DE EXCEÇÃO
			e.printStackTrace(); //RESUMO DO ERRO
		} finally { // FECHAR AS CONEXÕES
			try {
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) { //OUTRO CACTH PARA ESTE 2° TRY
				e.printStackTrace();
			}
		}
	   return voos;
	}

	public Voos getVoosById(int _IdVoo) {

        String sql = "SELECT * FROM voos where id = ?";
        
        // Classe que vai recuperar os dados do banco de dados
        Voos idVoo = new Voos();
        ResultSet rset = null;

        try {
            conn = Conexao.createConnectionToMySQL();
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, _IdVoo);
            rset = pstm.executeQuery();
            
         // Enquanto existir dados no banco de dados, faça
         	while (rset.next()) {
         		
         		idVoo.setIdVoo(rset.getInt("IdVoo"));
         		idVoo.setLinhaAerea(rset.getString("LinhaAerea"));
         		idVoo.setOrigem(rset.getString("Origem"));
         		idVoo.setDestino(rset.getString("Destino"));
         		idVoo.setPartida(rset.getString("Partida"));
         		idVoo.setChegada(rset.getString("Chegada"));
         		idVoo.setParadas(rset.getDouble("Paradas"));
         		idVoo.setValorVoo(rset.getDouble("ValorVoo"));
         		
         }   
     } catch (Exception e) {
            e.printStackTrace();
     } finally {
            try {
                if (rset != null) {
                    rset.close();
                }
                if (pstm != null) {
                    pstm.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return idVoo;
    }
}