/*
6) Elabore um sistema que dada a idade de um nadador classifique-o em uma das seguintes
categorias:
Infantil A = 5 a 7 anos
Infantil B = 8 a 11 anos
Juvenil A = 12 a 13 anos
Juvenil B = 14 a 17 anos
Adultos = Maiores de 18 anos
*/

programa
{
	
	funcao inicio()
	{
		inteiro idade
		cadeia infA, infB, juvA, juvB, Adu
		infA = "Pré-mirim"
		infB = "Mirim"
		juvA = "Infantil"
		juvB = "Juvenil"
		Adu = "Adultos"
	
		escreva("Qual a idade do atlete? ")
		leia(idade)

		se (idade >= 5 e idade <= 7) {
			escreva("A categoria do atlete é " + infA)
		} senao se (idade >= 8 e idade <= 11) {
			escreva("A categoria do atlete é " + infB)
		} senao se (idade >= 12 e idade <= 13) {
			escreva("A categoria do atlete é " + juvA)
		} senao se (idade >= 14 e idade <= 17) {
			escreva("A categoria do atlete é " + juvB)
		} senao se (idade >= 18) {
			escreva("A categoria do atlete é " + Adu)
		} senao {
			escreva("Não existe categoria para esta idade")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 508; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */