programa
{
	
	funcao inicio()
	{
		inteiro numero,contador //declarei minhas variaveis

		contador = 0 //coloquei meu contador em zero para iniciar a contagem dos 15 numeros

		para (inteiro i=0; i<5; i++) { //o para vai iniciar em 0 e vai repetir até o i=15 (vai se repetir 15x)
			escreva("Digite um número inteiro: ")
			leia(numero)
	
			se (numero >= 10 e numero <= 100) { //condição para o número estar dentro do intervalo
				contador += 1 //somo meu contador caso o numero esteja no intervalo
				limpa() //limpo meu console
			} senao {
				limpa() //limpo meu console
			}
		}
		escreva("Existem " + contador + " números dentro do intervalo entre 10 e 100")
		//demonstro quantos numeros entraram na condição atraves da soma feita no contador
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 582; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */