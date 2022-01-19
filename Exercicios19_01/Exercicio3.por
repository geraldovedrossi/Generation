/*
1- Elaborar um programa que efetue a leitura sucessiva de valores numéricos e
apresente no final o total do somatório, a média e o total de valores lidos. O programa
deve fazer as leituras dos valores enquanto // enquanto(num >= 0)
o usuário estiver fornecendo valores
positivos. Ou seja, o programa deve parar quando o usuário fornecer um valor
negativo.
 */

programa
{ //simulacao 1  3  5  -4
	
	funcao inicio()
	{
		real num, totalSom = 0.0, media, totalVal = 0.0

		escreva("Escreva um valor positivo: ")
		leia(num)

		enquanto(num >= 0) {
			totalSom = totalSom + num // 1 + 3 + 5 = 9
			totalVal++  // 1 + 1 + 1 = 3
			escreva("\nEscreva outro valor positivo: ")
			leia(num)
		}

		se(totalVal != 0) {
			media = totalSom / totalVal
		} senao {
			media = 0.0
		}
		
		//          9    /   3  =  3
		escreva("\nO total do somatório é: " + totalSom + "\nA média é de: " + media 
		+ "\nVocê digitou " + totalVal + " valores positivos")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 613; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */