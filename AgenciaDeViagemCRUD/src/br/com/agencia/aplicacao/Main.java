package br.com.agencia.aplicacao;

import br.com.agencia.dao.CheckoutDAO;
import br.com.agencia.dao.DestinoDAO;
import br.com.agencia.dao.HoteisDAO;
import br.com.agencia.dao.PassageirosDAO;
import br.com.agencia.dao.PassagensDAO;
import br.com.agencia.dao.PromocoesDAO;
import br.com.agencia.dao.VoosDAO;
import br.com.agencia.model.Checkout;
import br.com.agencia.model.Destino;
import br.com.agencia.model.Hoteis;
import br.com.agencia.model.Passageiros;
import br.com.agencia.model.Promocoes;
import br.com.agencia.model.Voos;
import br.com.agencia.model.Passagens;

public class Main {

	public static void main(String[] args) {
		
		
//CADASTRO PASSAGEIRO
		PassageirosDAO passageirosDao = new PassageirosDAO();
		Passageiros passageiros = new Passageiros();
		passageiros.getid();
		passageiros.setNome("Marcia Delamo");
		passageiros.setRg("461739628");
		passageiros.setCpf("99520154027");
		passageiros.setDataNascimento(06-07-2007);
		passageiros.setEndereco("Rua Quatro");
		passageiros.setComplemento("Chácara Leandro");
		passageiros.setCep(13085-744);
		passageiros.setEstado("Rio de Janeiro");
		passageiros.setEmail("marcia.delamo@gmail.com");
		passageiros.getTelefone(98504-3635);
		passageirosDao.save(passageiros);
//ATUALIZAR O PASSAGEIRO
		Passageiros ps1 = new Passageiros();
		ps1.setNome("Marcia Delamo");
		ps1.setRg("461739628");
		ps1.setCpf("99520154027");
		ps1.setDataNascimento(06-07-2007);
		ps1.setEndereco("Rua Quatro");
		ps1.setComplemento("Chácara Leandro");
		ps1.setCep(13085-744);
		ps1.setEstado("Rio de Janeiro");
		ps1.setEmail("marcia.delamo@gmail.com");
		ps1.getTelefone(98504-3635);
		ps1.setId(1);//NUMERO QUE ESTA NO BANCO DE DADOS DE PK
		passageirosDao.update(ps1);	
//DELETAR O CHECKOUT PELO NÚMERO DO SEU ID
		passageirosDao.deleteByID();
		
		
//CADASTRO DESTINO
		DestinoDAO destinoDao = new DestinoDAO();
		Destino destino = new Destino();
		destino.getid();
		destino.setLocalViagem("Alberta, Canadá");
		destino.getValorViagem(6.866,00);
		destinoDao.save(destino);
//ATUALIZAR O DESTINO
		Destino d1 = new Destino();
		d1.setLocalViagem("Alberta, Canadá");
		d1.getValorViagem(6.866,00);
		d1.setId(1);//NUMERO QUE ESTA NO BANCO DE DADOS DE PK
		destinoDao.update(d1);
//DELETAR O DESTINO PELO NÚMERO DO SEU ID
		destinoDao.deleteByID();
		
		
//CADASTRO DESTINO-PROMOÇÃO
		PromocoesDAO promocoesDao = new PromocoesDAO();		
		Promocoes promocoes = new Promocoes();
		promocoes.getid();
		promocoes.getLocalViagem();
		promocoes.getValorViagem();	
		promocoesDao.save(promocoes);
//ATUALIZAR O DESTINO-PROMOÇÃO
		Promocoes p1 = new Promocoes();
		p1.setLocalViagem("Alberta, Canadá");
		p1.getValorViagem();
		p1.setId(1);//NUMERO QUE ESTA NO BANCO DE DADOS DE PK
		promocoesDao.update(p1);
//DELETAR O DESTINO-PROMOÇÃO PELO NÚMERO DO SEU ID
		promocoesDao.deleteByID();
		
		
//CADASTRO VOO
		VoosDAO voosDao = new VoosDAO();					
		Voos voos = new Voos();
		voos.getid();
		voos.setLinhaAerea("Azul");
		voos.setOrigem("Rio de Janeiro");
		voos.setDestino("Alberta, Canadá");
		voos.getPartida(130722);
		voos.getChegada(100822);
		voos.getParadas(1);
		voos.getValorVoo(5.277,00);							
		voosDao.save(voos);
//ATUALIZAR O VOO
		Voos v1 = new Voos();
		v1.setLinhaAerea("Azul");
		v1.setOrigem("Rio de Janeiro");
		v1.setDestino("Alberta, Canadá");
		v1.getPartida(130722);
		v1.getChegada(100822);
		v1.getParadas(1);
		v1.getValorVoo(5.277,00);
		v1.setId(1);//NUMERO QUE ESTA NO BANCO DE DADOS DE PK
		voosDao.update(v1);
		promocoesDao.deleteByID();
//DELETAR O VOO PELO NÚMERO DO SEU ID
		voosDao.deleteByID();
		
		
//CADASTRO HOTEIS
		HoteisDAO hoteisDao = new HoteisDAO();						
		Hoteis hoteis = new Hoteis();
		hoteis.getid();
		hoteis.getHoteis("The Ritz-Carlton Hotel");
		hoteis.getCheckin(100822);
		hoteis.getNoites(15);
		hoteis.getAdultos(1);
		hoteis.getValorHospedagem(932,00);						
		hoteisDao.save(hoteis);
//ATUALIZAR O  HOTEIS
		Hoteis h1 = new Hoteis();
		h1.getHoteis("The Ritz-Carlton Hotel");
		h1.getCheckin(100822);
		h1.getNoites(15);
		h1.getAdultos(1);
		h1.getValorHospedagem(932,00);
		h1.setId(1);//NUMERO QUE ESTA NO BANCO DE DADOS DE PK
		hoteisDao.update(h1);		
//DELETAR O HOTEL PELO NÚMERO DO SEU ID
		hoteisDao.deleteByID();	
		
		
//CADASTRO CHECKOUT
		CheckoutDAO checkoutDao = new CheckoutDAO();										
		Checkout checkout = new Checkout();
		checkout.getid();
		checkout.getNome("Marcia");
		checkout.getSobrenome("Delamo");
		checkout.getEmail("cristiano.delamo@gmail.com");
		checkout.getEndereco("Rua Quatro");
		checkout.getComplemento("Chácara Leandro");
		checkout.getPais("Brasil");
		checkout.getEstado("Rio de Janeiro");
		checkout.getCep(13085-744);
		checkout.getPrecoPassagem(13.075,00);
		checkout.getFormasPagamento("Cartão de Crédito");											
		checkoutDao.save(checkout);
//ATUALIZAR O CHECKOUT
		Checkout c1 = new Checkout();
		c1.getNome("Marcia");
		c1.getSobrenome("Delamo");
		c1.getEmail("cristiano.delamo@gmail.com");
		c1.getEndereco("Rua Quatro");
		c1.getComplemento("Chácara Leandro");
		c1.getPais("Brasil");
		c1.getEstado("Rio de Janeiro");
		c1.getCep(13085-744);
		c1.getPrecoPassagem(13.075,00);
		c1.getFormasPagamento("Cartão de Crédito");
		c1.setId(1);//NUMERO QUE ESTA NO BANCO DE DADOS DE PK
		checkout.update(c1);
//DELETAR O CHECKOUT PELO NÚMERO DO SEU ID
		checkoutDao.deleteByID();
		
		
//CADASTRO PASSAGENS
		PassagensDAO passagensDao = new PassagensDAO();								
		Passagens passagens = new Passagens();
		passagens.getid();
		passagens.getHoraViagem(071000);
		passagens.getNomeLocalOrigem("Rio de Janeiro");
		passagens.getNomeLocalDestino("Alberta, Canadá");
		passagens.getDataViagemIda(130722);
		passagens.getDataViagemVolta(280722);												
		passagensDao.save(passagens);
//ATUALIZAR O PASSAGENS
		Passagens pg1 = new Passagens();
		pg1.getHoraViagem(071000);
		pg1.getNomeLocalOrigem("Rio de Janeiro");
		pg1.getNomeLocalDestino("Alberta, Canadá");
		pg1.getDataViagemIda(130722);
		pg1.getDataViagemVolta(280722);		
		pg1.setId(1);//NUMERO QUE ESTA NO BANCO DE DADOS DE PK
		passagensDao.update(pg1);
//DELETAR AS PASSAGENS PELO NÚMERO DO SEU ID
		passagensDao.deleteByID();
				
				

		
		
		
		
		
		
		
		
		
		
//VISUALIZAÇÃO DE TODOS OS REGISTROS DO BANCO DE DADOS
		//VISUALIZAÇÃO PASSAGEIROS
		for(Passageiros ps : passageirosDao.getPassageiros()) {
		 System.out.println("Voos: " + ps.getid());
		 System.out.println("Voos: " + ps.getNome());
		 System.out.println("Voos: " + ps.getRg());
		 System.out.println("Voos: " + ps.getCpf());
		 System.out.println("Voos: " + ps.getDataNascimento());
		 System.out.println("Voos: " + ps.getEndereco());
		 System.out.println("Voos: " + ps.getComplemento());
		 System.out.println("Voos: " + ps.getCep());
		 System.out.println("Voos: " + ps.getEstado());
		 System.out.println("Voos: " + ps.getEmail());
		 System.out.println("Voos: " + ps.getTelefone());
		 System.out.println("Voos: " + ps.getCep());
		}
//VISUALIZAÇÃO DESTINO
		for(Destino d : destinoDao.getDestino()) {
		 System.out.println("Destino: " + d.getid());
		 System.out.println("Destino: " + d.getLocalViagem());
		 System.out.println("Destino: " + d.getValorViagem());
		}
//VISUALIZAÇÃO DESTINO-PROMOÇÃO
		for(Promocoes p : promocoesDao.getPromocoes()) {
		 System.out.println("Promocoes: " + p.getid());
		 System.out.println("promocoes: " + p.getLocalViagem());
		 System.out.println("Promocoes: " + p.getValorViagem());
		}
//VISUALIZAÇÃO VOO
		for(Voos v : voosDao.getVoos()) {
		 System.out.println("Voos: " + v.getid());
		 System.out.println("Voos: " + v.getLinhaAerea());
		 System.out.println("Voos: " + v.getOrigem());
		 System.out.println("Voos: " + v.getDestino());
		 System.out.println("Voos: " + v.getPartida());
		 System.out.println("Voos: " + v.getChegada());
		 System.out.println("Voos: " + v.getParadas());
		 System.out.println("Voos: " + v.getValorVoo());
		}
//VISUALIZAÇÃO HOTEIS
		for(Hoteis h : hoteisDao.getHoteis()) {
			System.out.println("Hoteis: " + h.getid());
			System.out.println("Hoteis: " + h.getHoteis());
			System.out.println("Hoteis: " + h.getCheckin());
			System.out.println("Hoteis: " + h.getNoites());
			System.out.println("Hoteis: " + h.getAdultos());
			System.out.println("Hoteis: " + h.getValorHospedagem());
		}
//VISUALIZAÇÃO CHECKOUT
		for(Checkout c : checkoutDao.getCheckouts()) {
			System.out.println("Checkout: " + c.getid());
			System.out.println("Checkout: " + c.getNome());
			System.out.println("Checkout: " + c.getSobrenome());
			System.out.println("Checkout: " + c.getEmail());
			System.out.println("Checkout: " + c.getEndereco());
			System.out.println("Checkout: " + c.getComplemento());
			System.out.println("Checkout: " + c.getPais());
			System.out.println("Checkout: " + c.getEstado());
			System.out.println("Checkout: " + c.getCep());
			System.out.println("Checkout: " + c.getPrecoPassagem());
			System.out.println("Checkout: " + c.getFormasPagamento());
		}
//VISUALIZAÇÃO PASSAGENS
		for(Passagens pg : passagensDao.getPassagens()) {
			System.out.println("Passagens: " + pg.getid());
			System.out.println("Passagens: " + pg.getHoraViagem());
			System.out.println("Passagens: " + pg.getNomeLocalOrigem());
			System.out.println("Passagens: " + pg.getNomeLocalDestino());
			System.out.println("Passagens: " + pg.getDataViagemIda());
			System.out.println("Passagens: " + pg.getDataViagemVolta());
		}		
	}
}
