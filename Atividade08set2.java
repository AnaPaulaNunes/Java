package Turma58;

import java.util.Scanner;

public class Atividade08set2 {

	public static void main(String[] args) {
		
		/*Faça um programa que receba três inteiros e diga qual deles é o maior.		 
		 */
		
		float num = 0, maior = 0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com o primeiro número: ");
		num = leia.nextFloat();
		System.out.println("\nEntre com o segundo número: ");
		num = leia.nextFloat();
		System.out.println("\nEscreva o terceiro número: ");
		num = leia.nextFloat();
		
		if(num > maior) {
			maior = num;			
		}
		
		System.out.println("\nO maior número é: " + maior);
		
		
		
		
		
		
	

	}

}
