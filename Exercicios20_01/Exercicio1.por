/*
Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.
*/

programa
{
	
	funcao inicio()
	{
		real vetor[5], maiorPont=0.0

		para(inteiro per=0; per<5; per++) {
			escreva("Entre com um valor: ") //pergunto valor
			leia(vetor[per]) //salvo valor no meu vetor
			limpa() //limpo para perguntar dnv
			

			se(maiorPont<vetor[per]) { //pergunto se esse foi maior valor digitado
				maiorPont = vetor[per] //salvo o maior valor
			}
		}
		para(inteiro per=0; per<5; per++) {
			escreva(vetor[per]+" ") // escrevendo todos os valores salvos no meu vetor
			
		}
		escreva("\nO maior valor inserido foi: " + maiorPont) //escrevendo o maior valor
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 418; 
 * @PONTOS-DE-PARADA = 16, 20, 14, 15;
 * @SIMBOLOS-INSPECIONADOS = {vetor, 11, 7, 5}-{maiorPont, 11, 17, 9};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */