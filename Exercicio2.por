programa
{
	
	funcao inicio()
	{
		inteiro dias, meses, anos
		
		escreva("Há quantos dias você nasceu?")
		leia(dias)

		anos = dias / 365
		escreva("Você tem: " + anos + " anos")
		
		meses = (dias % 365) / 30
		escreva("Você tem: " + meses + " meses")

		dias = dias - (anos*365) - (meses*30)
		escreva("Você tem: " + dias + " dias")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 328; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */