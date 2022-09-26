package crud;

import java.util.Date;
import java.util.Scanner;
import dao.PassageirosDAO;
import modelo.Passageiros;

public class PassageirosCrud {

	public static void main(String[] args) {

		// CONEXÃO COM O BANCO DE DADOS - PASSAGEIROS
		PassageirosDAO passageiroDAO = new PassageirosDAO();
//		Passageiros passageiro = new Passageiros();	

		// CAPTURA OS DADOS DIGITADOS PELO USUÁRIO
		Scanner s = new Scanner(System.in);
		String nome = "";
		int posicao = 0;
		int opcao = 0;
		 int IdPassageiro = 0;
		 String Nome = "";
		 String Rg = "";
		 String Cpf = "";
		 String DataNascimento = "";
		 String Endereco = "";
		 String Complemento = "";
		 String Cep = "";
		 String Estado = "";
		 String Email = "";
		 String Telefone = "";
		
		do {

			System.out.println("=== CRUD PASSAGEIROS ===");
			System.out.println("1 - CADASTRAR PASSAGEIROS");
			System.out.println("2 - CONSULTAR PASSAGEIROS");
			System.out.println("3 - ATUALIZAR PASSAGEIROS");
			System.out.println("4 - DELETAR PASSAGEIROS");
			System.out.println("5 - BUSCAR POR ID ");
			System.out.println("0 - Sair");
			opcao = s.nextInt();
			s.nextLine();

			switch (opcao) {
			case 1:
				// CREATE
				System.out.println("DIGITE O ID DO PASSAGEIRO: ");
				IdPassageiro = s.nextInt();
				s.nextLine();
				System.out.println("DIGITE O NOME DO PASSAGEIRO");
				Nome = s.nextLine();
				System.out.println("DIGITE O RG DO PASSAGEIRO");
				Rg = s.next();
				System.out.println("DIGITE O CPF DO PASSAGEIRO");
				Cpf = s.next();
				System.out.println("DATA DE NASCIMENTO DO PASSAGEIRO");
				DataNascimento = s.next();
				System.out.println("DIGITE O ENDEREÇO DO PASSAGEIRO");
				Endereco = s.next();
				System.out.println("DIGITE O COMPLEMENTO DO PASSAGEIRO");
				Complemento = s.next();
				System.out.println("DIGITE O CEP DO PASSAGEIRO");
				Cep = s.next();
				System.out.println("DIGITE O ESTADO DO PASSAGEIRO");
				Estado = s.next();
				System.out.println("DIGITE O EMAIL DO PASSAGEIRO");
				Email = s.next();
				System.out.println("DIGITE O TELEFONE DO PASSAGEIRO");
				Telefone = s.next();

				Passageiros ps1 = new Passageiros(IdPassageiro, Nome, Rg, Cpf, DataNascimento, Endereco, Complemento, Cep, Estado, Email, Telefone);

				passageiroDAO.save(ps1);

				System.out.println("\n***  Cadastrou  ***\n");

				break;
			case 2:
				// READ
				for (Passageiros ps : passageiroDAO.getPassageiros()) {
					System.out.println("ID: " + ps.getIdPassageiro() + " NOME: " + ps.getNome() + " RG: " + ps.getRg()
							+ " CPF: " + ps.getCpf() + " DATA DE NASCIMENTO: " + ps.getDataNascimento() + " ENDEREÇO: "
							+ ps.getEndereco() + " COMPLEMENTO: " + ps.getComplemento() + " CEP: " + ps.getCep()
							+ " ESTADO: " + ps.getEstado() + " EMAIL: " + ps.getEmail() + " TELEFONE: "
							+ ps.getTelefone());
				}

				System.out.println("CONSULTOU");
				break;
			case 3:
				// UPDATE
				System.out.println("DIGITE O ID DO PASSAGEIRO: ");
				IdPassageiro = s.nextInt();
				s.nextLine();
				System.out.println("DIGITE O NOME DO PASSAGEIRO");
				Nome = s.nextLine();
				System.out.println("DIGITE O RG DO PASSAGEIRO");
				Rg = s.next();
				System.out.println("DIGITE O CPF DO PASSAGEIRO");
				Cpf = s.next();
				System.out.println("DATA DE NASCIMENTO DO PASSAGEIRO");
				DataNascimento = s.next();
				System.out.println("DIGITE O ENDEREÇO DO PASSAGEIRO");
				Endereco = s.next();
				System.out.println("DIGITE O COMPLEMENTO DO PASSAGEIRO");
				Complemento = s.next();
				System.out.println("DIGITE O CEP DO PASSAGEIRO");
				Cep = s.next();
				System.out.println("DIGITE O ESTADO DO PASSAGEIRO");
				Estado = s.next();
				System.out.println("DIGITE O EMAIL DO PASSAGEIRO");
				Email = s.next();
				System.out.println("DIGITE O TELEFONE DO PASSAGEIRO");
				Telefone = s.next();

				Passageiros ps2 = new Passageiros(IdPassageiro, Nome, Rg, Cpf, DataNascimento, Endereco, Complemento, Cep, Estado, Email, Telefone);

				passageiroDAO.update(ps2);

				System.out.println("atualizou");
				break;
			case 4:
				// DELETE
				System.out.println("DIGITE O ID DO PASSAGEIRO: ");
				IdPassageiro = s.nextInt();

				passageiroDAO.removeById(posicao);

				break;

			case 5:
				// BUSCAR POR ID
				System.out.println("DIGITE O ID DO PASSAGEIRO: ");
				IdPassageiro = s.nextInt();

				Passageiros ps3 = passageiroDAO.getPassageirosById(posicao);

				System.out.println("ID: " + ps3.getIdPassageiro() + " NOME: " + ps3.getNome() + " RG: " + ps3.getRg()
						+ " CPF: " + ps3.getCpf() + " DATA DE NASCIMENTO: " + ps3.getDataNascimento() + " ENDEREÇO: "
						+ ps3.getEndereco() + " COMPLEMENTO: " + ps3.getComplemento() + " CEP: " + ps3.getCep()
						+ " ESTADO: " + ps3.getEstado() + " EMAIL: " + ps3.getEmail() + " TELEFONE: " + ps3.getTelefone());
				break;
			default:
				System.out.println(opcao != 0 ? "op��o invalida, digite novamente." : "");
				break;
			}

		} while (opcao != 0);

		System.out.println("At� mais!");
		s.close();
	}

}
