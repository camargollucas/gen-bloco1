package queue_stack;

import java.util.Scanner;
import java.util.Stack;

public class AtividadeStack {
	public static void main(String[] args) {
		Stack<String> livros = new Stack<>();
		Scanner leia = new Scanner(System.in);
		System.out.println("########  Menu  ########\r\n" + "1. Adicionar livro na pilha\r\n"
				+ "2. Listar todos os livros\r\n" + "3. Retirar livro da pilha\r\n" + "0. Sair");

		int opcao;
		do {

			System.out.print("Entre a opção desejada: ");

			opcao = leia.nextInt();
			leia.nextLine();
			switch (opcao) {
			case 1:
				System.out.print("\nDigite o nome do livro: ");
				String entradaLivro = leia.nextLine();
				livros.push(entradaLivro);
				System.out.println("\nLivro " + entradaLivro + " adicionado!\n");
				break;
			case 2:
				if (livros.isEmpty()) {
					System.out.println("A pilha está vazia!");
				} else {
					System.out.println("Pilha: ");
					for (String livro : livros) {
						System.out.println("- " + livro);
					}
					System.out.println();
				}
				break;
			case 3:
				if (livros.isEmpty()) {
					System.out.println("A pilha está vazia!");
				} else {
					String saidaLivro = livros.pop();
					System.out.println("Livro retirado: " + saidaLivro + "\n");
				}
				break;
			case 0:
				System.out.println("\nSistema encerrado.");
				break;
			default:
				System.out.println("Opção inválida. Tente novamente.\n");
				break;
			}
		} while (opcao != 0);

	}
}
