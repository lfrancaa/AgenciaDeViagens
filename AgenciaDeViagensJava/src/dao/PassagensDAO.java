package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import connection.Conexao;
import modelo.Passagens;

public class PassagensDAO {

	Connection conn = null;
	PreparedStatement pstm = null;
	
	public void save(Passagens _passagens) {
		
 // ISSO É UMA SQL COMUM, OS "?" - SÃO OS PARÂMETROS QUE NÓS VAMOS ADICIONAR NA BASE DE DADOS
		String sql = "INSERT INTO passagens(HoraViagem, NomeLocalOrigem, NomeLocalDestino, DataViagemIda, DataViagemVolta)" + " VALUES(?,?,?,?,?)";

		// TRY - TENTE EXECUTAR ESTES COMANDOS, MAS SE FALHAR CAIA NA EXCEÇÃO GENÉRICA (CATCH) 
		
		try {
			// CRIAR UMA CONEXÃO COM O BANCO
			conn = Conexao.createConnectionToMySQL();

			// CRIAR UM PREPAREDSTATMENT, CLASSE USADA PARA EXECUTAR A QUERY
			pstm = conn.prepareStatement(sql);  

			// ADICIONAR O VALOR DO 1° PARÂMETRO DA SQL
			pstm.setString(1, _passagens.getHoraViagem());  
			
			// ADICIONAR O VALOR DO 2° PARÂMETRO DA SQL
			pstm.setString(2, _passagens.getNomeLocalOrigem());
			
			// ADICIONAR O VALOR DO 3° PARÂMETRO DA SQL
			pstm.setString(3, _passagens.getNomeLocalDestino()); 
			
			// ADICIONAR O VALOR DO 4° PARÂMETRO DA SQL
			pstm.setString(4, _passagens.getDataViagemIda());  
			
			// ADICIONAR O VALOR DO 5° PARÂMETRO DA SQL
			pstm.setString(5, _passagens.getDataViagemVolta());

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

	public void removeById(int _IdPassagem) {

		String sql = "DELETE FROM passagens WHERE IdPassagem = ?";

		try {
			conn = Conexao.createConnectionToMySQL(); // CRIA A CONEXÃO
			pstm = conn.prepareStatement(sql); // PASSA O COMANDO SQL PARA O OBJETO PSTM
			
			// SETA O ID NO COMANDO SQL
			pstm.setInt(1, _IdPassagem); 
			
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

	public void update (Passagens _passagens) {
		
	// UPDATE RECEBE POR PARÂMETRO UM OBJETO "_passagens". ATENÇÃO, passagens (TABELA DO BANCO) NA STRING sql é != _passagens,
	// SET LOCALVIAGEM (TABELA DO BD) O "?" INDICA QUE VAMOS SETAR - MUDAR/CONFIGURAR UM NOVO VALOR (ATRIBUTO), 
    // ESTE VALOR VIRÁ DO OBJETO, IREMOS ALTEREAR PELO ID DO ATRIBUTO DA TABELA. 
		String sql = "UPDATE passagens SET HoraViagem = ?, NomeLocalOrigem = ?, NomeLocalDestino = ?, DataViagemIda = ?, DataViagemVolta = ?" + " WHERE IdPassagem = ?";
		try {
			conn = Conexao.createConnectionToMySQL();  // CRIA A CONEXÃO
			pstm = conn.prepareStatement(sql); // PASSA O COMANDO SQL PARA O OBJETO PSTM
			
			
			// ADICIONA O VALOR AO PARÂMETRO DA SQL
			pstm.setString(1, _passagens.getHoraViagem());  		
			// ADICIONA O VALOR AO PARÂMETRO DA SQL
			pstm.setString(2, _passagens.getNomeLocalOrigem());			
			// ADICIONA O VALOR AO PARÂMETRO DA SQL
			pstm.setString(3, _passagens.getNomeLocalDestino()); 		
			// ADICIONA O VALOR AO PARÂMETRO DA SQL
			pstm.setString(4, _passagens.getDataViagemIda());  			
			// ADICIONA O VALOR AO PARÂMETRO DA SQL
			pstm.setString(5, _passagens.getDataViagemVolta());

			
	// ESTAMOS SETANDO O ID (NÃO PARA A TABELA), MAS PARA USAR COMO CONDIÇÃO DE ATUALIZAÇÃO (WHERE IdPassagem = ?)
	// SE NÃO HOUVER ESTE COMANDO "pstm.setInt(3, _passagens.getIdPassagem());" O CÓDIGO IRÁ ATUALIZAR TODOS OS CONTATOS.
			pstm.setInt(6, _passagens.getIdPassagem());	
			
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
	
	public List<Passagens> getPassagens(){
	
//COMO ESTAMOS DANDO UM SELECT NO BANCO IRÁ VIR +1 INFORMAÇÃO - LISTA DE PASSAGENS.
	String sql = "SELECT * FROM passagens";
	
//COMO IRÁ VIR UMA LISTA DE PASSAGENS, IREMOS CRIAR UMA LISTA DA CLASSE PASSAGENS QUE CHAMAREMOS DE "passagens",
//ESTA VARIÁVEL "passagens" IRÁ RECEBER UMA COLEÇÃO DO OBJETO PASSAGENS E ARMAZENARÁ INTERNAMENTE.
	List<Passagens> passagens = new ArrayList<Passagens>();
	
//CLASSE QUE VAI RECUPERAR OS DADOS DO BANCO DE DADOS - "ResultSet" É UM OBJETO DO TIPO PLANILHA (MATRIZ VIRTUAL) PARA ORGANIZAR OS DADOS QUE VEEM DO BANCO DE DADOS
//O "ResultSet" IRÁ RECEBER ESTA COLEÇÃO DA VARIÁVEL "passagens".	
	ResultSet rset = null;

	try {
		conn = Conexao.createConnectionToMySQL();  // CRIA A CONEXÃO
		pstm = conn.prepareStatement(sql); // PASSA O COMANDO SQL PARA O OBJETO PSTM
		
//EXECUÇÃO DO COMANDO E DEVOLVE O RESULTADO DENTRO DO "rset". TODOS OS DADOS QUE ESTÃO NA TABELA PASSAGENS FICARÃO DENTRO DESTE OBJETO "rset".
//SE ELE ESTA DENTRO DESTE OBJETO, ENTÃO DEVEMOS VARRER ESTE OBJETO (RODAR CADA POSIÇÃO DESTE OBJETO)		
		rset = pstm.executeQuery(); 
		
  //COMO ELE É UMA PLANILHA IREMOS RODAR DESTA FORMA - ENQUANTO EXISTIR DADOS NO BANCO DE DADOS, FAÇA:
		while (rset.next()) { //LAÇO DE REPETIÇÃO PQ IREMOS PERCORRER VÁRIAS VEZES O OBJETO "rset", IREMOS BUSCAR TODOS OS SEUS DADOS QUE NO CASO ELE IRÁ RODAR 3 VEZES.
			Passagens _passagens = new Passagens();
			
			//RECUPERA O IdPassagem DO BANCO E ATRIBUI ELE AO OBJETO
			_passagens.setIdPassagem(rset.getInt("IdPassagem"));
			//RECUPERA O HoraViagem DO BANCO E ATRIBUI ELE AO OBJETO
			_passagens.setHoraViagem(rset.getString("HoraViagem"));;
			//RECUPERA O NomeLocalOrigem DO BANCO E ATRIBUI ELE AO OBJETO
			_passagens.setNomeLocalOrigem(rset.getString("NomeLocalOrigem"));
			//RECUPERA O NomeLocalDestino DO BANCO E ATRIBUI ELE AO OBJETO
			_passagens.setNomeLocalDestino(rset.getString("NomeLocalDestino"));
			//RECUPERA O DataViagemIda DO BANCO E ATRIBUI ELE AO OBJETO
			_passagens.setDataViagemIda(rset.getString("DataViagemIda"));
			//RECUPERA O DataViagemVolta DO BANCO E ATRIBUI ELE AO OBJETO
			_passagens.setDataViagemVolta(rset.getString("DataViagemVolta"));

			//ADICIONO OS PASSAGENS RECUPERADOS, À LISTA DE PASSAGENS
			passagens.add(_passagens); //CADA VEZ QUE ELE RODAR IRÁ CRIAR UM NOVO OBJETO (_passagens) 
			//E GUARDAR OS DADOS DESTE OBJETO (IdPassagem, HoraViagem, NomeLocalOrigem, NomeLocalDestino, DataViagemIda, DataViagemVolta) EM "_passagens" 
			//QUE ADICIONARÁ LÁ EM BAIXO (passagens.add(_passagens)) DENTRO DA LISTA "passagens", ESTE MÉTODO DEVOLVE A LISTA COMPLETA.	
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
	   return passagens;
	}

	public Passagens getPassagensById(int _IdPassagem) {

        String sql = "SELECT * FROM passagens where id = ?";
        
        // Classe que vai recuperar os dados do banco de dados
        Passagens idPassagens = new Passagens();
        ResultSet rset = null;

        try {
            conn = Conexao.createConnectionToMySQL();
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, _IdPassagem);
            rset = pstm.executeQuery();

            
         // Enquanto existir dados no banco de dados, faça
         	while (rset.next()) {

         		idPassagens.setIdPassagem(rset.getInt("IdPassagem"));
         		idPassagens.setHoraViagem(rset.getString("HoraViagem"));
         		idPassagens.setNomeLocalOrigem(rset.getString("NomeLocalOrigem"));
         		idPassagens.setNomeLocalDestino(rset.getString("NomeLocalDestino"));
         		idPassagens.setDataViagemIda(rset.getString("DataViagemIda"));
         		idPassagens.setDataViagemVolta(rset.getString("DataViagemVolta"));  
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
        return idPassagens;
    }

}