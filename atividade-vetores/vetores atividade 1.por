programa
{
	
	funcao inicio()
	{
		inteiro i, max, aux, num[10] = {2,5,1,3,4,9,7,8,10,6}

		para(i=0;i<10;i++)
		escreva(num[i], ",")
		
		para(max = 0; max < 10; max++){
			para(i = 0; i < 10-1; i++){
				se(num[i] < num[i+1]){
					aux = num[i]
					num[i] = num[i+1]
					num[i+1] = aux
			}
		}
	}
		escreva("\n")		
		para(i=0;i<10;i++)
		escreva(num[i], ",")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 375; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {i, 6, 10, 1}-{aux, 6, 18, 3}-{num, 6, 23, 3};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */