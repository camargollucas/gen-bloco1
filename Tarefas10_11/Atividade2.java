package Tarefas10_11;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		// Escreva um algoritmo em Java, que leia 10 números inteiros via teclado e
		// mostre na tela quantos números são pares e quantos números são ímpares.

		Scanner leia = new Scanner(System.in);
		int n, par = 0, impar = 0;

		for (int i = 1; i <= 10; i++) {
			System.out.println("Digite o " + i + "º número");
			n = leia.nextInt();

			if (n % 2 == 0) {
				par++;
			}

			if (n % 2 == 1) {
				impar++;
			}

		}
		System.out.println("São " + par + " números pares \n");
		System.out.println("E são " + impar + " números ímpares");

	}

}
