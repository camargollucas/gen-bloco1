package Tarefas_9_3;

import java.util.Scanner;

public class Atividade7 {

	public static void main(String[] args) {
		
		float n1, n2, resultado;
		int j;
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("Código  ------  Operação\r\n"
		+ ".1  ----------  Soma +\r\n"
		+ ".2  ----------  Subtração - \r\n"
		+ ".3  ----------  Multiplicação * \r\n"
		+ ".4  ----------  Divisão /");

		System.out.println("Digite o primeiro número");
		n1 = leia.nextFloat();
		System.out.println("Digite o segundo número");
		n2 = leia.nextFloat();
		System.out.println("Digite o número da operação");
		j = leia.nextInt();
		
		switch(j) {
		case 1:
			resultado = n1 + n2;
			System.out.println(resultado);
		break;
			
		case 2:
			resultado = n1 - n2;
			System.out.println(resultado);
		break;
		
		case 3:
			resultado = n1 * n2;
			System.out.println(resultado);
		break;
		
		case 4:
			resultado = n1 / n2;
			System.out.println(resultado);
		break;
			
		default:System.out.println("Operação inválida");
		
		}
		
	}

}
