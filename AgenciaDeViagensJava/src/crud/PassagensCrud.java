
package crud;

import java.util.Date;
import java.util.Scanner;

import dao.CheckoutDAO;
import dao.DestinosDAO;
import dao.HoteisDAO;
import dao.PassageirosDAO;
import dao.PassagensDAO;
import dao.PromocoesDAO;
import dao.VoosDAO;
import modelo.Checkout;
import modelo.Destinos;
import modelo.Hoteis;
import modelo.Passageiros;
import modelo.Passagens;
import modelo.Promocoes;
import modelo.Voos;

public class PassagensCrud {

	public static void main(String[] args) {
		PassagensDAO passagensDAO = new PassagensDAO();

		CheckoutDAO checkoutDAO = new CheckoutDAO();
		PassageirosDAO passageirosDAO = new PassageirosDAO();

		DestinosDAO destinosDAO = new DestinosDAO();
		PromocoesDAO promocoesDAO = new PromocoesDAO();
		HoteisDAO hoteisDAO = new HoteisDAO();
		VoosDAO voosDAO = new VoosDAO();

		Scanner s = new Scanner(System.in);
		int opcao = 0;
		int posicao = 0;
		int IdPassagem;
		Passageiros Passageiros;
		Destinos Destinos;
		Promocoes Promocoes;
		Hoteis Hoteis;
		Voos Voos;
		String HoraViagem;
		String NomeLocalOrigem;
		String NomeLocalDestino;
		String DataViagemIda;
		String DataViagemVolta;
		double total;
		int IdCheckout;
		String Nome;
		String Sobrenome;
		String Email;
		String Endereco;
		String Complemento;
		String Pais;
		String Estado;
		String Cep;
		double PrecoPassagem;
		boolean FormasPagamento;
		int IdPassageiro = 0;
		String Rg;
		String Cpf;
		String DataNascimento;
		String Telefone;

		do {
			System.out.println("=== CRUD PASSAGENS ===");
			System.out.println("1 - Cadastrar PASSAGENS");
			System.out.println("2 - Consultar PASSAGENS");
			System.out.println("3 - Atualizar PASSAGENS");
			System.out.println("4 - Deletar PASSAGENS");
			System.out.println("5 - BUSCAR POR ID");
			System.out.println("0 - Sair");
			opcao = s.nextInt();
			s.nextLine();

			switch (opcao) {

			case 1:
				// CREATE
				System.out.println("HORA DA VIAGEM: ");
				HoraViagem = s.nextLine();
				System.out.println("NOME LOCAL DE ORIGEM: ");
				NomeLocalOrigem = s.nextLine();
				s.nextLine();
				System.out.println("NOME LOCAL DE DESTINO: ");
				NomeLocalDestino = s.nextLine();
				System.out.println("DATA VIAGEM IDA: ");
				DataViagemIda = s.nextLine();
				s.nextLine();
				System.out.println("DATA VIAGEM VOLTA: ");
				DataViagemVolta = s.nextLine();
				s.nextLine();

				Passageiros passageiros = passageirosDAO.getPassageirosById(IdPassageiro);

				Passagens pg1 = new Passagens();

				passagensDAO.save(pg1);

				System.out.println("\n***  Cadastrou  ***\n");

				break;

			case 2:
				// READ
				for (Passagens l : passagensDAO.getPassagens()) {
					System.out.println("ID: " + l.getIdPassagem() + " ID PASSAGEIRO: "
							+ l.getPassageiros().getIdPassageiro() + " HORA VIAGEM: " + l.getHoraViagem()
							+ " NOME LOCAL ORIGEM:" + l.getNomeLocalOrigem() + " NOME LOCAL DESTINO:"
							+ l.getNomeLocalDestino() + " DATA VIAGEM IDA:" + l.getDataViagemIda()
							+ " NOME LOCAL ORIGEM:" + l.getDataViagemVolta());
				}
				System.out.println("consultou");
				break;
			case 3:
				// UPDATE

				System.out.println("DIGITE DE O ID DA PASSAGEM: ");
				IdPassagem = s.nextInt();
				s.nextLine();
				System.out.println("HORA DA VIAGEM: ");
				HoraViagem = s.nextLine();
				System.out.println("NOME LOCAL DE ORIGEM: ");
				NomeLocalOrigem = s.nextLine();
				s.nextLine();
				System.out.println("NOME LOCAL DE DESTINO: ");
				NomeLocalDestino = s.nextLine();
				System.out.println("DATA VIAGEM IDA: ");
				DataViagemIda = s.nextLine();
				s.nextLine();
				System.out.println("DATA VIAGEM VOLTA: ");
				DataViagemVolta = s.nextLine();
				s.nextLine();

				Passageiros passageiro = passageirosDAO.getPassageirosById(IdPassageiro);

				Passagens pg2 = new Passagens();

				passagensDAO.update(pg2);

				System.out.println("atualizou" + pg2.getNomeLocalDestino());
				break;
	
			case 4:
				// DELETE
				System.out.println("Digite o id do Livro: ");
				IdPassagem = s.nextInt();

				passagensDAO.removeById(IdPassagem);

				break;
			case 5:
				// buscar por id
				System.out.println("Digite o id do Livro: ");
				IdPassagem = s.nextInt();

				Passagens l3 = passagensDAO.getPassagensById(IdPassagem);

				System.out.println("ID: " + l3.getIdPassagem() + " ID PASSAGEIRO: "
						+ l3.getPassageiros().getIdPassageiro() + " HORA VIAGEM: " + l3.getHoraViagem()
						+ " NOME LOCAL ORIGEM:" + l3.getNomeLocalOrigem() + " NOME LOCAL DESTINO:"
						+ l3.getNomeLocalDestino() + " DATA VIAGEM IDA:" + l3.getDataViagemIda()
						+ " NOME LOCAL ORIGEM:" + l3.getDataViagemVolta());

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
