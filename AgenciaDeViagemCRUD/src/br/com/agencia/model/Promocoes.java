package br.com.agencia.model;

import java.util.Set;

public class Promocoes {
	
	private Integer Promocao;
    private String LocalViagem;
    private Double ValorViagem;
    private Set<Checkout> checkout;   

    //                          Operations                                  
    
    public Integer getPromocao() {
		return Promocao;
	}
	public void setPromocao(Integer promocao) {
		Promocao = promocao;
	}
	public String getLocalViagem() {
		return LocalViagem;
	}
	public void setLocalViagem(String localViagem) {
		LocalViagem = localViagem;
	}
	public Double getValorViagem() {
		return ValorViagem;
	}
	public void setValorViagem(Double valorViagem) {
		ValorViagem = valorViagem;
	}
	public Set<Checkout> getCheckout() {
		return checkout;
	}
	public void setCheckout(Set<Checkout> checkout) {
		this.checkout = checkout;
	}
	public void ShowPromocoes() {
    }
	public int getid() {
		// TODO Auto-generated method stub
		return 0;
	}
	public void add(Promocoes promocoes) {
		// TODO Auto-generated method stub
		
	}
	public void setValorViagem(float float1) {
		// TODO Auto-generated method stub
		
	}
	public void setId(int int1) {
		// TODO Auto-generated method stub
		
	}
}
