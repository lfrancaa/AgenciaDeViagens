package crud;

import java.util.Scanner;
import dao.VoosDAO;
import modelo.Voos;

public class VoosCrud {

	public static void main(String[] args) {

		// CONEXÃO COM O BANCO DE DADOS - VOOS
		VoosDAO voosDAO = new VoosDAO();
//		Passageiros passageiro = new Passageiros();	

		// CAPTURA OS DADOS DIGITADOS PELO USUÁRIO
		Scanner s = new Scanner(System.in);
		String nome = "";
		int posicao = 0;
		int opcao = 0;
		int IdVoo = 0;
		String LinhaAerea = "";
		String Origem = "";
		String Destino = "";
		String Partida = "";
		String Chegada = "";
		double Paradas = 0;
		double ValorVoo = 0;

		do {

			System.out.println("=== CRUD VOOS ===");
			System.out.println("1 - CADASTRAR VOOS");
			System.out.println("2 - CONSULTAR VOOS");
			System.out.println("3 - ATUALIZAR VOOS");
			System.out.println("4 - DELETAR VOOS");
			System.out.println("5 - BUSCAR POR ID ");
			System.out.println("0 - Sair");
			opcao = s.nextInt();
			s.nextLine();

			switch (opcao) {
			case 1:
				// CREATE
				System.out.println("DIGITE O LINHA AÉREA");
				LinhaAerea = s.nextLine();
				System.out.println("DIGITE A ORIGEM");
				Origem = s.next();
				System.out.println("DIGITE O DESTINO");
				Destino = s.next();
				System.out.println("DIGITE A PARTIDA");
				Partida = s.next();
				System.out.println("DIGITE A CHEGADA");
				Chegada = s.next();
				System.out.println("DIGITE AS PARADAS");
				Paradas = s.nextDouble();
				System.out.println("DIGITE O VALOR VOO");
				ValorVoo = s.nextDouble();
				
				
				
				
				Voos v1 = new Voos(IdVoo, LinhaAerea, Origem, Destino, Partida, Chegada, Paradas, ValorVoo);
				voosDAO.save(v1);
				System.out.println("\n***  Cadastrou  ***\n");
				break;
			case 2:
				// READ
				for (Voos v : voosDAO.getVoos()) {
					System.out.println("ID: " + v.getIdVoo() + " LINHA AÉREA: " + v.getLinhaAerea() + " ORIGEM: "
							+ v.getOrigem() + " DESTINO: " + v.getDestino() + " PARTIDA: " + v.getPartida()
							+ " CHEGADA: " + v.getChegada() + " PARADAS: " + v.getParadas() + " VALOR VOO: "
							+ v.getValorVoo());
				}
				System.out.println("CONSULTOU");
				break;
			case 3:
				// UPDATE
				System.out.println("DIGITE O ID DO VOO: ");
				IdVoo = s.nextInt();
				s.nextLine();
				System.out.println("DIGITE O LINHA AÉREA");
				LinhaAerea = s.nextLine();
				System.out.println("DIGITE A ORIGEM");
				Origem = s.next();
				System.out.println("DIGITE O DESTINO");
				Destino = s.next();
				System.out.println("DIGITE A PARTIDA");
				Partida = s.next();
				System.out.println("DIGITE A CHEGADA");
				Chegada = s.next();
				System.out.println("DIGITE AS PARADAS");
				Paradas = s.nextDouble();
				System.out.println("DIGITE O VALOR VOO");
				ValorVoo = s.nextDouble();
				
				Voos v2 = new Voos(IdVoo, LinhaAerea, Origem, Destino, Partida, Chegada, Paradas, ValorVoo);
				voosDAO.update(v2);
				System.out.println("atualizou");
				break;
			case 4:
				// DELETE
				System.out.println("DIGITE O ID DO VOO: ");
				IdVoo = s.nextInt();
				voosDAO.removeById(posicao);
				break;
			case 5:
				// BUSCAR POR ID
				System.out.println("DIGITE O ID DO VOO: ");
				IdVoo = s.nextInt();

				Voos v3 = voosDAO.getVoosById(posicao);
				System.out.println("ID: " + v3.getIdVoo() + " LINHA AÉREA: " + v3.getLinhaAerea() + " ORIGEM: "
						+ v3.getOrigem() + " DESTINO: " + v3.getDestino() + " PARTIDA: " + v3.getPartida() + " CHEGADA: "
						+ v3.getChegada() + " PARADAS: " + v3.getParadas() + " VALOR VOO: " + v3.getValorVoo());
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