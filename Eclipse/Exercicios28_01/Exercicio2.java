/*
2- Fa�a um programa que receba 6 n�meros inteiros e mostre: 
Os n�meros pares digitados;  
A soma dos n�meros pares digitados; 
Os n�meros �mpares digitados; 
A quantidade de n�meros �mpares digitados.

 */

package familia44_3;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int []vetor = new int [6];
		int somaImp=0, somaPar=0;
		
		for(int i=0;i<6;i++) {
			System.out.println("Informe um valor:");
			vetor[i] = leia.nextInt();
			
			if(vetor[i]%2 == 0) {
				somaPar+= vetor[i];
			} else {
				somaImp++;
			}
		}
		
		System.out.print("Os n�meros pares s�o: ");
		for(int i=0;i<6;i++) {
			
			if(vetor[i]%2 == 0) {
				System.out.print(vetor[i]+", ");
			}
		}
		
		System.out.println("\nA soma dos n�meros pares � de: "+somaPar);
		System.out.print("Os n�meros �mpares s�o: ");
		for(int i=0;i<6;i++) {
			
			if(vetor[i]%2 != 0) {
				System.out.print(vetor[i]+", ");
			}
		}
		System.out.print("\nA quantidade de n�meros �mpares foi de: "+somaImp);

	}

}
