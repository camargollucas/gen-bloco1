package Tarefas_9_3;

import java.util.Scanner;

public class Atividade_2 {

	public static void main(String[] args) {

		int numero;
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite um número inteiro: ");
		numero = leia.nextInt();

		if (numero % 2 == 0) {
			System.out.println("O número " + numero + " é par");
		} else {
			System.out.println("O número " + numero + " é ímpar");
		}

		if (numero >= 0) {
			System.out.println("O número " + numero + " é positivo");
		} else {
			System.out.println("O número " + numero + " é negativo");
		}

	}

}
