
package crud;


import java.util.Scanner;
import dao.HoteisDAO;
import modelo.Hoteis;

public class HoteisCrud {

	public static void main(String[] args) {

		// CONEXÃO COM O BANCO DE DADOS - DESTINOS
		HoteisDAO hoteisDAO = new HoteisDAO();
//		Passageiros passageiro = new Passageiros();	

		// CAPTURA OS DADOS DIGITADOS PELO USUÁRIO
		Scanner s = new Scanner(System.in);
		String nome = "";
		int posicao = 0;
		int opcao = 0;
		int IdHotel = 0;
		String LocalHotel = "";
		double ValorHospedagem = 0;
		

		do {

			System.out.println("=== CRUD HOTEIS ===");
			System.out.println("1 - CADASTRAR HOTEIS");
			System.out.println("2 - CONSULTAR HOTEIS");
			System.out.println("3 - ATUALIZAR HOTEIS");
			System.out.println("4 - DELETAR HOTEIS");
			System.out.println("5 - BUSCAR POR ID ");
			System.out.println("0 - Sair");
			opcao = s.nextInt();
			s.nextLine();

			switch (opcao) {

			case 1:
				// CREATE
				System.out.println("DIGITE O NOME DO HOTEL: ");
				LocalHotel = s.nextLine();
				System.out.println("DIGITE O VALOR DA HOSPEDAGEM: ");
				ValorHospedagem = s.nextDouble();
				
				Hoteis h1 = new Hoteis(IdHotel, LocalHotel, ValorHospedagem);
				hoteisDAO.save(h1);
				System.out.println("\n***  Cadastrou  ***\n");
				break;
			case 2:
				// READ
				for (Hoteis h : hoteisDAO.getHoteis()) {
					System.out.println("ID: " + h.getIdHotel() + " LOCAL HOTEL: " + h.getLocalHotel()
							+ " VALOR HOSPEDAGEM: " + h.getValorHospedagem());
				}
				System.out.println("CONSULTOU");
				break;	
			case 3:
				// UPDATE
				System.out.println("DIGITE O ID DO HOTEL: ");
				posicao = s.nextInt();
				s.nextLine();
				System.out.println("DIGITE O LOCAL DO HOTEL: ");
				LocalHotel = s.nextLine();
				System.out.println("DIGITE O VALOR  DA HOSPEDAGEM: ");
				ValorHospedagem = s.nextDouble();
				
				Hoteis h2 = new Hoteis(IdHotel, LocalHotel, ValorHospedagem);
				hoteisDAO.update(h2);
				System.out.println("atualizou");
				break;	
			case 4:
				// DELETE
				System.out.println("DIGITE O ID DO HOTEL: ");
				IdHotel = s.nextInt();

				hoteisDAO.removeById(posicao);
				break;
			case 5:
				// BUSCAR POR ID
				System.out.println("DIGITE O ID DO HOTEL: ");
				IdHotel = s.nextInt();

				Hoteis h3 = hoteisDAO.getHoteisById(posicao);
				System.out.println("ID: " + h3.getIdHotel() + " LOCAL HOTEL: " + h3.getLocalHotel()
				+ " VALOR HOSPEDAGEM: " + h3.getValorHospedagem());
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