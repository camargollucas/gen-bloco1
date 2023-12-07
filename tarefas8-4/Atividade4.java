package tarefas;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float x=0, y=0, j=0, k=0;  
		
		Scanner leia = new Scanner(System.in);
		System.out.print("1. Digite um número de 1 a 10: ");
		float n1 = leia.nextFloat();
		x+=n1;
		System.out.printf("Número 01: %.1f \n\n",x);

		Scanner leia1 = new Scanner(System.in);
		System.out.print("2. Digite um número de 1 a 10: ");
		float n2 = leia1.nextFloat();
		y+=n2;
		System.out.printf("Número 02: %.1f \n\n",y);
		
		Scanner leia2 = new Scanner(System.in);
		System.out.print("3. Digite um número de 1 a 10: ");
		float n3 = leia2.nextFloat();
		j+=n3;
		System.out.printf("Número 03: %.1f \n\n",j);
		
		Scanner leia3 = new Scanner(System.in);
		System.out.print("4. Digite um número de 1 a 10: ");
		float n4 = leia3.nextFloat();
		k+=n4;
		System.out.printf("Número 04: %.1f \n\n",k);
		
		float diferenca=(x*y)-(j*k);
		System.out.printf("Diferença:  %.1f ",diferenca);
			
	}

}
