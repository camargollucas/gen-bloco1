package Tarefas10_11;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1, n2;
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe o primeiro número: ");
		n1 = leia.nextInt();
		System.out.println("Informe o segundo número: ");
		n2 = leia.nextInt();

		if (n1 < n2) {
			for (int i = n1; i <= n2; i++) {
				if (i % 3 == 0 && i % 5 == 0) {
					System.out.println(i + " é múltiplo de 3 e 5");
				}
			}
		} else {
			System.out.println("Operação inválida, o primeiro número deve ser menor que o segundo");
		}

		leia.close();
	}
}