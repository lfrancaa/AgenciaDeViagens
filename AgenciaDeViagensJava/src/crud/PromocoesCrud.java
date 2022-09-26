package crud;

import java.util.Date;
import java.util.Scanner;
import dao.DestinosDAO;
import dao.PromocoesDAO;
import modelo.Destinos;
import modelo.Promocoes;

public class PromocoesCrud {

	public static void main(String[] args) {

		// CONEXÃO COM O BANCO DE DADOS - DESTINOS
		PromocoesDAO promocoesDAO = new PromocoesDAO();
//		Passageiros passageiro = new Passageiros();	

		// CAPTURA OS DADOS DIGITADOS PELO USUÁRIO
		Scanner s = new Scanner(System.in);
		String nome = "";
		int posicao = 0;
		int opcao = 0;
		int IdPromocao = 0;
		String LocalViagem = "";
		double ValorViagem = 0;

		do {

			System.out.println("=== CRUD DESTINOS EM PROMOÇÃO ===");
			System.out.println("1 - CADASTRAR DESTINOS EM PROMOÇÃO");
			System.out.println("2 - CONSULTAR DESTINOS EM PROMOÇÃO");
			System.out.println("3 - ATUALIZAR DESTINOS EM PROMOÇÃO");
			System.out.println("4 - DELETAR DESTINOS EM PROMOÇÃO");
			System.out.println("5 - BUSCAR POR ID ");
			System.out.println("0 - Sair");
			opcao = s.nextInt();
			s.nextLine();

			switch (opcao) {

			case 1:
				// CREATE
				System.out.println("DIGITE O LOCAL DO DESTINO EM PROMOÇÃO");
				LocalViagem = s.nextLine();
				System.out.println("DIGITE O VALOR DO DESTINO EM PROMOÇÃO");
				ValorViagem = s.nextDouble();

				Promocoes pm1 = new Promocoes(IdPromocao, LocalViagem, ValorViagem);

				promocoesDAO.save(pm1);

				System.out.println("\n***  Cadastrou  ***\n");

				break;
			case 2:
				// READ
				for (Promocoes pm : promocoesDAO.getPromocoes()) {
					System.out.println("ID: " + pm.getIdPromocao() + " LOCAL VIAGEM: " + pm.getLocalViagem()
							+ " VALOR VIAGEM: " + pm.getValorViagem());
				}
				System.out.println("CONSULTOU");
				break;	
			case 3:
				// UPDATE
				System.out.println("DIGITE O ID DO DESTINO EM PROMOÇÃO: ");
				IdPromocao = s.nextInt();
				s.nextLine();
				System.out.println("DIGITE O LOCAL DO DESTINO EM PROMOÇÃO");
				LocalViagem = s.nextLine();
				System.out.println("DIGITE O VALOR DO DESTINO EM PROMOÇÃO");
				ValorViagem = s.nextDouble();

				Promocoes pm2 = new Promocoes(IdPromocao, LocalViagem, ValorViagem);

				promocoesDAO.update(pm2);

				System.out.println("atualizou");
				break;	
			case 4:
				// DELETE
				System.out.println("DIGITE O ID DO DESTINO EM PROMOÇÃO: ");
				IdPromocao = s.nextInt();
				promocoesDAO.removeById(posicao);
				break;	
			case 5:
				// BUSCAR POR ID
				System.out.println("DIGITE O ID DO DESTINO EM PROMOÇÃO: ");
				IdPromocao = s.nextInt();

				Promocoes pm3 = promocoesDAO.getPromocoesById(posicao);

				System.out.println("ID: " + pm3.getIdPromocao() + " LOCAL VIAGEM: " + pm3.getLocalViagem()
						+ " VALOR VIAGEM: " + pm3.getValorViagem());
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