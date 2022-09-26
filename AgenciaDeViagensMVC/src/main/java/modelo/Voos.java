package modelo;

import java.util.Date;

public class Voos {

	private int IdVoo;
	private String LinhaAerea;
	private String Origem;
	private String Destino;
	private String Partida;
	private String Chegada;
	private String Paradas;
	private String ValorVoo;

	public Voos(int _IdVoo, String _LinhaAerea, String _Origem, String _Destino, String _Partida, String _Chegada,
			String _Paradas, String _ValorVoo) {

		this.IdVoo = _IdVoo;
		this.LinhaAerea = _LinhaAerea;
		this.Origem = _Origem;
		this.Destino = _Destino;
		this.Partida = _Partida;
		this.Chegada = _Chegada;
		this.Paradas = _Paradas;
		this.ValorVoo = _ValorVoo;

	}

	public Voos() {

	}

	public int getIdVoo() {
		return this.IdVoo;
	}

	public void setIdVoo(int _IdVoo) {
		this.IdVoo = _IdVoo;
	}

	public String getLinhaAerea() {
		return this.LinhaAerea;
	}

	public void setLinhaAerea(String _LinhaAerea) {
		this.LinhaAerea = _LinhaAerea;
	}

	public String getOrigem() {
		return this.Origem;
	}

	public void setOrigem(String _Origem) {
		this.Origem = _Origem;
	}

	public String getDestino() {
		return this.Destino;
	}

	public void setDestino(String _Destino) {
		this.Destino = _Destino;
	}

	public String getPartida() {
		return this.Partida;
	}

	public void setPartida(String _Partida) {
		this.Partida = _Partida;
	}

	public String getChegada() {
		return this.Chegada;
	}

	public void setChegada(String _Chegada) {
		this.Chegada = _Chegada;
	}

	public String getParadas() {
		return this.Paradas;
	}

	public void setParadas(String _Paradas) {
		this.Paradas = _Paradas;
	}

	public String getValorVoo() {
		return this.ValorVoo;
	}

	public void setValorVoo(String _ValorVoo) {
		this.ValorVoo = _ValorVoo;
	}

}