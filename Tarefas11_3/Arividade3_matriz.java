package Tarefas11_3;

public class Arividade3_matriz {

	public static void main(String[] args) {

		int[][] matriz = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int n, somaPrincipal = 0, somaSecundaria = 0;

		for (int linha = 0; linha < matriz.length; linha++)
			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {

			}

		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {

				System.out.print("[" + matriz[linha][coluna] + "]" + " ");

			}

			System.out.println();

		}

		System.out.println("\nDiagonal principal: ");
		for (int linha = 0; linha < matriz.length; linha++) {
			System.out.print("[" + matriz[linha][linha] + "]" + " ");

		}

		System.out.println("\n\nDiagonal secundária: ");

		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = matriz.length - 1; coluna >= 0; coluna--) {
				System.out.print("[" + matriz[linha][coluna] + "]" + " ");
				linha++;

			}
		}

		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = matriz.length - 1; coluna >= 0; coluna--) {
				if (linha == coluna) {
					somaPrincipal = somaPrincipal + matriz[linha][coluna];

				}
			}
		}

		int tamanho = matriz.length;
		for (int linha = 0; linha < matriz.length; linha++) {
			somaSecundaria += matriz[linha][tamanho - 1 - linha];
		}

		System.out.println("\n\nSoma da diagonal principal: " + somaPrincipal);
		System.out.println("\n\nSoma da diagonal principal: " + somaSecundaria);
	}
}
