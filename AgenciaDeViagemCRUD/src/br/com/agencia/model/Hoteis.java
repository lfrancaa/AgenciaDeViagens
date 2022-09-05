package br.com.agencia.model;

import java.util.Set;

public class Hoteis<Checkin> {
	
	private Integer Hoteis;
    private Date Checkin;
    private Double Noites;
    private Double Adultos;
    private Double ValorHospedagem;
    private Set<Checkout> checkout;
    
    
    
    //                          Operations                                  
    
    public Integer getHoteis() {
		return Hoteis;
	}



	public void setHoteis(Integer hoteis) {
		Hoteis = hoteis;
	}



	public Double getCheckin() {
		return Checkin;
	}



	public <Checkin> void setCheckin(Double checkin) {
		Checkin = checkin;
	}



	public Double getNoites() {
		return Noites;
	}



	public void setNoites(Double noites) {
		Noites = noites;
	}



	public Double getAdultos() {
		return Adultos;
	}



	public void setAdultos(Double adultos) {
		Adultos = adultos;
	}



	public Double getValorHospedagem() {
		return ValorHospedagem;
	}



	public void setValorHospedagem(Double valorHospedagem) {
		ValorHospedagem = valorHospedagem;
	}



	public Set<Checkout> getCheckout() {
		return checkout;
	}



	public void setCheckout(Set<Checkout> checkout) {
		this.checkout = checkout;
	}



	public void ShowHoteis() {
    }



	public int getid() {
		// TODO Auto-generated method stub
		return 0;
	}



	public void getHoteis(String string) {
		// TODO Auto-generated method stub
		
	}



	public void getCheckin(int i) {
		// TODO Auto-generated method stub
		
	}



	public void getNoites(int i) {
		// TODO Auto-generated method stub
		
	}



	public void getAdultos(int i) {
		// TODO Auto-generated method stub
		
	}



	public void getValorHospedagem(int i, int j) {
		// TODO Auto-generated method stub
		
	}



	public void setAdultos(String string) {
		// TODO Auto-generated method stub
		
	}



	public void setValorHospedagem(String string) {
		// TODO Auto-generated method stub
		
	}



	public void setChekin(double double1) {
		// TODO Auto-generated method stub
		
	}



	public void setHoteis(String string) {
		// TODO Auto-generated method stub
		
	}



	public void setId(int int1) {
		// TODO Auto-generated method stub
		
	}



	public void add(Hoteis hoteis2) {
		// TODO Auto-generated method stub
		
	}

}
