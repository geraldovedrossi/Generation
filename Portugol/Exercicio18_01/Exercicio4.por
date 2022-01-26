/*4) Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se este
número é par ou ímpar, e se é positivo ou negativo.
*/

programa
{
	
	funcao inicio ()
	{
		inteiro  num

		escreva("Digite um número inteiro: ")
		leia(num)

		se (num >= 0) { // identifica se é positivo ou negativo
			escreva(num + " é um número positivo. \n")
		} senao {
			escreva(num + " é um número negativo. \n")
		}

		se ((num % 2) == 0) { // par quando o dividimos por 2 e seu resto é 0
		//15 / 2 = 7
		//  1
			escreva(num + " é um número par.")
		} senao {
			escreva(num + " é um número impar.")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 614; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */