programa
{
	inclua biblioteca Matematica-->Math
	
	funcao inicio()
	{
		cadeia nome
		real nota1, nota2, nota3

		escreva("Digite o seu nome:")
		leia(nome)
		escreva("Digite a sua 1ª nota:")
		leia(nota1)
		escreva("Digite a sua 2ª nota:")
		leia(nota2)
		escreva("Digite a sua 3ª nota:")
		leia(nota3)

		real media = (nota1+nota2+nota3)/3
		escreva("Sua média é: " + Math.arredondar(media,1))

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 209; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */