package modelo;

import java.util.ArrayList;
import java.util.Date;

public class Passagens {

	private int IdPassagem;
	private Passageiros Passageiros;
	private Destinos Destinos;
	private Promocoes Promocoes;
	private Hoteis Hoteis;
	private Voos Voos;
	private String HoraViagem;
	private String NomeLocalOrigem;
	private String NomeLocalDestino;
	private String DataViagemIda;
	private String DataViagemVolta;
	private double total;

	private ArrayList<Checkout> itens = new ArrayList<Checkout>();

	public Passagens(int _IdPassagem, Passageiros _Passageiros, Destinos _Destinos, Promocoes _Promocoes,
			Hoteis _Hoteis, Voos _Voos, String _HoraViagem, String _NomeLocalOrigem, String _NomeLocalDestino,
			String _DataViagemIda, String _DataViagemVolta) {

		this.IdPassagem = _IdPassagem;
		this.Passageiros = _Passageiros;
		this.Destinos = _Destinos;
		this.Promocoes = _Promocoes;
		this.Hoteis = _Hoteis;
		this.Voos = _Voos;
		this.HoraViagem = _HoraViagem;
		this.NomeLocalOrigem = _NomeLocalOrigem;
		this.NomeLocalDestino = _NomeLocalDestino;
		this.DataViagemIda = _DataViagemIda;
		this.DataViagemVolta = _DataViagemVolta;
	}

	public Passagens() {

	}

	public int getIdPassagem() {
		return this.IdPassagem;
	}

	public void setIdPassagem(int _IdPassagem) {
		this.IdPassagem = _IdPassagem;
	}

	public String getHoraViagem() {
		return this.HoraViagem;
	}

	public void setHoraViagem(String _HoraViagem) {
		this.HoraViagem = _HoraViagem;
	}

	public String getNomeLocalOrigem() {
		return this.NomeLocalOrigem;
	}

	public void setNomeLocalOrigem(String _NomeLocalOrigem) {
		this.NomeLocalOrigem = _NomeLocalOrigem;
	}

	public String getNomeLocalDestino() {
		return this.NomeLocalDestino;
	}

	public void setNomeLocalDestino(String _NomeLocalDestino) {
		this.NomeLocalDestino = _NomeLocalDestino;
	}

	public String getDataViagemIda() {
		return this.DataViagemIda;
	}

	public void setDataViagemIda(String _DataViagemIda) {
		this.DataViagemIda = _DataViagemIda;
	}

	public String getDataViagemVolta() {
		return this.DataViagemVolta;
	}

	public void setDataViagemVolta(String _DataViagemVolta) {
		this.DataViagemVolta = _DataViagemVolta;
	}

	public Passageiros getPassageiros() {
		return this.Passageiros;
	}

	public void setPassageiros(Passageiros _Passageiros) {
		this.Passageiros = _Passageiros;
	}

	public Destinos getDestinos() {
		return this.Destinos;
	}

	public void setDestinos(Destinos _Destinos) {
		this.Destinos = _Destinos;
	}

	public Promocoes getPromocoess() {
		return this.Promocoes;
	}

	public void setPromocoes(Promocoes _Promocoes) {
		this.Promocoes = _Promocoes;
	}

	public Hoteis getHoteis() {
		return this.Hoteis;
	}

	public void setHoteis(Hoteis _Hoteis) {
		this.Hoteis = _Hoteis;
	}

	public Voos getVoos() {
		return this.Voos;
	}

	public void setVoos(Voos _Voos) {
		this.Voos = _Voos;
	}

	// Item Checkout

	public void AdicionarItem(Checkout _item) {
		itens.add(_item);
	}

	public void RemoverItem(Checkout _item) {
		itens.remove(_item);
	}

	public ArrayList<Checkout> getItens() {
		return itens;
	}

	//public void calcularPedido() {
//		for (Checkout item : itens) {
	//		this.total += item.getPrecoPassagem();
	//	}

//	}

	public void mostrarPedido() {
		for (Checkout item : itens) {
			System.out.println("Id: " + item.getIdCheckout() + " Valor: " + item.getPrecoPassagem());

		}
	}
}