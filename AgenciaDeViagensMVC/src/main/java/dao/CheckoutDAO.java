package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import connection.Conexao;
import modelo.Checkout;

public class CheckoutDAO {

	Connection conn = null;
	PreparedStatement pstm = null;
	
	public void save(Checkout _checkout) {
		
 // ISSO É UMA SQL COMUM, OS "?" - SÃO OS PARÂMETROS QUE NÓS VAMOS ADICIONAR NA BASE DE DADOS
		String sql = "INSERT INTO checkout(Nome, Sobrenome, Email, Endereco, Complemento, Pais, Estado, Cep, PrecoPassagem, FormasPagamento)" + " VALUES(?,?,?,?,?,?,?,?,?,?)";

		// TRY - TENTE EXECUTAR ESTES COMANDOS, MAS SE FALHAR CAIA NA EXCEÇÃO GENÉRICA (CATCH) 
		
		try {
			// CRIAR UMA CONEXÃO COM O BANCO
			conn = Conexao.createConnectionToMySQL();

			// CRIAR UM PREPAREDSTATMENT, CLASSE USADA PARA EXECUTAR A QUERY
			pstm = conn.prepareStatement(sql);  

			// ADICIONAR O VALOR DO 1° PARÂMETRO DA SQL
			pstm.setString(1, _checkout.getNome());
	
			// ADICIONAR O VALOR DO 2° PARÂMETRO DA SQL
			pstm.setString(2, _checkout.getSobrenome()); 
			
			// ADICIONAR O VALOR DO 3° PARÂMETRO DA SQL
			pstm.setString(3, _checkout.getEmail()); 
			
			// ADICIONAR O VALOR DO 4° PARÂMETRO DA SQL
			pstm.setString(4, _checkout.getEndereco()); 
			
			// ADICIONAR O VALOR DO 5° PARÂMETRO DA SQL
			pstm.setString(5, _checkout.getComplemento());  
						
			// ADICIONAR O VALOR DO 6° PARÂMETRO DA SQL
			pstm.setString(6, _checkout.getPais());
															
			// ADICIONAR O VALOR DO 7° PARÂMETRO DA SQL
			pstm.setString(7, _checkout.getEstado()); 
				
			// ADICIONAR O VALOR DO 8° PARÂMETRO DA SQL
			pstm.setString(8, _checkout.getCep()); 
			
			// ADICIONAR O VALOR DO 9° PARÂMETRO DA SQL
			pstm.setString(9, _checkout.getPrecoPassagem()); 
				
			// ADICIONAR O VALOR DO 10° PARÂMETRO DA SQL
			pstm.setString(10, _checkout.getFormasPagamento());

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

	public void removeById(int _IdCheckout) {

		String sql = "DELETE FROM checkout WHERE IdCheckout = ?";

		try {
			conn = Conexao.createConnectionToMySQL(); // CRIA A CONEXÃO
			pstm = conn.prepareStatement(sql); // PASSA O COMANDO SQL PARA O OBJETO PSTM
			
			// SETA O ID NO COMANDO SQL
			pstm.setInt(1, _IdCheckout); 
			
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

	public void update (Checkout _checkout) {
		
	// UPDATE RECEBE POR PARÂMETRO UM OBJETO "_checkout". ATENÇÃO, checkout (TABELA DO BANCO) NA STRING sql é != _checkout,
	// SET LOCALVIAGEM (TABELA DO BD) O "?" INDICA QUE VAMOS SETAR - MUDAR/CONFIGURAR UM NOVO VALOR (ATRIBUTO), 
    // ESTE VALOR VIRÁ DO OBJETO, IREMOS ALTEREAR PELO ID DO ATRIBUTO DA TABELA. 
		String sql = "UPDATE checkout SET Nome = ?, Sobrenome = ?, Email = ?, Endereco = ?, Complemento = ?, Pais = ?, Estado = ?, Cep = ?, PrecoPassagem = ?, FormasPagamento = ?" + " WHERE IdCheckout = ?";
		try {
			conn = Conexao.createConnectionToMySQL();  // CRIA A CONEXÃO
			pstm = conn.prepareStatement(sql); // PASSA O COMANDO SQL PARA O OBJETO PSTM
			
			// ADICIONA O VALOR AO PARÂMETRO DA SQL
			pstm.setString(1, _checkout.getNome());
				
			// ADICIONA O VALOR AO PARÂMETRO DA SQL
			pstm.setString(2, _checkout.getSobrenome()); 
						
			// ADICIONA O VALOR AO PARÂMETRO DA SQL
			pstm.setString(3, _checkout.getEmail()); 
						
			// ADICIONA O VALOR AO PARÂMETRO DA SQL
			pstm.setString(4, _checkout.getEndereco()); 
						
			// ADICIONA O VALOR AO PARÂMETRO DA SQL
			pstm.setString(5, _checkout.getComplemento());  
									
			// ADICIONA O VALOR AO PARÂMETRO DA SQL
			pstm.setString(6, _checkout.getPais());
																		
			// ADICIONA O VALOR AO PARÂMETRO DA SQL
			pstm.setString(7, _checkout.getEstado()); 
							
			// ADICIONA O VALOR AO PARÂMETRO DA SQL
			pstm.setString(8, _checkout.getCep()); 
						
			// ADICIONA O VALOR AO PARÂMETRO DA SQL
			pstm.setString(9, _checkout.getPrecoPassagem()); 
							
			// ADICIONA O VALOR AO PARÂMETRO DA SQL
			pstm.setString(10, _checkout.getFormasPagamento());
			
	// ESTAMOS SETANDO O ID (NÃO PARA A TABELA), MAS PARA USAR COMO CONDIÇÃO DE ATUALIZAÇÃO (WHERE IdCheckout = ?)
	// SE NÃO HOUVER ESTE COMANDO "pstm.setInt(3, _checkout.getIdCheckout());" O CÓDIGO IRÁ ATUALIZAR TODOS OS CONTATOS.
			pstm.setInt(11, _checkout.getIdCheckout());	
			
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
	
	public List<Checkout> getCheckouts(){
	
//COMO ESTAMOS DANDO UM SELECT NO BANCO IRÁ VIR +1 INFORMAÇÃO - LISTA DE CHECKOUT.
	String sql = "SELECT * FROM checkout";
	
//COMO IRÁ VIR UMA LISTA DE CHECKOUT, IREMOS CRIAR UMA LISTA DA CLASSE CHECKOUT QUE CHAMAREMOS DE "checkout",
//ESTA VARIÁVEL "checkout" IRÁ RECEBER UMA COLEÇÃO DO OBJETO CHECKOUT E ARMAZENARÁ INTERNAMENTE.
	List<Checkout> checkout = new ArrayList<Checkout>();
	
//CLASSE QUE VAI RECUPERAR OS DADOS DO BANCO DE DADOS - "ResultSet" É UM OBJETO DO TIPO PLANILHA (MATRIZ VIRTUAL) PARA ORGANIZAR OS DADOS QUE VEEM DO BANCO DE DADOS
//O "ResultSet" IRÁ RECEBER ESTA COLEÇÃO DA VARIÁVEL "checkout".	
	ResultSet rset = null;

	try {
		conn = Conexao.createConnectionToMySQL();  // CRIA A CONEXÃO
		pstm = conn.prepareStatement(sql); // PASSA O COMANDO SQL PARA O OBJETO PSTM
		
//EXECUÇÃO DO COMANDO E DEVOLVE O RESULTADO DENTRO DO "rset". TODOS OS DADOS QUE ESTÃO NA TABELA CHECKOUT FICARÃO DENTRO DESTE OBJETO "rset".
//SE ELE ESTA DENTRO DESTE OBJETO, ENTÃO DEVEMOS VARRER ESTE OBJETO (RODAR CADA POSIÇÃO DESTE OBJETO)		
		rset = pstm.executeQuery(); 
		
  //COMO ELE É UMA PLANILHA IREMOS RODAR DESTA FORMA - ENQUANTO EXISTIR DADOS NO BANCO DE DADOS, FAÇA:
		while (rset.next()) { //LAÇO DE REPETIÇÃO PQ IREMOS PERCORRER VÁRIAS VEZES O OBJETO "rset", IREMOS BUSCAR TODOS OS SEUS DADOS QUE NO CASO ELE IRÁ RODAR 3 VEZES.
			Checkout _checkout = new Checkout();
			
			
			//RECUPERA O IdCheckout DO BANCO E ATRIBUI ELE AO OBJETO
			_checkout.setIdCheckout(rset.getInt("IdCheckout"));
			
			//RECUPERA O Nome DO BANCO E ATRIBUI ELE AO OBJETO
			_checkout.setNome(rset.getString("Nome"));;
			
			//RECUPERA O Sobrenome DO BANCO E ATRIBUI ELE AO OBJETO
			_checkout.setSobrenome(rset.getString("Sobrenome"));
			
			//RECUPERA O Email DO BANCO E ATRIBUI ELE AO OBJETO
			_checkout.setEmail(rset.getString("Email"));
				
			//RECUPERA O Endereco DO BANCO E ATRIBUI ELE AO OBJETO
			_checkout.setEndereco(rset.getString("Endereco"));
			
			//RECUPERA O Complemento DO BANCO E ATRIBUI ELE AO OBJETO
			_checkout.setComplemento(rset.getString("Complemento"));
		
			//RECUPERA O Pais DO BANCO E ATRIBUI ELE AO OBJETO
			_checkout.setPais(rset.getString("Pais"));
				
			//RECUPERA O Estado DO BANCO E ATRIBUI ELE AO OBJETO
			_checkout.setEstado(rset.getString("Estado"));
			
			//RECUPERA O Cep DO BANCO E ATRIBUI ELE AO OBJETO
			_checkout.setCep(rset.getString("Cep"));

			//RECUPERA O PrecoPassagem DO BANCO E ATRIBUI ELE AO OBJETO
			_checkout.setPrecoPassagem(rset.getString("PrecoPassagem"));
			
			//RECUPERA O FormasPagamento DO BANCO E ATRIBUI ELE AO OBJETO
			_checkout.setFormasPagamento(rset.getString("FormasPagamento"));
			
			
			//ADICIONO OS CHECKOUT RECUPERADOS, À LISTA DE CHECKOUT
			checkout.add(_checkout); //CADA VEZ QUE ELE RODAR IRÁ CRIAR UM NOVO OBJETO (_checkout) 
			//E GUARDAR OS DADOS DESTE OBJETO (IdCheckout, Nome, Sobrenome, Email, Endereco, Complemento, Pais, Estado, Cep, PrecoPassagem, FormasPagamento) EM "_checkout" 
			//QUE ADICIONARÁ LÁ EM BAIXO (checkout.add(_checkout)) DENTRO DA LISTA "checkout", ESTE MÉTODO DEVOLVE A LISTA COMPLETA.	
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
	   return checkout;
	}
	
	public Checkout getCheckoutsById(int _IdCheckout) {

        String sql = "SELECT * FROM checkout where id = ?";
        
        // Classe que vai recuperar os dados do banco de dados
        Checkout idCheckout = new Checkout();
        ResultSet rset = null;

        try {
            conn = Conexao.createConnectionToMySQL();
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, _IdCheckout);
            rset = pstm.executeQuery();
            
         // Enquanto existir dados no banco de dados, faça
         	while (rset.next()) {
         			
         		idCheckout.setIdCheckout(rset.getInt("IdCheckout"));
         		idCheckout.setNome(rset.getString("Nome"));
         		idCheckout.setSobrenome(rset.getString("Sobrenome"));
         		idCheckout.setEmail(rset.getString("Email"));
         		idCheckout.setEndereco(rset.getString("Endereco"));
         		idCheckout.setComplemento(rset.getString("Complemento"));
         		idCheckout.setPais(rset.getString("Pais"));
         		idCheckout.setEstado(rset.getString("Estado"));
         		idCheckout.setCep(rset.getString("Cep"));
         		idCheckout.setPrecoPassagem(rset.getString("PrecoPassagem"));
         		idCheckout.setFormasPagamento(rset.getString("FormasPagamento"));
         			
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
        return idCheckout;
    }
	
}