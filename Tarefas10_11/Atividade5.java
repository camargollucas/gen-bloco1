package Tarefas10_11;

import java.util.Scanner;

public class Atividade5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 0, sum = 0;

		Scanner leia = new Scanner(System.in);

		do {
			System.out.println("Digite um número: ");
			n = leia.nextInt();
			if (n > 0) {
				sum += n;
			}
		} while (n != 0);
		System.out.println("A soma dos números positivos é: " + sum);
		leia.close();
	}

}
