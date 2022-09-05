package br.com.agencia.model;

import java.util.Set;

public class Passagens {
	
private Integer Passagem;
    private Double HoraViagem;
    private String NomeLocalOrigem;
    private String NomeLocalDestino;
    private Double DataViagemIda;
    private Double DataViagemVolta;
    private Passageiros passageiros;
    private Checkout checkout;
	
    public Integer getPassagem() {
		return Passagem;
	}
	public void setPassagem(Integer passagem) {
		Passagem = passagem;
	}
	public Double getHoraViagem() {
		return HoraViagem;
	}
	public void setHoraViagem(Double horaViagem) {
		HoraViagem = horaViagem;
	}
	public String getNomeLocalOrigem() {
		return NomeLocalOrigem;
	}
	public void setNomeLocalOrigem(String nomeLocalOrigem) {
		NomeLocalOrigem = nomeLocalOrigem;
	}
	public String getNomeLocalDestino() {
		return NomeLocalDestino;
	}
	public void setNomeLocalDestino(String nomeLocalDestino) {
		NomeLocalDestino = nomeLocalDestino;
	}
	public Double getDataViagemIda() {
		return DataViagemIda;
	}
	public void setDataViagemIda(Double dataViagemIda) {
		DataViagemIda = dataViagemIda;
	}
	public Double getDataViagemVolta() {
		return DataViagemVolta;
	}
	public void setDataViagemVolta(Double dataViagemVolta) {
		DataViagemVolta = dataViagemVolta;
	}
	public Passageiros getPassageiros() {
		return passageiros;
	}
	public void setPassageiros(Passageiros passageiros) {
		this.passageiros = passageiros;
	}
	public Checkout getCheckout() {
		return checkout;
	}
	public void setCheckout(Checkout checkout) {
		this.checkout = checkout;
	}
	public int getid() {
		// TODO Auto-generated method stub
		return 0;
	}
	public void getNomeLocalOrigem(String string) {
		// TODO Auto-generated method stub
		
	}
	public void getDataViagemIda(int i) {
		// TODO Auto-generated method stub
		
	}
	public void getNomeLocalDestino(String string) {
		// TODO Auto-generated method stub
		
	}
	public void getDataViagemVolta(int i) {
		// TODO Auto-generated method stub
		
	}
	public void getHoraViagem(int i) {
		// TODO Auto-generated method stub
		
	}
	public void setId(int int1) {
		// TODO Auto-generated method stub
		
	}
	public void add(Passagens passagens) {
		// TODO Auto-generated method stub
		
	}
}
