/*
1- Faça um programa que mostre uma contagem na tela de 233 a 456, só que
contando de 3 em 3 quando estiver entre 300 e 400 e de 5 em 5 quando não estiver.

233 a 299 =5 em 5
300 a 400 = 3 em 3
401 a 456 = 5 em 5
 */

programa
{
	
	funcao inicio()
	{
		inteiro num = 233

		escreva( num + "\n")

		faca {
			se ((num >= 233 e num <= 299) ou (num >= 401 e num <= 456)) {
				num += 5
				se(num < 456){
					escreva( num + "\n")
				}
				
			}
			se (num >=300 e num <= 400) {
				num += 3 
				escreva( num + "\n")
			}
		} enquanto (num <= 456)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 302; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */