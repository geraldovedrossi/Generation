/*
1- Fa�a um programa que possua um vetor denominado A que armazene 6 n�meros inteiros.
O programa deve executar os seguintes passos:
(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
(b) Armazene em uma vari�vel inteira (simples) a soma entre os valores das posi��es A[0], A[1] e A[5] do vetor e mostre na tela esta soma. 
(c) Modifique o vetor na posi��o 4, atribuindo a esta posi��o o valor 100. 
(d) Mostre na tela cada valor do vetor A, um em cada linha.

 */

package familia44_3;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int [] A = new int [6];
		int var;
		
		A[0] = 1;
		A[1] = 0;
		A[2] = 5;
		A[3] = -2;
		A[4] = -5;
		A[5] = 7;

		var = A[0] + A[1] + A[5];
		System.out.println(var);
		A[4] = 100;
		
		for(int i=0;i<6;i++) {
			System.out.println(A[i]);
		}
	}

}
