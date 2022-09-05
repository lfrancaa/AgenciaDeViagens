package br.com.agencia.model;

import java.util.Set;

public class Voos {
	
	private Integer Voo;
    private String LinhaAerea;
    private String Origem;
    private String Destino;
    private Date Partida;
    private Date Chegada;
    private Double Paradas;
    private Double ValorVoo;
    private Set<Checkout> checkout;     
    //                          Operations                                  
    
    public Integer getVoo() {
		return Voo;
	}
	public void setVoo(Integer voo) {
		Voo = voo;
	}
	public String getLinhaAerea() {
		return LinhaAerea;
	}
	public void setLinhaAerea(String linhaAerea) {
		LinhaAerea = linhaAerea;
	}
	public String getOrigem() {
		return Origem;
	}
	public void setOrigem(String origem) {
		Origem = origem;
	}
	public String getDestino() {
		return Destino;
	}
	public void setDestino(String destino) {
		Destino = destino;
	}
	public Float getPartida() {
		return Partida;
	}
	public void setPartida(Float partida) {
		Partida = partida;
	}
	public Float getChegada() {
		return Chegada;
	}
	public void setChegada(Float chegada) {
		Chegada = chegada;
	}
	public Double getParadas() {
		return Paradas;
	}
	public void setParadas(Double paradas) {
		Paradas = paradas;
	}
	public Double getValorVoo() {
		return ValorVoo;
	}
	public void setValorVoo(Double valorVoo) {
		ValorVoo = valorVoo;
	}
	public Set<Checkout> getCheckout() {
		return checkout;
	}
	public void setCheckout(Set<Checkout> checkout) {
		this.checkout = checkout;
	}
	public void ShowVoos() {
    }
	public int getid() {
		// TODO Auto-generated method stub
		return 0;
	}
	public void getPartida(int i) {
		// TODO Auto-generated method stub
		
	}
	public void getChegada(int i) {
		// TODO Auto-generated method stub
		
	}
	public void getParadas(int i) {
		// TODO Auto-generated method stub
		
	}
	public void getValorVoo(double d, int i) {
		// TODO Auto-generated method stub
		
	}
	public void getChegada(int i) {
		// TODO Auto-generated method stub
		
	}
	public void getChegada(int i) {
		// TODO Auto-generated method stub
		
	}
	public void setId(int int1) {
		// TODO Auto-generated method stub
		
	}
	public void setPartida(double double1) {
		// TODO Auto-generated method stub
		
	}
	public void setChegada(double double1) {
		// TODO Auto-generated method stub
		
	}
	public void add(Voos voos) {
		// TODO Auto-generated method stub
		
	}
}
