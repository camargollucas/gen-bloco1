package Tarefas_9_3;

import java.util.Scanner;

public class Atividade5 {

	public static void main(String[] args) {

		int produto, qtde;
		float total;
		Scanner leia = new Scanner(System.in);

		System.out.println("Código do produto-------Produto-----------------Preço unitário\r\n"
				+ "	.1--------------Cachorro quente---------R$10,00\r\n"
				+ "	.2--------------X-salada----------------R$15,00\r\n"
				+ "	.3--------------X-bacon-----------------R$18,00\r\n"
				+ "	.4--------------Bauru-------------------R$12,00\r\n"
				+ "	.5--------------Refrigerante------------R$8,00\r\n"
				+ "	.6--------------Suco de laranja---------R$13,00");
		System.out.println("Digite o código do produto: ");
		produto = leia.nextInt();
		System.out.println("Digite a quantidade: ");
		qtde = leia.nextInt();

		switch (produto) {
		case 1:
			total = qtde * 10.00f;
			System.out.printf("O valor total é: R$ %.2f", total);
			break;
		case 2:
			total = qtde * 15.00f;
			System.out.printf("O valor total é: R$ %.2f", total);
			break;
		case 3:
			total = qtde * 18.00f;
			System.out.printf("O valor total é: R$ %.2f", total);
			break;
		case 4:
			total = qtde * 12.00f;
			System.out.printf("O valor total é: R$ %.2f", total);
			break;
		case 5:
			total = qtde * 8.00f;
			System.out.printf("O valor total é: R$ %.2f", total);
			break;
		case 6:
			total = qtde * 13.00f;
			System.out.printf("O valor total é: R$ %.2f", total);
			break;

		}

	}

}
