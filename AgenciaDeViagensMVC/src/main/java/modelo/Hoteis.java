package modelo;

public class Hoteis {

	private int IdHotel;
	private String LocalHotel;
	private String ValorHospedagem;

	public Hoteis(int _IdHotel, String _LocalHotel, String _ValorHospedagem) {

		this.IdHotel = _IdHotel;
		this.LocalHotel = _LocalHotel;
		this.ValorHospedagem = _ValorHospedagem;
	}

	public Hoteis() {

	}

	public int getIdHotel() {
		return this.IdHotel;
	}

	public void setIdHotel(int _IdHotel) {
		this.IdHotel = _IdHotel;
	}

	public String getLocalHotel() {
		return this.LocalHotel;
	}

	public void setLocalHotel(String _LocalHotel) {
		this.LocalHotel = _LocalHotel;
	}

	public String getValorHospedagem() {
		return this.ValorHospedagem;
	}

	public void setValorHospedagem(String _ValorHospedagem) {
		this.ValorHospedagem = _ValorHospedagem;
	}
}