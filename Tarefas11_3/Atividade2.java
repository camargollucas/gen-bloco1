package Tarefas11_3;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {

		int vetor[] = new int[10];
		int n, soma = 0;
		float media = 0;
		Scanner leia = new Scanner(System.in);

		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite um número: ");
			n = leia.nextInt();
			vetor[i] = n;
			soma += vetor[i];
		}

		media = (float) (soma) / vetor.length;

		System.out.println("Elementos ímpares: ");
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] % 2 == 1 && vetor[i] != 0) {
				System.out.println(+vetor[i] + " ");
			}
		}

		System.out.println("Elementos pares: ");
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] % 2 == 0 && vetor[i] != 0) {
				System.out.println(vetor[i] + " ");
			}
		}

	}

}
