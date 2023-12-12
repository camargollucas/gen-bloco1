package tarefas12_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Atividade1_ArrayList {

	public static void main(String[] args) {

		// Escreva um programa Java para criar uma Collection ArrayList de Objetos da
		// Classe String. O programa deverá solicitar ao usuário, que ele digite via
		// teclado 5 cores e deverá adicioná-las individualmente no ArrayList. Em
		// seguida, faça o que se pede:
		// Mostre na tela todas as cores que foram adicionadas.
		// Mostre na tela todas as cores que foram adicionadas ordenadas em ordem
		// crescente.

		ArrayList<String> cores = new ArrayList<String>();
		Scanner leia = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			System.out.print("Escreva uma cor: ");
			String cor = leia.nextLine();
			cores.add(cor);
		}

		System.out.println("\nLista das cores:");
		for (String cor : cores) {
			System.out.println(cor);
		}
		Collections.sort(cores);

		System.out.println("\nLista das cores em ordem alfabética:");
		for (String cor : cores) {
			System.out.println(cor);

		}

	}

}
