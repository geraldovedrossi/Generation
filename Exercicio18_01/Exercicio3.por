/*
3) Desenvolva um sistema em que:
Leia 4 (quatro) números;
Calcule o quadrado de cada um;
Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
Caso contrário, imprima os valores lidos e seus respectivos quadrados.
*/

programa
{
	inclua biblioteca Matematica-->mat
	
	funcao inicio()
	{
		real num1, num2, num3, num4, res1, res2, res3, res4
		//    3     3      4    5

		escreva("Informe o 1º número: ")
		leia(num1)
		escreva("Informe o 2º número: ")
		leia(num2)
		escreva("Informe o 3º número: ")
		leia(num3)
		escreva("Informe o 4º número: ")
		leia(num4)

		res1 = mat.potencia(num1, 2.0)
		res2 = mat.potencia(num2, 2.0)
		res3 = mat.potencia(num3, 2.0)
		res4 = mat.potencia(num4, 2.0)

		se (res3 >= 1000) {
			escreva("O valor resultante do quadrado do terceiro é de: " + res3)
		} senao {
			escreva(num1 + "² = " + res1 + "\n" + num2 + "² = " + res2 + "\n" + num3 + "² = " + res3 + "\n" + num4 + "² = " + res4 + "\n")
			// 		3     3² = 9          		3	3² = 9
			//escreva(num1 + "² = " + res1 + "\n")
			//escreva(num2 + "² = " + res2 + "\n")
			//escreva(num3 + "² = " + res3 + "\n")
			//escreva(num4 + "² = " + res4)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1143; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */