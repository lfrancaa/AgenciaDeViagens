package modelo;

public class Promocoes {

	private int IdPromocao;
	private String LocalViagem;
	private double ValorViagem;

	public Promocoes(int _IdPromocao, String _LocalViagem, double _ValorViagem) {

		this.IdPromocao = _IdPromocao;
		this.LocalViagem = _LocalViagem;
		this.ValorViagem = _ValorViagem;
	}

	public Promocoes() {

	}

	public int getIdPromocao() {
		return this.IdPromocao;
	}

	public void setIdPromocao(int _IdPromocao) {
		this.IdPromocao = _IdPromocao;
	}

	public String getLocalViagem() {
		return this.LocalViagem;
	}

	public void setLocalViagem(String _LocalViagem) {
		this.LocalViagem = _LocalViagem;
	}

	public double getValorViagem() {
		return this.ValorViagem;
	}

	public void setValorViagem(double _ValorViagem) {
		this.ValorViagem = _ValorViagem;
	}
}