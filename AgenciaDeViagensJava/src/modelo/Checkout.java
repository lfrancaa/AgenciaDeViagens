package modelo;

public class Checkout {

	private int IdCheckout;
	private String Nome;
	private String Sobrenome;
	private String Email;
	private String Endereco;
	private String Complemento;
	private String Pais;
	private String Estado;
	private String Cep;
	private double PrecoPassagem;
	private boolean FormasPagamento;
	private Hoteis Hoteis;
	private Voos Voos;
	private Promocoes Promocoes;
	private Destinos Destinos;

	public Checkout(int _IdCheckout, String _Nome, String _Sobrenome, String _Email, String _Endereco,
			String _Complemento, String _Pais, String _Estado, String _Cep, double _PrecoPassagem,
			boolean _FormasPagamento, Hoteis _Hoteis, Voos _Voos, Promocoes _Promocoes, Destinos _Destinos) {

		this.IdCheckout = _IdCheckout;
		this.Nome = _Nome;
		this.Sobrenome = _Sobrenome;
		this.Email = _Email;
		this.Endereco = _Endereco;
		this.Complemento = _Complemento;
		this.Pais = _Pais;
		this.Estado = _Estado;
		this.Cep = _Cep;
		this.PrecoPassagem = _PrecoPassagem;
		this.FormasPagamento = _FormasPagamento;
		this.Hoteis = _Hoteis;
		this.Voos = _Voos;
		this.Promocoes = _Promocoes;
		this.Destinos = _Destinos;

	}

	public Checkout() {

	}

	public int getIdCheckout() {
		return this.IdCheckout;
	}

	public void setIdCheckout(int _IdCheckout) {
		this.IdCheckout = _IdCheckout;
	}

	public String getNome() {
		return this.Nome;
	}

	public void setNome(String _Nome) {
		this.Nome = _Nome;
	}

	public String getSobrenome() {
		return this.Sobrenome;
	}

	public void setSobrenome(String _Sobrenome) {
		this.Sobrenome = _Sobrenome;
	}

	public String getEmail() {
		return this.Email;
	}

	public void setEmail(String _Email) {
		this.Email = _Email;
	}

	public String getEndereco() {
		return this.Endereco;
	}

	public void setEndereco(String _Endereco) {
		this.Endereco = _Endereco;
	}

	public String getComplemento() {
		return this.Complemento;
	}

	public void setComplemento(String _Complemento) {
		this.Complemento = _Complemento;
	}

	public String getPais() {
		return this.Pais;
	}

	public void setPais(String _Pais) {
		this.Pais = _Pais;
	}

	public String getEstado() {
		return this.Estado;
	}

	public void setEstado(String _Estado) {
		this.Estado = _Estado;
	}

	public String getCep() {
		return this.Cep;
	}

	public void setCep(String _Cep) {
		this.Cep = _Cep;
	}

	public double getPrecoPassagem() {
		return this.PrecoPassagem;
	}

	public void setPrecoPassagem(double _PrecoPassagem) {
		this.PrecoPassagem = _PrecoPassagem;
	}

	public boolean getFormasPagamento() {
		return this.FormasPagamento;
	}

	public void setFormasPagamento(boolean _FormasPagamento) {
		this.FormasPagamento = _FormasPagamento;
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

	public Promocoes getPromocoes() {
		return this.Promocoes;
	}

	public void setPromocoes(Promocoes _Promocoes) {
		this.Promocoes = _Promocoes;
	}

	public Destinos getDestinos() {
		return this.Destinos;
	}

	public void setDestinos(Destinos _Destinos) {
		this.Destinos = _Destinos;
	}
}