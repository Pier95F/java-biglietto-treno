package jana60;

import java.util.Scanner;

public class calcolaBiglietto {

	public static void main(String[] args) {

		//variabili
		int et�;
		int kmViaggio;
		Scanner scan = new Scanner(System.in);
		
		// Inserimento et�
		System.out.print("Inserisci la tua et�: ");
		et� = scan.nextInt();
		
		// Inserimento km viaggio
		System.out.print("Inserisci i km da percorrere: ");
		kmViaggio = scan.nextInt();
		
		// Restituisci prezzo iniziale
		float prezzoBiglietto = (float) (kmViaggio * 0.21);
		System.out.print("Prezzo del biglietto : " + prezzoBiglietto);
		
 
	    
		
	}
	}


