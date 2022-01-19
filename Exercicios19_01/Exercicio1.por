/*
1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes,
coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:  
a) média do salário da população;
b) média do número de filhos;
c) maior salário; //se salario digitado > salario maior = salario digitado é salario maior
d) percentual de pessoas com salário até R$100,00. // salario <= 100 contar essa pessoa N/20 * 100
*/

programa
{
	
	funcao inicio()
	{
		real habitante, salario = 0.0, salarioTotal = 0.0, numFilho, numFilhoTotal = 0.0, mediaSalario = 0.0
		real mediaFilho, maiorSalario = 0.0, percentual, pessoasAte100 = 0.0, numHab

		numHab = 3.0

		para(habitante = 1.0; habitante <= numHab; habitante++) { //habitante + 1
			
			escreva("Qual o seu salário? ")
			leia(salario)
			escreva("Quantos filhos você tem? ")
			leia(numFilho)

			salarioTotal = salarioTotal + salario
			numFilhoTotal = numFilhoTotal + numFilho

			se(salario > maiorSalario) {
				maiorSalario = salario
			}

			se(salario <= 100) {
				pessoasAte100++ // pessoasAte100 + 1 
			}
		}

		mediaSalario = salarioTotal / numHab // media de todos salario computador pelo numero de hab
		mediaFilho = numFilhoTotal / numHab // em media quantos filhos cada habitante tem
		percentual = pessoasAte100 / numHab * 100 // numero de pessoas, dividido pelos hab * 100 pra virar percentual

		escreva("A média do salário é de: R$" + mediaSalario)
		escreva("\nA média de filhos por habitante é de: " + mediaFilho)
		escreva("\nO maior salário dentre os habitantes é de: R$" + maiorSalario)
		escreva("\nO percentual de pessoas com salário até R$100,00 é de " + percentual + "%!")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 0; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */