package tarefas12_2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Atividade4_Set {

	public static void main(String[] args) {

		// Escreva um programa Java para criar uma Collection Set de Objetos da Classe
		// Wrapper Integer, inicializada com 10 valores inteiros. O programa deverá
		// solicitar ao usuário, que ele digite via teclado 1 número inteiro e caso ele
		// seja encontrado no Set, exiba na tela a mensagem: Número 00 Encontrado! Caso
		// o número não seja encontrado, ele deverá exibir na tela a mensagem: O número
		// NN não foi encontrado!

		Set<Integer> n = new HashSet<Integer>();
		n.add(2);
		n.add(5);
		n.add(1);
		n.add(3);
		n.add(4);
		n.add(9);
		n.add(7);
		n.add(8);
		n.add(10);
		n.add(6);

		Scanner leia = new Scanner(System.in);
		System.out.print("Digite o número que você deseja encontrar: ");
		int numero = leia.nextInt();

		if (n.contains(numero)) {
			System.out.println("O número " + numero + " foi encontrado!");
		} else {
			System.out.println("O número " + numero + " não foi encontrado!");
		}

	}

}
