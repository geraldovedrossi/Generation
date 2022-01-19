/*2) Elabore um sistema que leia as variáveis C e N, respectivamente código e número de
horas trabalhadas de um operário. E calcule o salário sabendo-se que ele ganha R$ 10,00
por hora. Quando o número de horas exceder a 50 calcule o excesso de pagamento
armazenando-o na variável E, caso contrário zerar tal variável. A hora excedente de
trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o salário
excedente.
*/

programa
{
	
	funcao inicio()
	{
		real  N, E, salarioT, salarioE
		cadeia C

		escreva("Qual o nome do funcionário? ")
		leia(C)
		escreva("Quantas horas o funcionário trabalhou? ")
		leia(N)

		se (N > 50) {
			
			E = N - 50 //oq sobra é o excedente
			salarioE = (E * 20.0) //R$20,00 a hora
			salarioT = ( 50 * 10.0 ) + salarioE //50 horas por R$10,00 + hora extra
			escreva(C + "seu salário excedente é de: R$" + salarioE + "\nSeu salário total é de: R$" + salarioT)
			
		} senao se (N <=50 e N > 0) {
			
			salarioT = N * 10 // n excedi horas entao R$10 a hora
			escreva(C + "seu salário total é de: R$" + salarioT)
			
		} senao se (N <= 0) {
			escreva(C + " você nem sequer trabalhou esse mês?!")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 840; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */