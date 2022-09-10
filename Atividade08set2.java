package Turma58;

import java.util.Scanner;

public class Atividade08set2 {

	public static void main(String[] args) {
		
		/*Faça um programa que receba três inteiros e diga qual deles é o maior.		 
		 */
		
		float num1, num2, num3, maior = 0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com o primeiro número: ");
		num1 = leia.nextFloat();
		System.out.println("\nEntre com o segundo número: ");
		num2 = leia.nextFloat();
		System.out.println("\nEscreva o terceiro número: ");
		num3 = leia.nextFloat();
		
		if(num1 > num2 && num1 > num3) {
			maior = num1;
		}else if (num2 > num1 && num2 > num3) {
			maior = num2;
		}else {
			maior = num3;
		}
		
		System.out.println("\nO maior número é: " + maior);
		
		
		
		
		
		
	

	}

}
