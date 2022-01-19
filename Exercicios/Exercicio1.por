programa
{
	
	funcao inicio()
	{
		inteiro idadeAno, idadeMes, idadeDia, idadeTotalDia
		
		escreva("Quantos anos você tem?")
		leia(idadeAno)
		
		escreva("Quantos meses você tem?")
		leia(idadeMes)
		
		escreva("Quantos dias você tem?")
		leia(idadeDia)

		idadeAno = idadeAno * 365
		idadeMes = idadeMes * 30
		
		idadeTotalDia = idadeAno + idadeMes + idadeDia
		escreva("Você nasceu há: " + idadeTotalDia + " dias")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 220; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */