/*
Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
diagonal, ou seja, diagonal principal.
 */

programa
{
	
	funcao inicio()
	{
		real matriz[3][3], somaTotal = 0.0, somaDiagonal = 0.0

		para(inteiro linha = 0; linha < 3; linha ++){
			para(inteiro coluna = 0; coluna < 3; coluna++){
				escreva("Digite um valor: ")
				leia(matriz[linha][coluna])
				somaTotal += matriz[linha][coluna]

				se(linha==coluna){
					somaDiagonal += matriz[linha][coluna]
				}
				limpa()
			}
		
		}
		escreva("A soma total da matriz é de: "+somaTotal)
		escreva("\nA soma da diagonal principal é de: "+somaDiagonal)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 524; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {matriz, 12, 7, 6}-{somaTotal, 12, 21, 9}-{somaDiagonal, 12, 38, 12};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */