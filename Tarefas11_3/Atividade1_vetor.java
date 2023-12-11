package Tarefas11_3;

import java.util.Scanner;

public class Atividade1_vetor {

	public static void main(String[] args) {

		// Dado um vetor contendo 10 números inteiros não ordenados e não repetidos,
		// construa um algoritmo que consiga pesquisar dados no vetor, onde o usuário
		// irá digitar um número e o programa deve exibir na tela a posição deste número
		// no vetor. Caso o número não seja encontrado, a mensagem: “Não foi
		// encontrado!” deve ser exibida na tela.

		int vetor[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		int posicao;
		int i = 0;
		boolean localizarPosicao = false;

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o número que você deseja encontrar: ");
		posicao = leia.nextInt();

		while (i < 10 && localizarPosicao == false) {

			if (vetor[i] == posicao) {

				localizarPosicao = true;

			}

			i++;

		}

		if (localizarPosicao == false) {
			System.out.println("Número " + posicao + " não encontrado.");
		} else {
			System.out.println("Número " + posicao + " está na posição " + i);
		}

	}

}
