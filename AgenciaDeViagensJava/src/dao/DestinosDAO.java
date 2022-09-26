package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import connection.Conexao;
import modelo.Destinos;

public class DestinosDAO {

	Connection conn = null;
	PreparedStatement pstm = null;
	
	public void save(Destinos _destinos) {
		
 // ISSO É UMA SQL COMUM, OS "?" - SÃO OS PARÂMETROS QUE NÓS VAMOS ADICIONAR NA BASE DE DADOS
		String sql = "INSERT INTO destinos(LocalViagem, ValorViagem)" + " VALUES(?,?)";

		// TRY - TENTE EXECUTAR ESTES COMANDOS, MAS SE FALHAR CAIA NA EXCEÇÃO GENÉRICA (CATCH) 
		
		try {
			// CRIAR UMA CONEXÃO COM O BANCO
			conn = Conexao.createConnectionToMySQL();

			// CRIAR UM PREPAREDSTATMENT, CLASSE USADA PARA EXECUTAR A QUERY
			pstm = conn.prepareStatement(sql);  

			// ADICIONAR O VALOR DO 1° PARÂMETRO DA SQL
			pstm.setString(1, _destinos.getLocalViagem());  

			// ADICIONAR O VALOR DO 2° PARÂMETRO DA SQL
			pstm.setDouble(2, _destinos.getValorViagem());

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

	public void removeById(int _IdDestino) {

		String sql = "DELETE FROM destinos WHERE IdDestino = ?";

		try {
			conn = Conexao.createConnectionToMySQL(); // CRIA A CONEXÃO
			pstm = conn.prepareStatement(sql); // PASSA O COMANDO SQL PARA O OBJETO PSTM
			
			// SETA O ID NO COMANDO SQL
			pstm.setInt(1, _IdDestino); 
			
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

	public void update (Destinos _destinos) {
		
	// UPDATE RECEBE POR PARÂMETRO UM OBJETO "_destinos". ATENÇÃO, destinos (TABELA DO BANCO) NA STRING sql é != _destinos,
	// SET LOCALVIAGEM (TABELA DO BD) O "?" INDICA QUE VAMOS SETAR - MUDAR/CONFIGURAR UM NOVO VALOR (ATRIBUTO), 
    // ESTE VALOR VIRÁ DO OBJETO, IREMOS ALTEREAR PELO ID DO ATRIBUTO DA TABELA.
		String sql = "UPDATE destinos SET LocalViagem = ?, ValorViagem = ?" + " WHERE IdDestino = ?"; 
		try {
			conn = Conexao.createConnectionToMySQL();  // CRIA A CONEXÃO
			pstm = conn.prepareStatement(sql); // PASSA O COMANDO SQL PARA O OBJETO PSTM
			
			// ADICIONA O VALOR AO PARÂMETRO DA SQL
			pstm.setString(1, _destinos.getLocalViagem());
			// ADICIONA O VALOR AO PARÂMETRO DA SQL
			pstm.setDouble(2, _destinos.getValorViagem());
			
			
	// ESTAMOS SETANDO O ID (NÃO PARA A TABELA), MAS PARA USAR COMO CONDIÇÃO DE ATUALIZAÇÃO (WHERE IdDestino = ?)
	// SE NÃO HOUVER ESTE COMANDO "pstm.setInt(3, _destinos.getIdDestino());" O CÓDIGO IRÁ ATUALIZAR TODOS OS CONTATOS.
			pstm.setInt(3, _destinos.getIdDestino());	
			
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
	
	public List<Destinos> getDestinos(){
	
//COMO ESTAMOS DANDO UM SELECT NO BANCO IRÁ VIR +1 INFORMAÇÃO - LISTA DE DESTINOS.
	String sql = "SELECT * FROM destinos";
	
//COMO IRÁ VIR UMA LISTA DE DESTINOS, IREMOS CRIAR UMA LISTA DA CLASSE DESTINOS QUE CHAMAREMOS DE "destinos",
//ESTA VARIÁVEL "destinos" IRÁ RECEBER UMA COLEÇÃO DO OBJETO DESTINOS E ARMAZENARÁ INTERNAMENTE.
	List<Destinos> destinos = new ArrayList<Destinos>();
	
//CLASSE QUE VAI RECUPERAR OS DADOS DO BANCO DE DADOS - "ResultSet" É UM OBJETO DO TIPO PLANILHA (MATRIZ VIRTUAL) PARA ORGANIZAR OS DADOS QUE VEEM DO BANCO DE DADOS
//O "ResultSet" IRÁ RECEBER ESTA COLEÇÃO DA VARIÁVEL "destinos".	
	ResultSet rset = null;

	try {
		conn = Conexao.createConnectionToMySQL();  // CRIA A CONEXÃO
		pstm = conn.prepareStatement(sql); // PASSA O COMANDO SQL PARA O OBJETO PSTM
		
//EXECUÇÃO DO COMANDO E DEVOLVE O RESULTADO DENTRO DO "rset". TODOS OS DADOS QUE ESTÃO NA TABELA DESTINOS FICARÃO DENTRO DESTE OBJETO "rset".
//SE ELE ESTA DENTRO DESTE OBJETO, ENTÃO DEVEMOS VARRER ESTE OBJETO (RODAR CADA POSIÇÃO DESTE OBJETO)		
		rset = pstm.executeQuery(); 
		
  //COMO ELE É UMA PLANILHA IREMOS RODAR DESTA FORMA - ENQUANTO EXISTIR DADOS NO BANCO DE DADOS, FAÇA:
		while (rset.next()) { //LAÇO DE REPETIÇÃO PQ IREMOS PERCORRER VÁRIAS VEZES O OBJETO "rset", IREMOS BUSCAR TODOS OS SEUS DADOS QUE NO CASO ELE IRÁ RODAR 3 VEZES.
			Destinos _destinos = new Destinos();
			
			//RECUPERA O IdDestino DO BANCO E ATRIBUI ELE AO OBJETO
			_destinos.setIdDestino(rset.getInt("IdDestino"));
			
			//RECUPERA O LocalViagem DO BANCO E ATRIBUI ELE AO OBJETO
			_destinos.setLocalViagem(rset.getString("LocalViagem"));;
			
			//RECUPERA O ValorViagem DO BANCO E ATRIBUI ELE AO OBJETO
			_destinos.setValorViagem(rset.getDouble("ValorViagem"));
			
			//ADICIONO OS DESTINOS RECUPERADOS, À LISTA DE DESTINOS
			destinos.add(_destinos); //CADA VEZ QUE ELE RODAR IRÁ CRIAR UM NOVO OBJETO (_destinos) 
			//E GUARDAR OS DADOS DESTE OBJETO (IdDestino, LocalViagem, ValorViagem) EM "_destinos" 
			//QUE ADICIONARÁ LÁ EM BAIXO (destinos.add(_destinos)) DENTRO DA LISTA "destinos", ESTE MÉTODO DEVOLVE A LISTA COMPLETA.	
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
	   return destinos;
	}

	public Destinos getDestinosById(int _IdDestino) {

        String sql = "SELECT * FROM destinos where id = ?";
        
        // Classe que vai recuperar os dados do banco de dados
        Destinos idDestino = new Destinos();
        ResultSet rset = null;

        try {
            conn = Conexao.createConnectionToMySQL();
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, _IdDestino);
            rset = pstm.executeQuery();

            
         // Enquanto existir dados no banco de dados, faça
         	while (rset.next()) {
            idDestino.setIdDestino(rset.getInt("IdDestino"));
            idDestino.setLocalViagem(rset.getString("LocalViagem"));
            idDestino.setValorViagem(rset.getDouble("ValorViagem"));
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
        return idDestino;
    }
}