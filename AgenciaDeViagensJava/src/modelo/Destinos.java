package modelo;

public class Destinos {

	private int IdDestino;
	private String LocalViagem;
	private double ValorViagem;

	public Destinos(int _IdDestino, String _LocalViagem, double _ValorViagem) {

		this.IdDestino = _IdDestino;
		this.LocalViagem = _LocalViagem;
		this.ValorViagem = _ValorViagem;
	}

	public Destinos() {

	}

	public int getIdDestino() {
		return this.IdDestino;
	}

	public void setIdDestino(int _IdDestino) {
		this.IdDestino = _IdDestino;
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