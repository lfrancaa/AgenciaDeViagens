package modelo;

import java.util.Date;

public class Passageiros {

	private int IdPassageiro;
	private String Nome;
	private String Rg;
	private String Cpf;
	private String DataNascimento;
	private String Endereco;
	private String Complemento;
	private String Cep;
	private String Estado;
	private String Email;
	private String Telefone;


	public Passageiros(int _IdPassageiro, String _Nome, String _Rg, String _Cpf, String _DataNascimento, String _Endereco,
			String _Complemento, String _Cep, String _Estado, String _Email, String _Telefone) {

		this.IdPassageiro = _IdPassageiro;
		this.Nome = _Nome;
		this.Rg = _Rg;
		this.Cpf = _Cpf;
		this.DataNascimento = _DataNascimento;
		this.Endereco = _Endereco;
		this.Complemento = _Complemento;
		this.Cep = _Cep;
		this.Estado = _Estado;
		this.Email = _Email;
		this.Telefone = _Telefone;
	}

	public Passageiros() {

	}

	public int getIdPassageiro() {
		return this.IdPassageiro;
	}

	public void setIdPassageiro(int _IdPassageiro) {
		this.IdPassageiro = _IdPassageiro;
	}

	public String getNome() {
		return this.Nome;
	}

	public void setNome(String _Nome) {
		this.Nome = _Nome;
	}

	public String getRg() {
		return this.Rg;
	}

	public void setRg(String _Rg) {
		this.Rg = _Rg;
	}

	public String getCpf() {
		return this.Cpf;
	}

	public void setCpf(String _Cpf) {
		this.Cpf = _Cpf;
	}

	public String getDataNascimento() {
		return this.DataNascimento;
	}

	public void setDataNascimento(String _DataNascimento) {
		this.DataNascimento = _DataNascimento;
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

	public String getCep() {
		return this.Cep;
	}

	public void setCep(String _Cep) {
		this.Cep = _Cep;
	}

	public String getEstado() {
		return this.Estado;
	}

	public void setEstado(String _Estado) {
		this.Estado = _Estado;
	}

	public String getEmail() {
		return this.Email;
	}

	public void setEmail(String _Email) {
		this.Email = _Email;
	}

	public String getTelefone() {
		return this.Telefone;
	}

	public void setTelefone(String _Telefone) {
		this.Telefone = _Telefone;
	}
}