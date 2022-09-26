package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import connection.Conexao;
import modelo.Hoteis;

public class HoteisDAO {

	Connection conn = null;
	PreparedStatement pstm = null;
	
	public void save(Hoteis _hoteis) {
		
 // ISSO É UMA SQL COMUM, OS "?" - SÃO OS PARÂMETROS QUE NÓS VAMOS ADICIONAR NA BASE DE DADOS
		String sql = "INSERT INTO hoteis(LocalHotel, ValorHospedagem)" + " VALUES(?,?)";

		// TRY - TENTE EXECUTAR ESTES COMANDOS, MAS SE FALHAR CAIA NA EXCEÇÃO GENÉRICA (CATCH) 
		
		try {
			// CRIAR UMA CONEXÃO COM O BANCO
			conn = Conexao.createConnectionToMySQL();

			// CRIAR UM PREPAREDSTATMENT, CLASSE USADA PARA EXECUTAR A QUERY
			pstm = conn.prepareStatement(sql);  

			// ADICIONAR O VALOR DO 1° PARÂMETRO DA SQL
			pstm.setString(1, _hoteis.getLocalHotel());  

			// ADICIONAR O VALOR DO 2° PARÂMETRO DA SQL
			pstm.setString(2, _hoteis.getValorHospedagem());

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

	public void removeById(int _IdHotel) {

		String sql = "DELETE FROM hoteis WHERE IdHotel = ?";

		try {
			conn = Conexao.createConnectionToMySQL(); // CRIA A CONEXÃO
			pstm = conn.prepareStatement(sql); // PASSA O COMANDO SQL PARA O OBJETO PSTM
			
			// SETA O ID NO COMANDO SQL
			pstm.setInt(1, _IdHotel); 
			
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

	public void update (Hoteis _hoteis) {
		
	// UPDATE RECEBE POR PARÂMETRO UM OBJETO "_hoteis". ATENÇÃO, hoteis (TABELA DO BANCO) NA STRING sql é != _hoteis,
	// SET LOCALVIAGEM (TABELA DO BD) O "?" INDICA QUE VAMOS SETAR - MUDAR/CONFIGURAR UM NOVO VALOR (ATRIBUTO), 
    // ESTE VALOR VIRÁ DO OBJETO, IREMOS ALTEREAR PELO ID DO ATRIBUTO DA TABELA.
		String sql = "UPDATE hoteis SET LocalHotel = ?, ValorHospedagem = ?" + " WHERE IdHotel = ?"; 
		try {
			conn = Conexao.createConnectionToMySQL();  // CRIA A CONEXÃO
			pstm = conn.prepareStatement(sql); // PASSA O COMANDO SQL PARA O OBJETO PSTM
			
			// ADICIONA O VALOR AO PARÂMETRO DA SQL
			pstm.setString(1, _hoteis.getLocalHotel());
			// ADICIONA O VALOR AO PARÂMETRO DA SQL
			pstm.setString(2, _hoteis.getValorHospedagem());
			
			
	// ESTAMOS SETANDO O ID (NÃO PARA A TABELA), MAS PARA USAR COMO CONDIÇÃO DE ATUALIZAÇÃO (WHERE IdHotel = ?)
	// SE NÃO HOUVER ESTE COMANDO "pstm.setInt(3, _hoteis.getIdHotel());" O CÓDIGO IRÁ ATUALIZAR TODOS OS CONTATOS.
			pstm.setInt(3, _hoteis.getIdHotel());	
			
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
	
	public List<Hoteis> getHoteis(){
	
//COMO ESTAMOS DANDO UM SELECT NO BANCO IRÁ VIR +1 INFORMAÇÃO - LISTA DE HOTEIS.
	String sql = "SELECT * FROM hoteis";
	
//COMO IRÁ VIR UMA LISTA DE HOTEIS, IREMOS CRIAR UMA LISTA DA CLASSE HOTEIS QUE CHAMAREMOS DE "hoteis",
//ESTA VARIÁVEL "hoteis" IRÁ RECEBER UMA COLEÇÃO DO OBJETO HOTEIS E ARMAZENARÁ INTERNAMENTE.
	List<Hoteis> hoteis = new ArrayList<Hoteis>();
	
//CLASSE QUE VAI RECUPERAR OS DADOS DO BANCO DE DADOS - "ResultSet" É UM OBJETO DO TIPO PLANILHA (MATRIZ VIRTUAL) PARA ORGANIZAR OS DADOS QUE VEEM DO BANCO DE DADOS
//O "ResultSet" IRÁ RECEBER ESTA COLEÇÃO DA VARIÁVEL "hoteis".	
	ResultSet rset = null;

	try {
		conn = Conexao.createConnectionToMySQL();  // CRIA A CONEXÃO
		pstm = conn.prepareStatement(sql); // PASSA O COMANDO SQL PARA O OBJETO PSTM
		
//EXECUÇÃO DO COMANDO E DEVOLVE O RESULTADO DENTRO DO "rset". TODOS OS DADOS QUE ESTÃO NA TABELA HOTEIS FICARÃO DENTRO DESTE OBJETO "rset".
//SE ELE ESTA DENTRO DESTE OBJETO, ENTÃO DEVEMOS VARRER ESTE OBJETO (RODAR CADA POSIÇÃO DESTE OBJETO)		
		rset = pstm.executeQuery(); 
		
  //COMO ELE É UMA PLANILHA IREMOS RODAR DESTA FORMA - ENQUANTO EXISTIR DADOS NO BANCO DE DADOS, FAÇA:
		while (rset.next()) { //LAÇO DE REPETIÇÃO PQ IREMOS PERCORRER VÁRIAS VEZES O OBJETO "rset", IREMOS BUSCAR TODOS OS SEUS DADOS QUE NO CASO ELE IRÁ RODAR 3 VEZES.
			Hoteis _hoteis = new Hoteis();
			
			//RECUPERA O IdHotel DO BANCO E ATRIBUI ELE AO OBJETO
			_hoteis.setIdHotel(rset.getInt("IdHotel"));
			
			//RECUPERA O LocalHotel DO BANCO E ATRIBUI ELE AO OBJETO
			_hoteis.setLocalHotel(rset.getString("LocalHotel"));;
			
			//RECUPERA O ValorHospedagem DO BANCO E ATRIBUI ELE AO OBJETO
			_hoteis.setValorHospedagem(rset.getString("ValorHospedagem"));
			
			//ADICIONO OS HOTEIS RECUPERADOS, À LISTA DE HOTEIS
			hoteis.add(_hoteis); //CADA VEZ QUE ELE RODAR IRÁ CRIAR UM NOVO OBJETO (_hoteis) 
			//E GUARDAR OS DADOS DESTE OBJETO (IdHotel, LocalHotel, ValorHospedagem) EM "_hoteis" 
			//QUE ADICIONARÁ LÁ EM BAIXO (hoteis.add(_hoteis)) DENTRO DA LISTA "hoteis", ESTE MÉTODO DEVOLVE A LISTA COMPLETA.	
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
	   return hoteis;
	}

	public Hoteis getHoteisById(int _IdHotel) {

        String sql = "SELECT * FROM hoteis where id = ?";
        
        // Classe que vai recuperar os dados do banco de dados
        Hoteis idHotel = new Hoteis();
        ResultSet rset = null;

        try {
            conn = Conexao.createConnectionToMySQL();
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, _IdHotel);
            rset = pstm.executeQuery();

            
         // Enquanto existir dados no banco de dados, faça
         	while (rset.next()) {
         		idHotel.setIdHotel(rset.getInt("IdHotel"));
         		idHotel.setLocalHotel(rset.getString("LocalHotel"));
         		idHotel.setValorHospedagem(rset.getString("ValorHospedagem"));
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
        return idHotel;
    }

}