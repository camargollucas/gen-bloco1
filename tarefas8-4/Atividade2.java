package tarefas;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float x=0, y=0, j=0, k=0;  
		
		Scanner leia = new Scanner(System.in);
		System.out.print("Digite sua nota 1: ");
		float nota1 = leia.nextFloat();
		x+=nota1;
		System.out.println("Sua primeira nota foi " +x);

		Scanner leia1 = new Scanner(System.in);
		System.out.print("Digite sua nota 2: ");
		float nota2 = leia1.nextFloat();
		y+=nota2;
		System.out.println("Sua segunda nota foi " +y);
		
		Scanner leia2 = new Scanner(System.in);
		System.out.print("Digite sua nota 3: ");
		float nota3 = leia2.nextFloat();
		j+=nota3;
		System.out.println("Sua terceira nota foi " +j);
		
		Scanner leia3 = new Scanner(System.in);
		System.out.print("Digite sua nota 4: ");
		float nota4 = leia3.nextFloat();
		k+=nota4;
		System.out.println("Sua quarta nota foi " +k);
		
		float mediaFinal=x+y+j+k;
		System.out.printf("Sua média foi: %.1f", (mediaFinal/4));
	}

}
