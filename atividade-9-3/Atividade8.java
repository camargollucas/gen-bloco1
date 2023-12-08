package Tarefas_9_3;

import java.util.Scanner;

public class Atividade8 {

	public static void main(String[] args) {
		
		float saldo=1000.00f, saque, deposito;
		int j;
		Scanner leia = new Scanner(System.in);
		System.out.println("Código  ------  Operação\r\n"
				+ ".1  ----------  Mostrar saldo \r\n"
				+ ".2  ----------  Saque \r\n"
				+ ".3  ----------  Depósito");
		
		System.out.println("Digite o código da operação: ");
		j = leia.nextInt();
		
		switch(j) {
		case 1: System.out.printf("Seu saldo é: %.2f " , saldo);
		break;
		
		case 2: System.out.println("SAQUE");
			System.out.println("\nDigite o valor do saque: ");
		saque = leia.nextFloat();
		if (saque > saldo) {
			System.out.println("Saldo insuficiente");
			}else {
				saldo = saldo - saque;
				System.out.printf("Seu novo saldo é: %.2f  " , saldo);
			}
		break;
		
		case 3: System.out.println("DEPÓSITO");
			System.out.println("Digite o valor do depósito: ");
			deposito = leia.nextFloat();
			saldo += deposito;
		System.out.printf("Seu novo saldo é: %.2f",saldo);
		break;
		
		}
	
	}

}
