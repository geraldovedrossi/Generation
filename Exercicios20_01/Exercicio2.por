/*
 Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
imprima a média aritmética dos lançamentos, contabilize e apresente também
quantas foram as ocorrências da maior pontuação.
 */

programa
{
	
	funcao inicio()
	{
		real vetor[5], somaLan=0.0, mediaLan, maiorPont=0.0, ocorrenc=0.0

		para(inteiro rol=0; rol<5; rol++) {
			escreva("Qual foi o valor do dado? ")
			leia(vetor[rol])

			somaLan+=vetor[rol]
			limpa()

			se(vetor[rol] >= maiorPont) {
				
				se(vetor[rol] == maiorPont){
					ocorrenc++
				} senao {
					ocorrenc = 0.0
					ocorrenc++
				}
				maiorPont = vetor[rol]
			}
		}

		mediaLan = somaLan / 5
		escreva("A media dos lançamentos foi de: " + mediaLan)
		escreva("\nA ocorrencia em que " + maiorPont + " apareceu, foi " + ocorrenc + "x")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 676; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {vetor, 13, 7, 5}-{maiorPont, 13, 40, 9}-{ocorrenc, 13, 55, 8};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */