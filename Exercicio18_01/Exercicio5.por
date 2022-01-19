/*
5) A Secretaria de Meio Ambiente que controla o índice de poluição mantém 3 grupos de
indústrias que são altamente poluentes do meio ambiente. O índice de poluição aceitável
varia de 0.05 até 0.25. Se o índice sobe para 0.3 as indústrias do 1º grupo são intimadas a
suspenderem suas atividades, se o índice crescer para 0.4 as industrias do 1º e 2º grupo são
intimadas a suspenderem suas atividades, se o índice atingir 0.5 todos os grupos devem ser
notificados a paralisarem suas atividades. Faça um sistema que leia o índice de poluição
medido e emita a notificação adequada aos diferentes grupos de empresas.
						//se indicePolu > 0,3 suspende G1
						//se indicePolu  > 0,4 suspende G1 e G2
						//se indicePolu  > 0,5 suspende G1 G2 G3
*/

programa
{
	
	funcao inicio()
	{
		real indicePolu
		cadeia G1, G2, G3
		G1 = "Primeiro Grupo"
		G2 = "Segundo Grupo"
		G3 = "Grupo Especial"

		escreva("Qual o índice de poluição atual? ")
		leia(indicePolu)

		se (indicePolu >= 0.05 e indicePolu <= 0.25) {
			escreva("O índice de poluição está aceitável")
		} senao se (indicePolu >= 0.3 e indicePolu < 0.4) {
			escreva("As atividades do " + G1 + " estão suspensas!")
		} senao se (indicePolu >= 0.4 e indicePolu < 0.5) {
			escreva("As atividades do " + G1 + " e do " + G2 + " estão suspensas!")
		} senao se (indicePolu >= 0.5) {
			escreva("As atividades do " + G1 + " e do " + G2 + " e do " + G3 + " estão suspensas!")
		} senao {
			escreva("O índice não é classificável")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 851; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */