programa
{
	inclua biblioteca Matematica-->math
	
	funcao inicio()
	{
		real custoFabrica, custoConsumidor

		escreva("Qual o custo de fábrica?")
		leia(custoFabrica)

		custoConsumidor = math.arredondar((custoFabrica + (custoFabrica * 0.28) + (custoFabrica * 0.45)), 2)

		escreva("O custo de consumidor é de R$" + custoConsumidor)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 336; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */