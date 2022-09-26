package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import connection.Conexao;
import modelo.Promocoes;

public class PromocoesDAO {

	Connection conn = null;
	PreparedStatement pstm = null;
	
	public void save(Promocoes _promocoes) {
		
 // ISSO É UMA SQL COMUM, OS "?" - SÃO OS PARÂMETROS QUE NÓS VAMOS ADICIONAR NA BASE DE DADOS
		String sql = "INSERT INTO promocoes(LocalViagem, ValorViagem)" + " VALUES(?,?)";

		// TRY - TENTE EXECUTAR ESTES COMANDOS, MAS SE FALHAR CAIA NA EXCEÇÃO GENÉRICA (CATCH) 
		
		try {
			// CRIAR UMA CONEXÃO COM O BANCO
			conn = Conexao.createConnectionToMySQL();

			// CRIAR UM PREPAREDSTATMENT, CLASSE USADA PARA EXECUTAR A QUERY
			pstm = conn.prepareStatement(sql);  

			// ADICIONAR O VALOR DO 1° PARÂMETRO DA SQL
			pstm.setString(1, _promocoes.getLocalViagem());  

			// ADICIONAR O VALOR DO 2° PARÂMETRO DA SQL
			pstm.setDouble(2, _promocoes.getValorViagem());

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

	public void removeById(int _IdPromocao) {

		String sql = "DELETE FROM promocoes WHERE IdPromocao = ?";

		try {
			conn = Conexao.createConnectionToMySQL(); // CRIA A CONEXÃO
			pstm = conn.prepareStatement(sql); // PASSA O COMANDO SQL PARA O OBJETO PSTM
			
			// SETA O ID NO COMANDO SQL
			pstm.setInt(1, _IdPromocao); 
			
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

	public void update (Promocoes _promocoes) {
		
	// UPDATE RECEBE POR PARÂMETRO UM OBJETO "_promocoes". ATENÇÃO, promocoes (TABELA DO BANCO) NA STRING sql é != _promocoes,
	// SET LOCALVIAGEM (TABELA DO BD) O "?" INDICA QUE VAMOS SETAR - MUDAR/CONFIGURAR UM NOVO VALOR (ATRIBUTO), 
    // ESTE VALOR VIRÁ DO OBJETO, IREMOS ALTEREAR PELO ID DO ATRIBUTO DA TABELA.
		String sql = "UPDATE promocoes SET LocalViagem = ?, ValorViagem = ?" + " WHERE IdPromocao = ?"; 
		try {
			conn = Conexao.createConnectionToMySQL();  // CRIA A CONEXÃO
			pstm = conn.prepareStatement(sql); // PASSA O COMANDO SQL PARA O OBJETO PSTM
			
			// ADICIONA O VALOR AO PARÂMETRO DA SQL
			pstm.setString(1, _promocoes.getLocalViagem());
			// ADICIONA O VALOR AO PARÂMETRO DA SQL
			pstm.setDouble(2, _promocoes.getValorViagem());
			
	// ESTAMOS SETANDO O ID (NÃO PARA A TABELA), MAS PARA USAR COMO CONDIÇÃO DE ATUALIZAÇÃO (WHERE IdPromocao = ?)
	// SE NÃO HOUVER ESTE COMANDO "pstm.setInt(3, _promocoes.getIdPromocao());" O CÓDIGO IRÁ ATUALIZAR TODOS OS CONTATOS.
			pstm.setInt(3, _promocoes.getIdPromocao());	
			
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
	
	public List<Promocoes> getPromocoes(){
	
//COMO ESTAMOS DANDO UM SELECT NO BANCO IRÁ VIR +1 INFORMAÇÃO - LISTA DE PROMOCOES.
	String sql = "SELECT * FROM promocoes";
	
//COMO IRÁ VIR UMA LISTA DE PROMOCOES, IREMOS CRIAR UMA LISTA DA CLASSE PROMOCOES QUE CHAMAREMOS DE "promocoes",
//ESTA VARIÁVEL "promocoes" IRÁ RECEBER UMA COLEÇÃO DO OBJETO PROMOCOES E ARMAZENARÁ INTERNAMENTE.
	List<Promocoes> promocoes = new ArrayList<Promocoes>();
	
//CLASSE QUE VAI RECUPERAR OS DADOS DO BANCO DE DADOS - "ResultSet" É UM OBJETO DO TIPO PLANILHA (MATRIZ VIRTUAL) PARA ORGANIZAR OS DADOS QUE VEEM DO BANCO DE DADOS
//O "ResultSet" IRÁ RECEBER ESTA COLEÇÃO DA VARIÁVEL "promocoes".	
	ResultSet rset = null;

	try {
		conn = Conexao.createConnectionToMySQL();  // CRIA A CONEXÃO
		pstm = conn.prepareStatement(sql); // PASSA O COMANDO SQL PARA O OBJETO PSTM
		
//EXECUÇÃO DO COMANDO E DEVOLVE O RESULTADO DENTRO DO "rset". TODOS OS DADOS QUE ESTÃO NA TABELA PROMOCOES FICARÃO DENTRO DESTE OBJETO "rset".
//SE ELE ESTA DENTRO DESTE OBJETO, ENTÃO DEVEMOS VARRER ESTE OBJETO (RODAR CADA POSIÇÃO DESTE OBJETO)		
		rset = pstm.executeQuery(); 
		
  //COMO ELE É UMA PLANILHA IREMOS RODAR DESTA FORMA - ENQUANTO EXISTIR DADOS NO BANCO DE DADOS, FAÇA:
		while (rset.next()) { //LAÇO DE REPETIÇÃO PQ IREMOS PERCORRER VÁRIAS VEZES O OBJETO "rset", IREMOS BUSCAR TODOS OS SEUS DADOS QUE NO CASO ELE IRÁ RODAR 3 VEZES.
			Promocoes _promocoes = new Promocoes();
			
			//RECUPERA O IdPromocao DO BANCO E ATRIBUI ELE AO OBJETO
			_promocoes.setIdPromocao(rset.getInt("IdPromocao"));
			
			//RECUPERA O LocalViagem DO BANCO E ATRIBUI ELE AO OBJETO
			_promocoes.setLocalViagem(rset.getString("LocalViagem"));;
			
			//RECUPERA O ValorViagem DO BANCO E ATRIBUI ELE AO OBJETO
			_promocoes.setValorViagem(rset.getDouble("ValorViagem"));
			
			//ADICIONO OS PROMOCOES RECUPERADOS, À LISTA DE PROMOCOES
			promocoes.add(_promocoes); //CADA VEZ QUE ELE RODAR IRÁ CRIAR UM NOVO OBJETO (_promocoes) 
			//E GUARDAR OS DADOS DESTE OBJETO (IdPromocao, LocalViagem, ValorViagem) EM "_promocoes" 
			//QUE ADICIONARÁ LÁ EM BAIXO (promocoes.add(_promocoes)) DENTRO DA LISTA "promocoes", ESTE MÉTODO DEVOLVE A LISTA COMPLETA.	
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
	   return promocoes;
	}

	public Promocoes getPromocoesById(int _IdPromocao) {

        String sql = "SELECT * FROM promocoes where id = ?";
        
        // Classe que vai recuperar os dados do banco de dados
        Promocoes idPromocao = new Promocoes();
        ResultSet rset = null;

        try {
            conn = Conexao.createConnectionToMySQL();
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, _IdPromocao);
            rset = pstm.executeQuery();
  
         // Enquanto existir dados no banco de dados, faça
         	while (rset.next()) {
         		idPromocao.setIdPromocao(rset.getInt("IdPromocao"));
         		idPromocao.setLocalViagem(rset.getString("LocalViagem"));
         		idPromocao.setValorViagem(rset.getDouble("ValorViagem"));     
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
        return idPromocao;
    }

}
