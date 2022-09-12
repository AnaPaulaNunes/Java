package Turma58;

import java.util.Scanner;

public class AtividadeVetor {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner (System.in);
		
		float[] numeros = new float[6];
		float somaPares=0, quantImp=0;
		int x;
		
		for(x=0;x<6;x++) {
			System.out.println("\nEntre com um número: ");
			numeros[x] = leia.nextFloat();
			
		}System.out.println("\nOs números pares digitados são: ");
		for (x=0;x<6;x++) {	
		if (numeros[x] % 2 ==0) {
			System.out.println(numeros[x]);
		somaPares += numeros[x];
		}
		
		}System.out.println("\nOs números ímpares digitados são: ");
		for (x=0;x<6;x++) {	
		if (numeros[x] % 2 != 0) {			
			System.out.println(numeros[x]);
			quantImp ++;
		}
		
		}
		System.out.println("\nA soma dos pares são: "+somaPares);
		System.out.println("\nA quantidade de números ímpares é: "+quantImp);


	}

}



