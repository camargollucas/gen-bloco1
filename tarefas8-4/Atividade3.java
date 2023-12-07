package tarefas;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float x=0, y=0, j=0, k=0;  
		
		Scanner leia = new Scanner(System.in);
		System.out.print("Digite o valor do salário bruto: R$ ");
		float salarioBruto = leia.nextFloat();
		x+=salarioBruto;
		System.out.printf("Salário bruto: R$ %.2f \n",x);

		Scanner leia1 = new Scanner(System.in);
		System.out.print("Digite o valor do adicional noturno: R$ ");
		float adcNot = leia1.nextFloat();
		y+=adcNot;
		System.out.printf("Adicional noturno: R$ %.2f \n",y);
		
		Scanner leia2 = new Scanner(System.in);
		System.out.print("Digite o valor das horas extras: R$ ");
		float HE = leia2.nextFloat();
		j+=HE;
		System.out.printf("Horas extras: R$ %.2f \n",j);
		
		Scanner leia3 = new Scanner(System.in);
		System.out.print("Digite o valor dos descontos: R$ ");
		float desconto = leia3.nextFloat();
		k+=desconto;
		System.out.printf("Descontos: R$ %.2f \n",k);
		
		float salarioLiquido=x+y+(j*5)-k;
		System.out.printf("Salário líquido: R$ %.2f ",salarioLiquido);
		
	}

}
