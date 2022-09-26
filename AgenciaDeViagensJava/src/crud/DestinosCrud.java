package crud;

import java.util.Date;
import java.util.Scanner;

import dao.DestinosDAO;
import modelo.Destinos;

public class DestinosCrud {

	public static void main(String[] args) {

		// CONEXÃO COM O BANCO DE DADOS - DESTINOS
		DestinosDAO destinosDAO = new DestinosDAO();
//		Passageiros passageiro = new Passageiros();	

		// CAPTURA OS DADOS DIGITADOS PELO USUÁRIO
		Scanner s = new Scanner(System.in);
		String nome = "";
		int posicao = 0;
		int opcao = 0;
		int IdDestino = 0;
		String LocalViagem = "";
		double ValorViagem = 0;

		do {

			System.out.println("=== CRUD DESTINOS ===");
			System.out.println("1 - CADASTRAR DESTINOS");
			System.out.println("2 - CONSULTAR DESTINOS");
			System.out.println("3 - ATUALIZAR DESTINOS");
			System.out.println("4 - DELETAR DESTINOS");
			System.out.println("5 - BUSCAR POR ID ");
			System.out.println("0 - Sair");
			opcao = s.nextInt();
			s.nextLine();

			switch (opcao) {

			case 1:
				// CREATE
				System.out.println("DIGITE O NOME DO DESTINO: ");
				LocalViagem = s.nextLine();
				System.out.println("DIGITE O VALOR DA VIAGEM: ");
				ValorViagem = s.nextDouble();

				Destinos d1 = new Destinos(IdDestino, LocalViagem, ValorViagem);

				destinosDAO.save(d1);

				System.out.println("\n***  Cadastrou  ***\n");

				break;
			case 2:
				// READ
				for (Destinos d : destinosDAO.getDestinos()) {
					System.out.println("ID: " + d.getIdDestino() + " LOCAL VIAGEM: " + d.getLocalViagem()
							+ " VALOR VIAGEM: " + d.getValorViagem());
				}
				System.out.println("CONSULTOU");
				break;
			case 3:
				// UPDATE
				System.out.println("DIGITE O ID DO DESTINO: ");
				IdDestino = s.nextInt();
				s.nextLine();
				System.out.println("DIGITE O LOCAL DO DESTINO");
				LocalViagem = s.nextLine();
				System.out.println("DIGITE O VALOR DO DESTINO");
				ValorViagem = s.nextDouble();

				Destinos d2 = new Destinos(IdDestino, LocalViagem, ValorViagem);

				destinosDAO.update(d2);

				System.out.println("atualizou");
				break;
			case 4:
				// DELETE
				System.out.println("DIGITE O ID DO DESTINO: ");
				IdDestino = s.nextInt();

				destinosDAO.removeById(posicao);

				break;
			case 5:
				// BUSCAR POR ID
				System.out.println("DIGITE O ID DO DESTINO: ");
				IdDestino = s.nextInt();

				Destinos d3 = destinosDAO.getDestinosById(posicao);

				System.out.println("ID: " + d3.getIdDestino() + " LOCAL VIAGEM: " + d3.getLocalViagem()
						+ " VALOR VIAGEM: " + d3.getValorViagem());
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