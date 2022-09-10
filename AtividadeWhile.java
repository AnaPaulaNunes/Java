package Turma58;

import java.util.Scanner;

public class AtividadeWhile {

	public static void main(String[] args) {
		
		/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99.
		 */
	
		int idade, cont21 = 0, cont50 = 0;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nEntre com uma idade: ");
		idade = leia.nextInt();
		
		while (idade !=-99) {
			if (idade < 21) {
				cont21++;	
				
			} else if (idade > 50){
				cont50++;
			
			}
			System.out.println("\nEntre com uma idade: ");
			idade = leia.nextInt();
			
		}		
		
		System.out.println("\nTemos "+cont21+" idades menor de 21 anos.");
		System.out.println("\nTemos "+cont50+" idades acima de 50 anos.");
		
	
	}

}
