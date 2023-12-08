package Tarefas10_11;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {

		System.out.println("Código  ------  Identidade de Gênero	Código  ------  Pessoa Desenvolvedora\r\n"
				+ ".1  ----------  Mulher Cis 		.1  ----------  Backend \r\n"
				+ ".2  ----------  Homem Cis 		.2  ----------  Frontend \r\n"
				+ ".3  ----------  Não Binário		.3  ----------  Mobile\r\n"
				+ ".4  ----------  Mulher Trans		.4  ----------  FullStack\r\n" + ".5  ----------  Homem Trans\r\n"
				+ ".6  ----------  Outro");

		Scanner leia = new Scanner(System.in);
		int idade, gnr, dev, bEnd = 0, fEnd = 0, mob = 0, full = 0, mCis = 0, hCis = 0, nb = 0, mT = 0, hT = 0,
				outro = 0, pesquisa = 0, homemMobile40=0, NbFull30=0;
		float idadeTotal = 0f;
		String categoria = "s";

		while (!categoria.equals("n")) {

			System.out.println("\nDigite sua idade: ");
			idade = leia.nextInt();
			idadeTotal = idade + idadeTotal;

			System.out.println("\nInforme o código referente a identidade de gênero: ");
			gnr = leia.nextInt();

			switch (gnr) {
			case 1:
				mCis++;
				break;
			case 2:
				hCis++;
				break;
			case 3:
				nb++;
				break;
			case 4:
				mT++;
				break;
			case 5:
				hT++;
				break;
			case 6:
				outro++;
				break;
			default:
				System.out.println("Opção inválida");
				break;
			}

			System.out.println("\nInforme o código referente a sua função: ");
			dev = leia.nextInt();

			switch (dev) {
			case 1:
				bEnd++;
				break;
			case 2:
				fEnd++;
				break;
			case 3:
				mob++;
				break;
			case 4:
				full++;
				break;
			default:
				System.out.println("Opção inválida");
				break;
			}

			System.out.println("Deseja continuar? (s/n)");
			categoria = leia.next();

			pesquisa++;

		}

		System.out.println("Total de pessoas desenvolvedoras Backend: " + bEnd);
		System.out.println("Total de mulheres Cis e Trans desenvolvedoras Frontend: " + mCis);
		System.out.println("Total de homens Cis e Trans desenvolvedores mobile maiores de 40 anos: " + homemMobile40);
		System.out.println("Total de pessoas NB desenvolvedoras FullStack menores que 30 anos: " + NbFull30);
		System.out.println("Total de pessoas que responderam a pesquisa: " + pesquisa);
		System.out.println("Média de idade das pessoas que participaram da pesquisa:  " + idadeTotal / pesquisa);

	}

}
