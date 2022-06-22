package jana60;

public class Smartphone extends Prodotto {

	// attributi
	private long imei;
	private String memoria;

	// costruttori
	public Smartphone(int codice, String nome, String marca, double prezzo, int iva, long imei, String memoria) {
		super(codice, nome, marca, prezzo, iva);
		this.imei = imei;
		this.memoria = memoria;

	}

	// getter e setter
	public String getMemoria() {
		return memoria;
	}

	public void setMemoria(String memoria) {
		this.memoria = memoria;
	}

	public long getImei() {
		return imei;
	}

	// override
	@Override
	public String toString() {
		return super.toString() + " - " + "IMEI: " + imei + " - " + "Memoria di: " + memoria;
	}

}
