package Turma58;

import java.util.Scanner;

public class AtividadeMatriz {

	public static void main(String[] args) {
		
		/* 3- Leia uma matriz 3 x 3, conte e escreva quantos valores 
		 * maiores que 10 ela possui.
		 */
	
		Scanner leia = new Scanner (System.in);
		
		
		int[][] matriz = new int [3][3];
		int contm10 = 0, x, y;
			
		
		for(x=0;x<3;x++) {
			for(y=0;y<3;y++) {
			
			System.out.println("\nEntre com um número na linha "+x+" e coluna " +y+" : ");
			matriz[x][y] = leia.nextInt();
			}
			
		}System.out.println("\nOs números maiores que 10 são: ");
		for(x=0;x<3;x++) {
			for(y=0;y<3;y++) {
				if(matriz[x][y] > 10) {
					System.out.println(matriz[x][y]);
					contm10++;
				}
				
			}
		}

	System.out.println("\nA quantidade de números maiores que 10 é: " +contm10);
	}
}

