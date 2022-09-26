package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import connection.Conexao;
import modelo.Passageiros;

public class PassageirosDAO {

	Connection conn = null;
	PreparedStatement pstm = null;
	
	public void save(Passageiros _passageiros) {
		
 // ISSO É UMA SQL COMUM, OS "?" - SÃO OS PARÂMETROS QUE NÓS VAMOS ADICIONAR NA BASE DE DADOS
		String sql = "INSERT INTO passageiros(Nome, Rg, Cpf, DataNascimento, Endereco, Complemento, Cep, Estado, Email, Telefone)" + " VALUES(?,?,?,?,?,?,?,?,?,?)";

		// TRY - TENTE EXECUTAR ESTES COMANDOS, MAS SE FALHAR CAIA NA EXCEÇÃO GENÉRICA (CATCH) 
		
		try {
			// CRIAR UMA CONEXÃO COM O BANCO
			conn = Conexao.createConnectionToMySQL();

			// CRIAR UM PREPAREDSTATMENT, CLASSE USADA PARA EXECUTAR A QUERY
			pstm = conn.prepareStatement(sql);  

			// ADICIONAR O VALOR DO 1° PARÂMETRO DA SQL
				pstm.setString(1, _passageiros.getNome());
		
			// ADICIONAR O VALOR DO 2° PARÂMETRO DA SQL
				pstm.setString(2, _passageiros.getRg()); 
				
			// ADICIONAR O VALOR DO 3° PARÂMETRO DA SQL
				pstm.setString(3, _passageiros.getCpf()); 
				
			// ADICIONAR O VALOR DO 4° PARÂMETRO DA SQL
				pstm.setString(4, _passageiros.getDataNascimento());
				
			// ADICIONAR O VALOR DO 5° PARÂMETRO DA SQL
				pstm.setString(5, _passageiros.getEndereco());  
							
			// ADICIONAR O VALOR DO 6° PARÂMETRO DA SQL
				pstm.setString(6, _passageiros.getComplemento());
																
			// ADICIONAR O VALOR DO 7° PARÂMETRO DA SQL
				pstm.setString(7, _passageiros.getCep()); 
					
			// ADICIONAR O VALOR DO 8° PARÂMETRO DA SQL
				pstm.setString(8, _passageiros.getEstado()); 
				
			// ADICIONAR O VALOR DO 9° PARÂMETRO DA SQL
				pstm.setString(9, _passageiros.getEmail()); 
					
			// ADICIONAR O VALOR DO 10° PARÂMETRO DA SQL
				pstm.setString(10, _passageiros.getTelefone()); 
			
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

	public void removeById(int _IdPassageiro) {

		String sql = "DELETE FROM passageiros WHERE IdPassageiro = ?";

		try {
			conn = Conexao.createConnectionToMySQL(); // CRIA A CONEXÃO
			pstm = conn.prepareStatement(sql); // PASSA O COMANDO SQL PARA O OBJETO PSTM
			
			// SETA O ID NO COMANDO SQL
			pstm.setInt(1, _IdPassageiro); 
			
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

	public void update (Passageiros _passageiros) {
		
	// UPDATE RECEBE POR PARÂMETRO UM OBJETO "_passageiros". ATENÇÃO, passageiros (TABELA DO BANCO) NA STRING sql é != _passageiros,
	// SET LOCALVIAGEM (TABELA DO BD) O "?" INDICA QUE VAMOS SETAR - MUDAR/CONFIGURAR UM NOVO VALOR (ATRIBUTO), 
    // ESTE VALOR VIRÁ DO OBJETO, IREMOS ALTEREAR PELO ID DO ATRIBUTO DA TABELA.
		String sql = "UPDATE passageiros SET Nome = ?, Rg = ?, Cpf = ?, DataNascimento = ?, Endereco = ?, Complemento = ?, Cep = ?, Estado = ?, Email = ?, Telefone = ?" + " WHERE IdPassageiro = ?"; 
		try {
			conn = Conexao.createConnectionToMySQL();  // CRIA A CONEXÃO
			pstm = conn.prepareStatement(sql); // PASSA O COMANDO SQL PARA O OBJETO PSTM
			
			// ADICIONA O VALOR AO PARÂMETRO DA SQL
			pstm.setString(1, _passageiros.getNome());
			// ADICIONA O VALOR AO PARÂMETRO DA SQL
			pstm.setString(2, _passageiros.getRg()); 			
			// ADICIONA O VALOR AO PARÂMETRO DA SQL
			pstm.setString(3, _passageiros.getCpf()); 			
			// ADICIONA O VALOR AO PARÂMETRO DA SQL
			pstm.setString(4, _passageiros.getDataNascimento());			
			// ADICIONA O VALOR AO PARÂMETRO DA SQL
			pstm.setString(5, _passageiros.getEndereco());  
			// ADICIONA O VALOR AO PARÂMETRO DA SQL
			pstm.setString(6, _passageiros.getComplemento());															
			// ADICIONA O VALOR AO PARÂMETRO DA SQL
			pstm.setString(7, _passageiros.getCep()); 				
			// ADICIONA O VALOR AO PARÂMETRO DA SQL
			pstm.setString(8, _passageiros.getEstado()); 			
			// ADICIONA O VALOR AO PARÂMETRO DA SQL
			pstm.setString(9, _passageiros.getEmail()); 	
			// ADICIONA O VALOR AO PARÂMETRO DA SQL
			pstm.setString(10, _passageiros.getTelefone());
			
	// ESTAMOS SETANDO O ID (NÃO PARA A TABELA), MAS PARA USAR COMO CONDIÇÃO DE ATUALIZAÇÃO (WHERE IdPassageiro = ?)
	// SE NÃO HOUVER ESTE COMANDO "pstm.setInt(3, _passageiros.getIdPassageiro());" O CÓDIGO IRÁ ATUALIZAR TODOS OS CONTATOS.
			pstm.setInt(11, _passageiros.getIdPassageiro());	
			
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
	
	public List<Passageiros> getPassageiros(){
	
//COMO ESTAMOS DANDO UM SELECT NO BANCO IRÁ VIR +1 INFORMAÇÃO - LISTA DE PASSAGEIROS.
	String sql = "SELECT * FROM passageiros";
	
//COMO IRÁ VIR UMA LISTA DE PASSAGEIROS, IREMOS CRIAR UMA LISTA DA CLASSE PASSAGEIROS QUE CHAMAREMOS DE "passageiros",
//ESTA VARIÁVEL "passageiros" IRÁ RECEBER UMA COLEÇÃO DO OBJETO PASSAGEIROS E ARMAZENARÁ INTERNAMENTE.
	List<Passageiros> passageiros = new ArrayList<Passageiros>();
	
//CLASSE QUE VAI RECUPERAR OS DADOS DO BANCO DE DADOS - "ResultSet" É UM OBJETO DO TIPO PLANILHA (MATRIZ VIRTUAL) PARA ORGANIZAR OS DADOS QUE VEEM DO BANCO DE DADOS
//O "ResultSet" IRÁ RECEBER ESTA COLEÇÃO DA VARIÁVEL "passageiros".	
	ResultSet rset = null;

	try {
		conn = Conexao.createConnectionToMySQL();  // CRIA A CONEXÃO
		pstm = conn.prepareStatement(sql); // PASSA O COMANDO SQL PARA O OBJETO PSTM
		
//EXECUÇÃO DO COMANDO E DEVOLVE O RESULTADO DENTRO DO "rset". TODOS OS DADOS QUE ESTÃO NA TABELA PASSAGEIROS FICARÃO DENTRO DESTE OBJETO "rset".
//SE ELE ESTA DENTRO DESTE OBJETO, ENTÃO DEVEMOS VARRER ESTE OBJETO (RODAR CADA POSIÇÃO DESTE OBJETO)		
		rset = pstm.executeQuery(); 
		
  //COMO ELE É UMA PLANILHA IREMOS RODAR DESTA FORMA - ENQUANTO EXISTIR DADOS NO BANCO DE DADOS, FAÇA:
		while (rset.next()) { //LAÇO DE REPETIÇÃO PQ IREMOS PERCORRER VÁRIAS VEZES O OBJETO "rset", IREMOS BUSCAR TODOS OS SEUS DADOS QUE NO CASO ELE IRÁ RODAR 3 VEZES.
			Passageiros _passageiros = new Passageiros();
			
			//RECUPERA O IdPassageiro DO BANCO E ATRIBUI ELE AO OBJETO
			_passageiros.setIdPassageiro(rset.getInt("IdPassageiro"));

			//RECUPERA O Nome DO BANCO E ATRIBUI ELE AO OBJETO
			_passageiros.setNome(rset.getString("Nome"));;
			
			//RECUPERA O Rg DO BANCO E ATRIBUI ELE AO OBJETO
			_passageiros.setRg(rset.getString("Rg"));
			
			//RECUPERA O Cpf DO BANCO E ATRIBUI ELE AO OBJETO
			_passageiros.setCpf(rset.getString("Cpf"));
			
			//RECUPERA O DataNascimento DO BANCO E ATRIBUI ELE AO OBJETO
			_passageiros.setDataNascimento(rset.getString("DataNascimento"));
			
			//RECUPERA O Endereco DO BANCO E ATRIBUI ELE AO OBJETO
			_passageiros.setEndereco(rset.getString("Endereco"));
			
			//RECUPERA O Complemento DO BANCO E ATRIBUI ELE AO OBJETO
			_passageiros.setComplemento(rset.getString("Complemento"));
			
			//RECUPERA O Cep DO BANCO E ATRIBUI ELE AO OBJETO
			_passageiros.setCep(rset.getString("Cep"));
			
			//RECUPERA O Estado DO BANCO E ATRIBUI ELE AO OBJETO
			_passageiros.setEstado(rset.getString("Estado"));
			
			//RECUPERA O Email DO BANCO E ATRIBUI ELE AO OBJETO
			_passageiros.setEmail(rset.getString("Email"));
			
			//RECUPERA O Telefone DO BANCO E ATRIBUI ELE AO OBJETO
			_passageiros.setTelefone(rset.getString("Telefone"));
			
			//ADICIONO OS PASSAGEIROS RECUPERADOS, À LISTA DE PASSAGEIROS
			passageiros.add(_passageiros); //CADA VEZ QUE ELE RODAR IRÁ CRIAR UM NOVO OBJETO (_passageiros) 
			//E GUARDAR OS DADOS DESTE OBJETO (IdPassageiro, Nome, Rg, Cpf, DataNascimento, Endereco, Complemento, Cep, Estado, Email, Telefone) EM "_passageiros" 
			//QUE ADICIONARÁ LÁ EM BAIXO (passageiros.add(_passageiros)) DENTRO DA LISTA "passageiros", ESTE MÉTODO DEVOLVE A LISTA COMPLETA.	
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
	   return passageiros;
	}
	
	public Passageiros getPassageirosById(int _IdPassageiro) {

        String sql = "SELECT * FROM passageiro where id = ?";
        
        // Classe que vai recuperar os dados do banco de dados
        Passageiros idPassageiro = new Passageiros();
        ResultSet rset = null;

        try {
            conn = Conexao.createConnectionToMySQL();
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, _IdPassageiro);
            rset = pstm.executeQuery();

            
         // Enquanto existir dados no banco de dados, faça
            
         	while (rset.next()) {
         		      		
         		idPassageiro.setIdPassageiro(rset.getInt("IdPassageiro"));
         		idPassageiro.setNome(rset.getString("Nome"));
         		idPassageiro.setRg(rset.getString("Rg"));
         		idPassageiro.setCpf(rset.getString("Cpf"));
         		idPassageiro.setDataNascimento(rset.getString("DataNascimento"));
         		idPassageiro.setEndereco(rset.getString("Endereco"));
         		idPassageiro.setComplemento(rset.getString("Complemento"));
         		idPassageiro.setCep(rset.getString("Cep"));
         		idPassageiro.setEstado(rset.getString("Estado"));
         		idPassageiro.setEmail(rset.getString("Email"));
         		idPassageiro.setTelefone(rset.getString("Telefone"));
         		 
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
        return idPassageiro;
    }


}