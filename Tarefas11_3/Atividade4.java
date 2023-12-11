package Tarefas11_3;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {

		int linhas = 10, colunas = 4;
		float matrizNotas[][] = new float[linhas][colunas];
		float vetorMedias[] = new float[10];
		Scanner leia = new Scanner(System.in);

		for (int i = 0; i < linhas; i++) {
			System.out.printf("Insira as notas do %d º aluno: ", i + 1);
			for (int j = 0; j < colunas; j++) {
				matrizNotas[i][j] = leia.nextFloat();
			}
		}

		for (int i = 0; i < linhas; i++) {
			float somaNotas = 0;
			for (int j = 0; j < colunas; j++) {
				somaNotas += matrizNotas[i][j];
			}
			vetorMedias[i] = somaNotas / colunas;
		}

		System.out.println("\nMédias: ");
		for (int i = 0; i < linhas; i++) {
			System.out.printf("Aluno %d: %.1f\n", i + 1, vetorMedias[i]);
		}
	}
}