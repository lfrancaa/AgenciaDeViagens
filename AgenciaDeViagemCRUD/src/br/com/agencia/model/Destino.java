package br.com.agencia.model;

import java.util.Set;

public class Destino {
	
	private Integer Destino;
    private String LocalViagem;
    private float ValorViagem;
    private Set<Checkout> checkout;
    
    
    //                          Operations                                  
    
    public Integer getDestino() {
		return Destino;
	}
	public void setDestino(Integer destino) {
		Destino = destino;
	}
	public String getLocalViagem() {
		return LocalViagem;
	}
	public void setLocalViagem(String localViagem) {
		LocalViagem = localViagem;
	}
	public float getValorViagem() {
		return ValorViagem;
	}
	public void setValorViagem(float valorViagem) {
		ValorViagem = valorViagem;
	}
	public Set<Checkout> getCheckout() {
		return checkout;
	}
	public void setCheckout(Set<Checkout> checkout) {
		this.checkout = checkout;
	}
	public void ShowDestinos() {       
    }
	public int getid() {
		// TODO Auto-generated method stub
		return 0;
	}
	public void getValorViagem(double d, int i) {
		// TODO Auto-generated method stub
		
	}
	public void setId(int int1) {
		// TODO Auto-generated method stub
		
	}
	public void add(Destino destino2) {
		// TODO Auto-generated method stub
		
	}
}
