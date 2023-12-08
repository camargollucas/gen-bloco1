package Tarefas10_11;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		// Escreva um algoritmo em Java, que leia a idade de várias pessoas (números
		// inteiros), via teclado e mostre na tela o total de pessoas cuja idade seja
		// menor que 21 anos e o total de pessoas cuja idade seja maior que 50 anos. A
		// leitura dos dados deve ser finalizada ao digitar uma idade negativa. Veja o
		// exemplo abaixo:
		// (int i = 1; i <= 10; i++)

		int n = 0, mais = 0, menos = 0;
		Scanner leia = new Scanner(System.in);

		while (n >= 0) {
			System.out.println("Digite sua idade: ");
			n = leia.nextInt();

			if (n < 21 && n > 0 ) {
				menos++;
			}

			if (n >= 50) {
				mais++;
			}

		}

		System.out.println("São " + mais + " maiores de 50 anos \n");
		System.out.println("E são " + menos + " menores de 21 anos");

	}

}
