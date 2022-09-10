package Turma58;

import java.util.Scanner;

public class AtividadeDoWhile {

	public static void main(String[] args) {
		
		/*Crie um programa que leia um número do teclado até que encontre um
 		número igual a zero. No final, mostre a soma dos números
		digitados.
		 */
		
		float numeros, somaNumeros = 0;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nEntre com um número maior que 0: ");
		numeros = leia.nextFloat();
		
		do {
			
			if (numeros == 0) {
				System.out.println("\nPrograma finalizado!");
			}
			else if (numeros > 0) {
					somaNumeros += numeros;	
			}	
			
			System.out.println("\nEntre com um número maior que 0: ");
			numeros = leia.nextFloat();
			
		} while (numeros != 0);
		
		System.out.println("\nA soma doa números informados é: "+somaNumeros);
		
	}
}
				
			

