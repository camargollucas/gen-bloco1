package Tarefas10_11;

import java.util.Scanner;

public class Atividade6 {

	public static void main(String[] args) {

		int n = 0, soma = 0, mult3 = 0;
		float media=0f;
		Scanner leia = new Scanner(System.in);

		do {
			System.out.println("Digite um número: ");
			n = leia.nextInt();
			if (n != 0 && n % 3 == 0) {
				soma += n;
				mult3++;
				media = (soma / mult3);
			}
			
		} while (n != 0);
		System.out.printf("A média de todos os números múltiplos de 3 é : %.2f", media);
		leia.close();

	}

}
