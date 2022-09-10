package Turma58;

import java.util.Scanner;

public class AtividadeFor {

	public static void main(String[] args) {
	
		/*Ler 10 números e imprimir quantos são pares e quantos são ímpares.
		 */
		
		int num, contPar = 0, contImp = 0;
		int x;
		
		Scanner leia = new Scanner(System.in);
		
		for(x=1;x<=4;x++) {
		
		System.out.println("\nEntre com um número: ");
		num = leia.nextInt();
				
		if(num % 2 == 0) {
			contPar++;
		}
		else {
			contImp++;
		}
			
		}
	System.out.println("\nTemos: "+contPar+" números pares.");
	System.out.println("\nTemos: "+contImp+" numeros ímpares.");
	}
}
