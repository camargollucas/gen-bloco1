programa
{
	
	funcao inicio()
	{
		inteiro i, num[10] = {2,5,1,3,4,9,7,8,10,6}
		inteiro j=0, k=0
		inteiro par[5], impar[5]
		inteiro soma = 0
		real media
		/* j=par e k=impar*/

		para(i=0;i<10;i++){
			soma += num[i]
		}
		media = soma/10
		
		para(i=0;i<10;i++){
			se (num[i]%2==0){
				par[j] = num[i]
				j++
			}senao
			{
				impar[k] = num[i]
				k++
			}
		}

		escreva("\nPares: ")		
		para(j=0;j<5;j++)
		escreva(par[j], " | ")

		escreva("\nÍmpares: ")		
		para(k=0;k<5;k++)
		escreva(impar[k], " | ")

		escreva("\nSoma: " ,soma)
		escreva("\nMédia: " ,media)

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 591; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {num, 6, 13, 3}-{soma, 9, 10, 4}-{media, 10, 7, 5};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */