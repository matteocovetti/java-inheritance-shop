package jana60;

import java.text.DecimalFormat;

public class Prodotto {
	/*
	 * Creare la classe Prodotto che gestisce i prodotti dello shop. Un prodotto è
	 * caratterizzato da: - codice (numero intero) - nome - marca - prezzo - iva
	 * Usate opportunamente i livelli di accesso (public, private), i costruttori, i
	 * metodi getter e setter ed eventuali altri metodi di “utilità” per fare in
	 * modo che: - il codice prodotto sia accessibile solo in lettura - gli altri
	 * attributi siano accessibili sia in lettura che in scrittura - il prodotto
	 * esponga un metodo per avere il prezzo comprensivo di iva formattato Lo shop
	 * gestisce diversi tipi di prodotto: - Smarphone, caratterizzati anche dal
	 * codice IMEI e dalla quantità di memoria - Televisori, caratterizzati dalle
	 * dimensioni e dalla proprietà di essere smart oppure no - Cuffie,
	 * caratterizzate dal colore e se sono wireless o cablate Utilizzate
	 * l’ereditarietà per riutilizzare il codice di Prodotto nella stesura delle
	 * classi che gestiscono i vari sotto tipi di prodotto e testate le funzionalità
	 * delle vostre classi in una classe Main con metodo main.
	 */

	DecimalFormat df = new DecimalFormat("0.00€");

	// attributi
	private int codice;
	private String nome;
	private String marca;
	private double prezzo;
	private int iva;

	// costruttori
	public Prodotto(int codice, String nome, String marca, double prezzo, int iva) {
		super();
		this.codice = codice;
		this.nome = nome;
		this.marca = marca;
		this.prezzo = prezzo;
		this.iva = iva;
	}

	// getter e setter
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrezzo() {
		return prezzo;
	}

	void setPrezzo(double prezzo) {
		if (prezzo < 0.0) {
			this.prezzo = -prezzo;
		} else {
			this.prezzo = prezzo;
		}

	}

	public int getIva() {
		return iva;
	}

	public void setIva(int iva) {
		this.iva = iva;
	}

	public int getCodice() {
		return codice;
	}

	// metodi
	public double calcolaPrezzoConIva() {
		return prezzo + prezzo * iva / 100;
	}

	// override
	@Override
	public String toString() {
		return "Grazie per aver aquistato il prodotto " + nome + " della marca " + marca + " al prezzo di "
				+ df.format(calcolaPrezzoConIva());
	}

}
