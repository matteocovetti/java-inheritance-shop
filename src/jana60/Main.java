package jana60;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rd = new Random();
		boolean finito = false;

//		Smartphone telefono = new Smartphone(15555616, "IPhone", "Apple", 899.99, 22, 61516818, "128GB");
//
//		System.out.println(telefono);

		System.out.println("Benvenuto nello store!");

		while (!finito) {
			System.out.println(
					"Scrivi 1 per comprare uno smartphone, 2 per un televisore, 3 per delle cuffie, 4 per uscire:");
			String scelta = scan.nextLine();

			switch (scelta) {
			case "1":
				int codiceSmartphone = rd.nextInt(10000000) + 1;
				System.out.print("Inserisci nome prodotto: ");
				String nomeSmartphone = scan.nextLine();
				System.out.print("Inserisci marca prodotto: ");
				String marcaSmartphone = scan.nextLine();
				System.out.print("Inserisci quantità di memoria: ");
				int memoria = Integer.parseInt(scan.nextLine());
				Smartphone nuovoTelefono = new Smartphone(codiceSmartphone, nomeSmartphone, marcaSmartphone, 899.99, 22,
						65485158, memoria);
				System.out.println(nuovoTelefono);
				break;
			case "2":
				int codiceTv = rd.nextInt(10000000) + 1;
				System.out.print("Inserisci nome prodotto: ");
				String nomeTv = scan.nextLine();
				System.out.print("Inserisci marca prodotto: ");
				String marcaTv = scan.nextLine();
				System.out.print("Inserisci dimensioni: ");
				int dimensioni = Integer.parseInt(scan.nextLine());
				Televisori newTv = new Televisori(codiceTv, nomeTv, marcaTv, 1499.99, 22, dimensioni, true);
				System.out.println(newTv);
				break;
			case "3":
				int codiceCuffie = rd.nextInt(10000000) + 1;
				System.out.print("Inserisci nome prodotto: ");
				String nomeCuffie = scan.nextLine();
				System.out.print("Inserisci marca prodotto: ");
				String marcaCuffie = scan.nextLine();
				System.out.print("Inserisci colore: ");
				String colore = scan.nextLine();
				Cuffie newCuffia = new Cuffie(codiceCuffie, nomeCuffie, marcaCuffie, 149.99, 22, colore, true);
				System.out.println(newCuffia);
				break;
			case "4":
				System.out.println("Grazie per avere usato lo store!");
				finito = true;
				break;
			default:
				System.out.println("Scelta non valida");
				break;

			}
		}

		scan.close();
	}

}
