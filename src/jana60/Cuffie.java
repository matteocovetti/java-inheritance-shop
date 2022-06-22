package jana60;

public class Cuffie extends Prodotto {

	// attributi
	private String colore;
	private boolean wireless;

	// costruttore
	public Cuffie(int codice, String nome, String marca, double prezzo, int iva, String colore, boolean wireless) {
		super(codice, nome, marca, prezzo, iva);
		this.colore = colore;
		this.wireless = wireless;
	}

	// getter e setter
	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

	public boolean isWireless() {
		return wireless;
	}

	public void setWireless(boolean wireless) {
		this.wireless = wireless;
	}

	// override
	@Override
	public String toString() {
		String categoria = "";
		if (wireless) {
			categoria = "Wireless";
		} else {
			categoria = "Cablate";
		}
		return super.toString() + "Colore cuffie " + colore + " - " + categoria;
	}

}
