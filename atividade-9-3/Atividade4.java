package Tarefas_9_3;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		String p1, p2, p3;

		System.out.println("Digite a primeira palavra");
		p1 = leia.nextLine();

		System.out.println("Digite a segunda palavra");
		p2 = leia.nextLine();

		System.out.println("Digite a terceira palavra");
		p3 = leia.nextLine();

		if (p1.equals("vertebrado")) {
			if (p2.equals("ave")) {
				if (p3.equalsIgnoreCase("carnivoro")) {
					System.out.println("águia");

				} else {
					System.out.println("pomba");
				}
			} else {
				if (p3.equals("onivoro")) {
					System.out.println("homem");
				} else {
					System.out.println("vaca");
				}
			}
		} else {
			if (p2.equals("inseto")) {
				if (p3.equals("hematofago")) {
					System.out.println("pulga");
				} else {
					System.out.println("lagarta");
				}
			}
			if (p2.equals("hematofago")) {
				System.out.println("sanguessuga");
			} else {
				System.out.println("minhoca");
			}
		}

	}

}
