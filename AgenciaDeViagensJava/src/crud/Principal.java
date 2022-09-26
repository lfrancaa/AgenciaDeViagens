
package crud;

import java.util.Arrays;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import dao.CheckoutDAO;
import dao.PassageirosDAO;
import dao.VoosDAO;
import dao.HoteisDAO;
import dao.PassagensDAO;
import dao.PromocoesDAO;
import dao.DestinosDAO;
import modelo.Checkout;
import modelo.Destinos;
import modelo.Hoteis;
import modelo.Passagens;
import modelo.Voos;
import modelo.Passageiros;
import modelo.Promocoes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		// CONEXÃO COM O BANCO DE DADOS - PASSAGEIROS
		PassageirosDAO passageirosDAO = new PassageirosDAO();
		Passageiros passageiros = new Passageiros();

		// CONEXÃO COM O BANCO DE DADOS - DESTINOS
		DestinosDAO destinosDAO = new DestinosDAO();
		Destinos destino = new Destinos();

		// CONEXÃO COM O BANCO DE DADOS - DESTINOS PROMOÇÃO
		PromocoesDAO promocoesDAO = new PromocoesDAO();
		Promocoes promocoes = new Promocoes();

		// CONEXÃO COM O BANCO DE DADOS - DESTINOS HOTEIS
		HoteisDAO hoteisDAO = new HoteisDAO();
		Hoteis hoteis = new Hoteis();

		// CONEXÃO COM O BANCO DE DADOS - DESTINOS VOOS
		VoosDAO voosDAO = new VoosDAO();
		Voos voos = new Voos();

		// CONEXÃO COM O BANCO DE DADOS - DESTINOS PASSAGENS
		PassagensDAO passagensDAO = new PassagensDAO();
		Passagens passagens = new Passagens();

		// CONEXÃO COM O BANCO DE DADOS - DESTINOS CHECKOUT
		CheckoutDAO checkoutDAO = new CheckoutDAO();
		Checkout checkout = new Checkout();

		// CAPTURA OS DADOS DIGITADOS PELO USUÁRIO
		Scanner entrada = new Scanner(System.in);
		String nome = "";
		int idade = 0;
		int codigo = 0;
		int menuPrincipal = 9;

		// CRUD PASSAGEIROS

		// CRIAÇÃO DOS OBJETOS GLOBAIS PARA MANIPULAÇÃO:
		PassageirosDAO _passageirosDAO = new PassageirosDAO();
		Passageiros _passageiros = new Passageiros();

		// CREATE - CRIAÇÃO DO PASSAGEIROS
		_passageiros.setNome("Luciano");
		_passageiros.setRg("439116648");
		_passageiros.setCpf("42243406071");
		_passageiros.setDataNascimento(new Date());
		_passageiros.setEndereco("Rua Ernani Mendes Gonçalves");
		_passageiros.setComplemento("Casa Branca, Santo André - SP");
		_passageiros.setCep("09015615");
		_passageiros.setEstado("SP");
		_passageiros.setEmail("dv.lfrancaa@outlook.com");
		_passageiros.setTelefone("11941989926");

		// SAVE - SALVAR O PASSAGEIROS
		_passageirosDAO.save(_passageiros);

		// UPDATE - ATUALIZA O PASSAGEIROS COM ID = 1 COM OS DADOS DO OBJETO _destino1.

		// CRIAÇÃO DO OBJETO PARA SETAR
		Passageiros _passageiros1 = new Passageiros();
		_passageiros1.setIdPassageiro(15);
		_passageiros1.setNome("");
		_passageiros1.setRg("");
		_passageiros1.setCpf("");
		_passageiros1.setDataNascimento(new Date());
		_passageiros1.setEndereco("");
		_passageiros1.setComplemento("");
		_passageiros1.setCep("");
		_passageiros1.setEstado("");
		_passageiros1.setEmail("");
		_passageiros1.setTelefone("");

		// CHAMADA DE UPDATE PARA ATUALIZAR
		_passageirosDAO.update(_passageiros1);

		// DELETE - CHAMAMOS O MÉTODO E PASSAMOS O "ID" QUE SERÁ EXCLUÍDO:
		_passageirosDAO.removeById(15);

		// READ - LISTA TODOS OS PASSAGEIROS DO BANCO DE DADOS

		// CHAMAMOS O MÉTODO "getPassageiros()" PARA CADA PASSAGEIROS
		for (Passageiros ps : _passageirosDAO.getPassageiros()) {
			System.out.println("NOME " + ps.getNome());
			System.out.println("RG " + ps.getRg());
			System.out.println("CPF " + ps.getCpf());
			System.out.println("DATA DE NASCIMENTO " + ps.getDataNascimento());
			System.out.println("ENDERECO " + ps.getEndereco());
			System.out.println("COMPLEMENTO " + ps.getComplemento());
			System.out.println("CEP " + ps.getCep());
			System.out.println("ESTADO " + ps.getEstado());
			System.out.println("EMAIL " + ps.getEmail());
			System.out.println("TELEFONE " + ps.getTelefone());
			System.out.println("----------------------------------------");
		}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		// CRUD PASSAGENS

		// CRIAÇÃO DOS OBJETOS GLOBAIS PARA MANIPULAÇÃO:
		PassagensDAO _passagensDAO = new PassagensDAO();
		Passagens _passagens = new Passagens();

		// CREATE - CRIAÇÃO DO PASSAGENS
		_passagens.setHoraViagem("07:10:00");
		_passagens.setNomeLocalOrigem("Rio de Janeiro - Brasil");
		_passagens.setNomeLocalDestino("Alberta - Canadá");
		_passagens.setDataViagemIda(new Date());
		_passagens.setDataViagemVolta(new Date());

		// SAVE - SALVAR O PASSAGENS
		_passagensDAO.save(_passagens);

		// UPDATE - ATUALIZA O PASSAGENS COM ID = 1 COM OS DADOS DO OBJETO _destino1.

		// CRIAÇÃO DO OBJETO PARA SETAR
		Passagens _passagens1 = new Passagens();
		_passagens1.setIdPassagem(15);
		_passagens1.setHoraViagem("");
		_passagens1.setNomeLocalOrigem("");
		_passagens1.setNomeLocalDestino("");
		_passagens1.setDataViagemIda(new Date());
		_passagens1.setDataViagemVolta(new Date());

		// CHAMADA DE UPDATE PARA ATUALIZAR
		_passagensDAO.update(_passagens1);

		// DELETE - CHAMAMOS O MÉTODO E PASSAMOS O "ID" QUE SERÁ EXCLUÍDO:
		_passagensDAO.removeById(15);

		// READ - LISTA TODOS OS PASSAGENS DO BANCO DE DADOS

		// CHAMAMOS O MÉTODO "getPassagens()" PARA CADA PASSAGENS
		for (Passagens pg : _passagensDAO.getPassagens()) {
			System.out.println("HORA DA VIAGEM " + pg.getHoraViagem());
			System.out.println("LOCAL DE ORIGEM " + pg.getNomeLocalOrigem());
			System.out.println("LOCAL DE DESTINO " + pg.getNomeLocalDestino());
			System.out.println("DATA VIAGEM IDA: " + pg.getDataViagemIda());
			System.out.println("DATA VIAGEM VOLTA " + pg.getDataViagemVolta());
			System.out.println("----------------------------------------");
		}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		

		// CRUD CHECKOUT

		// CRIAÇÃO DOS OBJETOS GLOBAIS PARA MANIPULAÇÃO:
		CheckoutDAO _checkoutDAO = new CheckoutDAO();
		Checkout _checkout = new Checkout();

		// CREATE - CRIAÇÃO DO CHECKOUT
		_checkout.getDestinos();
		_checkout.getPromocoes();
		_checkout.getHoteis();
		_checkout.getVoos();
		_checkout.setNome("Luciano");
		_checkout.setSobrenome("Franca");
		_checkout.setEmail("dv.lfrancaa@outlook.com");
		_checkout.setEndereco("Rua Ernani Mendes Gonçalves");
		_checkout.setComplemento("Casa Branca, Santo André - SP");
		_checkout.setPais("Brazil");
		_checkout.setEstado("SP");
		_checkout.setCep("09015615");
		_checkout.setPrecoPassagem(13075);
		_checkout.setFormasPagamento(true);

		// SAVE - SALVAR O CHECKOUT
		_checkoutDAO.save(_checkout);

		// UPDATE - ATUALIZA O DESTINO COM ID = 1 COM OS DADOS DO OBJETO _destino1.

		// CRIAÇÃO DO OBJETO PARA SETAR
		Checkout _checkout1 = new Checkout();
		_checkout1.setIdCheckout(15);
		_checkout1.setNome("");
		_checkout1.setSobrenome("");
		_checkout1.setEmail("");
		_checkout1.setEndereco("");
		_checkout1.setComplemento("");
		_checkout1.setPais("");
		_checkout1.setEstado("");
		_checkout1.setCep("");
		_checkout1.setPrecoPassagem(0);
		_checkout1.setFormasPagamento(false);

		// CHAMADA DE UPDATE PARA ATUALIZAR
		_checkoutDAO.update(_checkout1);

		// DELETE - CHAMAMOS O MÉTODO E PASSAMOS O "ID" QUE SERÁ EXCLUÍDO:
		_checkoutDAO.removeById(15);

		// READ - LISTA TODOS OS CHECKOUT DO BANCO DE DADOS

		// CHAMAMOS O MÉTODO "getCheckouts()" PARA CADA CHECKOUT
		for (Checkout c : _checkoutDAO.getCheckouts()) {
			System.out.println("NOME " + c.getNome());
			System.out.println("SOBRENOME " + c.getSobrenome());
			System.out.println("EMAIL " + c.getEmail());
			System.out.println("ENDERECO " + c.getEndereco());
			System.out.println("COMPLEMENTO " + c.getComplemento());
			System.out.println("PAIS " + c.getPais());
			System.out.println("ESTADO " + c.getEstado());
			System.out.println("CEP " + c.getCep());
			System.out.println("PREÇO PASSAGEM " + c.getPrecoPassagem());
			System.out.println("FORMAS DE PAGAMENTO " + c.getFormasPagamento());
			System.out.println("----------------------------------------");
		}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		

//CRUD DESTINO

		// CRIAÇÃO DOS OBJETOS GLOBAIS PARA MANIPULAÇÃO:
		DestinosDAO _destinoDAO = new DestinosDAO();
		Destinos _destino = new Destinos();

		// CREATE - CRIAÇÃO DO DESTINO
		_destino.setLocalViagem("Roma, Itália");
		_destino.setValorViagem(6381);

		// SAVE - SALVAR O DESTINO
		_destinoDAO.save(_destino);

		// UPDATE - ATUALIZA O DESTINO COM ID = 1 COM OS DADOS DO OBJETO _destino1.

		// CRIAÇÃO DO OBJETO PARA SETAR
		Destinos _destino1 = new Destinos();
		_destino1.setIdDestino(15);
		_destino1.setLocalViagem("");
		_destino1.setValorViagem(0);

		// CHAMADA DE UPDATE PARA ATUALIZAR
		_destinoDAO.update(_destino1);

		// DELETE - CHAMAMOS O MÉTODO E PASSAMOS O "ID" QUE SERÁ EXCLUÍDO:
		_destinoDAO.removeById(15);

		// READ - LISTA TODOS OS DESTINOS DO BANCO DE DADOS

		// CHAMAMOS O MÉTODO "getDestinos()" PARA CADA DESTINO
		for (Destinos d : _destinoDAO.getDestinos()) {
			System.out.println("DESTINO " + d.getLocalViagem());
			System.out.println("VALOR DA VIAGEM " + d.getValorViagem());
			System.out.println("----------------------------------------");
		}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		// CRUD PROMOCOES

		// CRIAÇÃO DOS OBJETOS GLOBAIS PARA MANIPULAÇÃO:
		PromocoesDAO _promocoesDAO = new PromocoesDAO();
		Promocoes _promocoes = new Promocoes();

		// CREATE - CRIAÇÃO DO PROMOCOES
		_promocoes.setLocalViagem("Londres, Inglaterra");
		_promocoes.setValorViagem(9869);

		// SAVE - SALVAR O PROMOCOES
		_promocoesDAO.save(_promocoes);

		// UPDATE - ATUALIZA O PROMOCOES COM ID = 1 COM OS DADOS DO OBJETO _promocoes1.

		// CRIAÇÃO DO OBJETO PARA SETAR
		Promocoes _promocoes1 = new Promocoes();
		_promocoes1.setIdPromocao(15);
		_promocoes1.setLocalViagem("");
		_promocoes1.setValorViagem(0);

		// CHAMADA DE UPDATE PARA ATUALIZAR
		_promocoesDAO.update(_promocoes1);

		// DELETE - CHAMAMOS O MÉTODO E PASSAMOS O "ID" QUE SERÁ EXCLUÍDO:
		_promocoesDAO.removeById(15);

		// READ - LISTA TODOS OS PROMOCOES DO BANCO DE DADOS

		// CHAMAMOS O MÉTODO "getPromocoes()" PARA CADA DESTINO-PROMOCAO
		for (Promocoes p : _promocoesDAO.getPromocoes()) {
			System.out.println("DESTINO " + p.getLocalViagem());
			System.out.println("VALOR DA VIAGEM " + p.getValorViagem());
			System.out.println("----------------------------------------");
		}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		// CRUD HOTEIS

		// CRIAÇÃO DOS OBJETOS GLOBAIS PARA MANIPULAÇÃO:
		HoteisDAO _hoteisDAO = new HoteisDAO();
		Hoteis _hoteis = new Hoteis();

		// CREATE - CRIAÇÃO DO HOTEIS
		_hoteis.setLocalHotel("Katikies Garden Hotel - Santorini, Grécia");
		;
		_hoteis.setValorHospedagem(1100);

		// SAVE - SALVAR O HOTEIS
		_hoteisDAO.save(_hoteis);

		// UPDATE - ATUALIZA O HOTEIS COM ID = 1 COM OS DADOS DO OBJETO _hoteis1.

		// CRIAÇÃO DO OBJETO PARA SETAR
		Hoteis _hoteis1 = new Hoteis();
		_hoteis1.setIdHotel(15);
		_hoteis1.setLocalHotel("");
		_hoteis1.setValorHospedagem(0);

		// CHAMADA DE UPDATE PARA ATUALIZAR
		_hoteisDAO.update(_hoteis1);

		// DELETE - CHAMAMOS O MÉTODO E PASSAMOS O "ID" QUE SERÁ EXCLUÍDO:
		_hoteisDAO.removeById(15);

		// READ - LISTA TODOS OS HOTEIS DO BANCO DE DADOS

		// CHAMAMOS O MÉTODO "getHoteis()" PARA CADA HOTEIS
		for (Hoteis h : _hoteisDAO.getHoteis()) {
			System.out.println("DESTINO " + h.getLocalHotel());
			System.out.println("VALOR DA VIAGEM " + h.getValorHospedagem());
			System.out.println("----------------------------------------");
		}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		

//CRUD VOOS

		// CRIAÇÃO DOS OBJETOS GLOBAIS PARA MANIPULAÇÃO:
		VoosDAO _voosDAO = new VoosDAO();
		Voos _voos = new Voos();

		// CREATE - CRIAÇÃO DO VOOS
		_voos.setLinhaAerea("Latam");
		_voos.setOrigem("Rio de Janeiro");
		_voos.setDestino("Santorini, Grécia	");
		_voos.setPartida(new Date());
		_voos.setChegada(new Date());
		_voos.setParadas(4);
		_voos.setValorVoo(6007);

		// SAVE - SALVAR O VOOS
		_voosDAO.save(_voos);

		// UPDATE - ATUALIZA O VOOS COM ID = 1 COM OS DADOS DO OBJETO _voos1.

		// CRIAÇÃO DO OBJETO PARA SETAR
		Voos _voos1 = new Voos();
		_voos1.setIdVoo(20);
		_voos.setLinhaAerea("");
		_voos1.setOrigem("");
		_voos1.setDestino("");
		_voos1.setPartida(new Date());
		_voos1.setChegada(new Date());
		_voos1.setParadas(0);
		_voos1.setValorVoo(0);

		// CHAMADA DE UPDATE PARA ATUALIZAR
		_voosDAO.update(_voos1);

		// DELETE - CHAMAMOS O MÉTODO E PASSAMOS O "ID" QUE SERÁ EXCLUÍDO:
		_voosDAO.removeById(20);

		// READ - LISTA TODOS OS VOOS DO BANCO DE DADOS

		// CHAMAMOS O MÉTODO "getVoos()" PARA CADA VOOS
		for (Voos v : _voosDAO.getVoos()) {
			System.out.println("LINHA AÉREA " + v.getLinhaAerea());
			System.out.println("ORIGEM " + v.getOrigem());
			System.out.println("DESTINO " + v.getDestino());
			System.out.println("PARTIDA " + v.getPartida());
			System.out.println("CHEGADA " + v.getChegada());
			System.out.println("PARADAS " + v.getParadas());
			System.out.println("PREÇO " + v.getValorVoo());
			System.out.println("----------------------------------------");
		}

	}

}