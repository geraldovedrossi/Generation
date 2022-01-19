programa
{
	
	funcao inicio()
	{
		real A, B, C, D, E, F, x, y

		escreva("Informe um valor para A: ")
		leia(A)
		escreva("Informe um valor para B: ")
		leia(B)
		escreva("Informe um valor para C: ")
		leia(C)
		escreva("Informe um valor para D: ")
		leia(D)
		escreva("Informe um valor para E: ")
		leia(E)
		escreva("Informe um valor para F: ")
		leia(F)

		x = ((C * E) - (B * F)) / ((A * E) - (B * D))

		y = ((A * F) - (C * D)) / ((A * E) - (B * D))

		escreva("O valor de X é: " + x + "\nO valor de Y é: " + y )
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 527; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */