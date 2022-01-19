programa
{
	
	funcao inicio()
	{
		real nota1, nota2, nota3, media

		escreva("Qual o valor da 1ª nota? ")
		leia(nota1)

		escreva("Qual o valor da 2ª nota? ")
		leia(nota2)

		escreva("Qual o valor da 3ª nota? ")
		leia(nota3)

		media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10
				//nota1+nota1+nota2+nota2+nota2+nota3+nota3+nota3+nota3+nota3 / 10
				
		escreva("Sua média é: " + media)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 367; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */