package tarefas;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float x=0, y=0;
		
		Scanner leia = new Scanner(System.in);
		System.out.print("Digite o seu salário: R$");
		float salario = leia.nextFloat();
		System.out.println("O seu salário atualmente é: " + salario);

		Scanner leia1 = new Scanner(System.in);
		System.out.print("Digite o valor do seu abono: R$");
		float abono = leia1.nextFloat();
		System.out.println("O seu abono foi de: " + salario);
		x += salario;
		y += abono;
		float salarioFinal = x+y;
		
		System.out.printf("O salário total é: R$ %.2f ", salarioFinal);
		
	}

}
