/*
Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
posição das matrizes N1 e N2.
 */

programa
{
	
	funcao inicio()
	{
		real N1[4][6], N2[4][6], M1[4][6], M2[4][6]

		para(inteiro linha = 0; linha < 4; linha++){
			para(inteiro coluna = 0; coluna <6; coluna++){
				escreva("Informe um valor: ")
				leia(N1[linha][coluna])
					//N1[3][0]
				limpa()
			}
		}

		para(inteiro linha = 0; linha < 4; linha++){
			para(inteiro coluna = 0; coluna <6; coluna++){
				escreva("Informe um valor: ")
				leia(N2[linha][coluna])
					//N1[3][0]
				limpa()
			}
		}

		para(inteiro linha = 0; linha < 4; linha++) {    
			para(inteiro coluna = 0; coluna < 6; coluna++){
				M1[linha][coluna] = N1[linha][coluna] + N2[linha][coluna]
			//   M1[0][1] = N1[0][1] + N2[0][1]
			//       6=        3   +     3
			}
		}

		para(inteiro linha = 0; linha < 4; linha++) {    
			para(inteiro coluna = 0; coluna < 6; coluna++){
				M2[linha][coluna] = N1[linha][coluna] - N2[linha][coluna]
			//   M1[0][1] = N1[0][1] - N2[0][1]
			//       0=        3   -     3
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1112; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {N1, 14, 7, 2}-{N2, 14, 17, 2}-{M1, 14, 27, 2}-{M2, 14, 37, 2};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */