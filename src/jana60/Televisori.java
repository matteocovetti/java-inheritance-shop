package jana60;

public class Televisori extends Prodotto {

	// attributi
	private int dimensioni;
	private boolean smart;

	// costruttori
	public Televisori(int codice, String nome, String marca, double prezzo, int iva, int dimesioni, boolean smart) {
		super(codice, nome, marca, prezzo, iva);
		this.dimensioni = dimesioni;
		this.smart = smart;
	}

	// getter e setter
	public int getDimensioni() {
		return dimensioni;
	}

	public void setDimensioni(int dimensioni) {
		this.dimensioni = dimensioni;
	}

	public boolean isSmart() {
		return smart;
	}

	public void setSmart(boolean smart) {
		this.smart = smart;
	}

	@Override
	public String toString() {
		String categoria = "";
		if (smart) {
			categoria = "Smart";
		}
		return super.toString() + " - " + "Dimensioni " + dimensioni + " pollici - " + categoria;
	}

}
