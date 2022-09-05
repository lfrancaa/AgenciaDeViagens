package br.com.agencia.model;

import java.util.Set;

public class Checkout {
	    private Integer Checkout;
	    private String Nome;
	    private String Sobrenome;
	    private String Email;
	    private String Endereco;
	    private String Complemento;	    
	    private String Pais;	    
	    private String Estado;
	    private Double Cep;	    
	    private Double PrecoPassagem;    	 
	    private String FormasPagamento;	    
	    private Set<Passagens> passagens;	    	
	    private Promocoes promocoes;	       
	    private Destinos destinos;      
	    private Hoteis hoteis;    
	    private Voos voos;
	    
	    
	    
	    public Integer getCheckout() {
			return Checkout;
		}
		public void setCheckout(Integer checkout) {
			Checkout = checkout;
		}
		public String getNome() {
			return Nome;
		}
		public void setNome(String nome) {
			Nome = nome;
		}
		public String getSobrenome() {
			return Sobrenome;
		}
		public void setSobrenome(String sobrenome) {
			Sobrenome = sobrenome;
		}
		public String getEmail() {
			return Email;
		}
		public void setEmail(String email) {
			Email = email;
		}
		public String getEndereco() {
			return Endereco;
		}
		public void setEndereco(String endereco) {
			Endereco = endereco;
		}
		public String getComplemento() {
			return Complemento;
		}
		public void setComplemento(String complemento) {
			Complemento = complemento;
		}
		public String getPais() {
			return Pais;
		}
		public void setPais(String pais) {
			Pais = pais;
		}
		public String getEstado() {
			return Estado;
		}
		public void setEstado(String estado) {
			Estado = estado;
		}
		public Double getCep() {
			return Cep;
		}
		public void setCep(Double cep) {
			Cep = cep;
		}
		public Double getPrecoPassagem() {
			return PrecoPassagem;
		}
		public void setPrecoPassagem(Double precoPassagem) {
			PrecoPassagem = precoPassagem;
		}
		public String getFormasPagamento() {
			return FormasPagamento;
		}
		public void setFormasPagamento(String formasPagamento) {
			FormasPagamento = formasPagamento;
		}
		public Set<Passagens> getPassagens() {
			return passagens;
		}
		public void setPassagens(Set<Passagens> passagens) {
			this.passagens = passagens;
		}
		public Promocoes getPromocoes() {
			return promocoes;
		}
		public void setPromocoes(Promocoes promocoes) {
			this.promocoes = promocoes;
		}
		public Destinos getDestinos() {
			return destinos;
		}
		public void setDestinos(Destinos destinos) {
			this.destinos = destinos;
		}
		public Hoteis getHoteis() {
			return hoteis;
		}
		public void setHoteis(Hoteis hoteis) {
			this.hoteis = hoteis;
		}
		public Voos getVoos() {
			return voos;
		}
		public void setVoos(Voos voos) {
			this.voos = voos;
		}
		      
	    

	    //                          Operations                                  
	    
	    public void AddDestinos() {
	    }
	    public void AddPromocoes() {
	    }
	    public void AddVoos() {
	    }
	    public void AddHoteis() {   
	    }
	    public void AddPrecoPassagem() {     
	    }
		public int getid() {
			// TODO Auto-generated method stub
			return 0;
		}
		public void getSobrenome(String string) {
			// TODO Auto-generated method stub
			
		}
		public void getNome(String string) {
			// TODO Auto-generated method stub
			
		}
		public void getEmail(String string) {
			// TODO Auto-generated method stub
			
		}
		public void getEndereco(String string) {
			// TODO Auto-generated method stub
			
		}
		public void getComplemento(String string) {
			// TODO Auto-generated method stub
			
		}
		public void getPais(String string) {
			// TODO Auto-generated method stub
			
		}
		public void getCep(int i) {
			// TODO Auto-generated method stub
			
		}
		public void getEstado(String string) {
			// TODO Auto-generated method stub
			
		}
		public void getPrecoPassagem(double d, int i) {
			// TODO Auto-generated method stub
			
		}
		public void getFormasPagamento(String string) {
			// TODO Auto-generated method stub
			
		}
		public void setId(int int1) {
			// TODO Auto-generated method stub
			
		}
		public void setSobrenome(int int1) {
			// TODO Auto-generated method stub
			
		}
		public void setCep(String string) {
			// TODO Auto-generated method stub
			
		}
		public void add(Checkout checkout2) {
			// TODO Auto-generated method stub
			
		}
		public void update(Checkout c1) {
			// TODO Auto-generated method stub
			
		}
		
		
}
