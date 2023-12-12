package tarefas12_2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Atividade3_Set {
	public static void main(String[] args) {

		// Escreva um programa Java para criar uma Collection Set de Objetos da Classe
		// Wrapper Integer. O programa deverá solicitar ao usuário, que ele digite via
		// teclado 10 valores inteiros não repetidos e adicione-os individualmente na
		// Collection Set. Em seguida, faça o que se pede:
		// Mostre na tela todos os elementos da Collection Set, utilizando a Classe
		// Iterator.

		Set<Integer> numeros = new HashSet<Integer>();
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite 10 números inteiros sem repetições: ");

		for (int i = 0; i < 10; i++) {
			int numero = leia.nextInt();
			numeros.add(numero);
		}

		System.out.println("\nListar dados do set: ");
		Iterator<Integer> iSetInt = numeros.iterator();
		while (iSetInt.hasNext()) {
			System.out.println(iSetInt.next());
		}
	}

}