package jana60;

import java.util.Scanner;

public class calcolaBiglietto {

	public static void main(String[] args) {

		//variabili
		int età;
		int kmViaggio;
		Scanner scan = new Scanner(System.in);
		
		// Inserimento età
		System.out.print("Inserisci la tua età: ");
		età = scan.nextInt();
		
		// Inserimento km viaggio
		System.out.print("Inserisci i km da percorrere: ");
		kmViaggio = scan.nextInt();
		
		// Restituisci prezzo iniziale
		float prezzoBiglietto = (float) (kmViaggio * 0.21);
		System.out.println ("Prezzo del biglietto : " + prezzoBiglietto);
		
	
		// Applica sconto sul biglietto
		if (età <18) {
			float bigliettoUnder = (float) (prezzoBiglietto - prezzoBiglietto * 0.2);
			System.out.printf ("Prezzo scontato : %.2f " , bigliettoUnder);
		} else if (età >65) {
			float bigliettoOver = (float) (prezzoBiglietto - prezzoBiglietto * 0.4);
			System.out.printf ("Prezzo scontato : %.2f " , bigliettoOver);
		}
		
 
	}
	}


