package Tarefas_9_3;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {

		int idade;
		boolean doacao;
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o nome do doador: ");
		String nome = leia.nextLine();
		System.out.printf("Nome do doador: %s\n", nome);

		System.out.println("Digite a idade do doador: ");
		idade = leia.nextInt();
		System.out.printf("Idade do doador: %s\n", idade);

		System.out.println("Primeira doação de sangue?: ");
		doacao = leia.nextBoolean();

		if (idade >= 18 && idade <= 59) {
			System.out.println("Apto");
		}
		if (idade >= 70) {
			System.out.println("Não apto");
		}

		if (idade >= 60 && idade <= 69) {
			if (doacao == false) {
				System.out.println(nome + " está apto");
			} else {
				System.out.println(nome + " não está apto");
			}
		}

		if (doacao == true) {
			System.out.println("Primeira doação");
		} else if (doacao == false) {
			System.out.println("Não é a primeira doação");
		}

	}

}
