package jana60;

import java.text.DecimalFormat;
import java.util.Scanner;

public class calcolaBiglietto {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		DecimalFormat df = new DecimalFormat ("#0.00");

		//variabili
		int età;
		int kmViaggio;
		
		
		// Inserimento età
		System.out.print("Inserisci la tua età: ");
		età = scanner.nextInt();
		
		// Inserimento km viaggio
		System.out.print("Inserisci i km da percorrere: ");
		kmViaggio = scanner.nextInt();
		
		// Restituisci prezzo iniziale
		float prezzoBiglietto = (float) (kmViaggio * 0.21);	
		System.out.println("Prezzo biglietto : " + df.format(prezzoBiglietto));
	
		// Applica sconto sul biglietto
		if (età <18) {
			float bigliettoUnder = (float) (prezzoBiglietto - prezzoBiglietto * 0.2);
			System.out.println("Hai diritto allo sconto minorenni");
			System.out.println("Prezzo scontato : " + df.format(prezzoBiglietto));
		} else if (età >=65) {
			float bigliettoOver = (float) (prezzoBiglietto - prezzoBiglietto * 0.4);
			System.out.println("Hai diritto allo sconto over65");
			System.out.println("Prezzo scontato : " + df.format(prezzoBiglietto));
		}
		
		scanner.close();
		
	}
	}


