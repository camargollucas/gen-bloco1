package Tarefas_9_3;

import java.util.Scanner;

public class Atividade6 {

	public static void main(String[] args) {

		int cargo;
		float salario=0, reajuste;
		Scanner leia = new Scanner(System.in);

		System.out.println("Código do cargo  -----  Cargo  ---------------  Percentual do Reajuste\r\n"
				+ "	.1  ----------  Gerente  ---------------------  10%\r\n"
				+ "	.2  ----------  Vendedor  --------------------  7%\r\n"
				+ "	.3  ----------  Supervisor  ------------------  9%\r\n"
				+ "	.4  ----------  Motorista  -------------------  6%\r\n"
				+ "	.5  ----------  Estoquista  ------------------  5%\r\n"
				+ "	.6  ----------  Técnico de TI  ---------------  8%");

		System.out.println("\nNome do colaborador: ");
		String nome = leia.nextLine();
		System.out.printf("Colaborador: " + nome);

		System.out.println("\nDigite o código de seu cargo: ");
		cargo = leia.nextInt();
		
		System.out.println("\nDigite seu salário atual: R$ ");
		salario = leia.nextFloat();
				
		switch(cargo) {
		case 1:
			reajuste = salario + (salario * 10/100) ;
		System.out.printf("Salário pós reajuste: R$ %.2f" ,reajuste);
		break;
		case 2:
			reajuste = salario + (salario * 7/100) ;
		System.out.printf("Salário pós reajuste: R$ %.2f" ,reajuste);
		break;
		case 3:
			reajuste = salario + (salario * 9/100) ;
		System.out.printf("Salário pós reajuste: R$ %.2f" ,reajuste);
		break;
		case 4:
			reajuste = salario + (salario * 6/100) ;
		System.out.printf("Salário pós reajuste: R$ %.2f" ,reajuste);
		break;
		case 5:
			reajuste = salario + (salario * 5/100) ;
		System.out.printf("Salário pós reajuste: R$ %.2f" ,reajuste);
		break;
		case 6:
			reajuste = salario + (salario * 8/100) ;
		System.out.printf("Salário pós reajuste: R$ %.2f" ,reajuste);
		break;
			
		}
		
	}

}
