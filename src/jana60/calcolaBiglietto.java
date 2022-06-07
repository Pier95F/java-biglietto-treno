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
		System.out.print("Prezzo del biglietto : " + prezzoBiglietto);
		
 
	    
		
	}
	}


