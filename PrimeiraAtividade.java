package Turma58;

import java.util.Scanner;

public class PrimeiraAtividade {

	public static void main(String[] args) {
		
	double n1,n2,n3,media;
	int op;
	
	Scanner leia = new Scanner(System.in);
	
	System.out.println("\nEntre com a primeira nota: ");
	n1 = leia.nextFloat();
	System.out.println("\nEntre com a segunda nota: ");
	n2 = leia.nextFloat();
	System.out.println("\nEntre com a terceira nota: ");
	n3 = leia.nextFloat();
	
	media = (n1+n2+n3)/3;
	
	System.out.println("\nMédia Aritmética: "+media+" e sua nota 1 foi de: "+n1);
	System.out.printf("\nMédia Aritmética: %2f",media);
	
	if(media>=7 && media<=10) {
		System.out.println("\nAluna Aprovada!");
		
	}else if(media>=5 && media<7) {
		System.out.println("\nAluna de exame!");
	
	}else {
		System.out.println("\nAluna Reprovada!");
	}
	
	System.out.println("\n\t\tMenu de Incentivos");
	System.out.println("\n1- Você vai aprender!");
	System.out.println("\n2- Já deu certo!");
	System.out.println("\n3- Vai dá Boommmm!");
	System.out.println("\n4- Com dedicação vocês vão além!");
	System.out.println("\nDigite a sua opção: ");
	op = leia.nextInt();
	
	switch (op) {	
	case 1:
	System.out.println("\nVocê vai aprender!");
		break;		
	case 2:
	System.out.println("\nJá deu certo!");
	break;	
	case 3:
		System.out.println("\nVai dá Boommmm!");
		break;		
	case 4:
		System.out.println("\nCom dedicação vocês vão além!");
		break;
		default:
			System.out.println("\nOpção Inválida!");
	}
	}
}
	
	
	

		
	
	
	


