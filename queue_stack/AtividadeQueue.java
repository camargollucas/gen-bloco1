package queue_stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class AtividadeQueue {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<>();
		Scanner leia = new Scanner(System.in);

		System.out.print("########  Menu  ########\r\n" + "1. Adicionar clientes na fila\r\n" + "2. Listar clientes\r\n"
				+ "3. Retirar cliente da fila\r\n" + "0. Sair\r\n" + "\r\n");

		int opcao;
		do {

			System.out.print("Entre com a opção desejada: ");
			opcao = leia.nextInt();
			leia.nextLine();
			switch (opcao) {
			case 1:
				System.out.print("\nDigite o nome do cliente: ");
				String nomeCliente = leia.nextLine();
				fila.add(nomeCliente);
				System.out.println("\nCliente " + nomeCliente + " adicionado(a)!\n");
				break;
			case 2:
				if (fila.isEmpty()) {
					System.out.println("A fila está vazia!");
				} else {
					System.out.println("Fila: ");
					for (String cliente : fila) {
						System.out.println("- " + cliente);
					}
				}
				break;
			case 3:
				if (fila.isEmpty()) {
					System.out.println("A fila está vazia!");
				} else {
					String clienteChamado = fila.poll();
					System.out.println("Cliente: " + clienteChamado + " foi chamado(a)");
				}
				break;
			case 0:
				System.out.println("\nSistema encerrado.");
				break;
			default:
				System.out.println("Opção inválida.");
			}

		} while (opcao != 0);

	}

}
