/*
2- Faça um programa que receba 6 números inteiros e mostre: 
Os números pares digitados;  
A soma dos números pares digitados; 
Os números ímpares digitados; 
A quantidade de números ímpares digitados.

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
		
		System.out.print("Os números pares são: ");
		for(int i=0;i<6;i++) {
			
			if(vetor[i]%2 == 0) {
				System.out.print(vetor[i]+", ");
			}
		}
		
		System.out.println("\nA soma dos números pares é de: "+somaPar);
		System.out.print("Os números ímpares são: ");
		for(int i=0;i<6;i++) {
			
			if(vetor[i]%2 != 0) {
				System.out.print(vetor[i]+", ");
			}
		}
		System.out.print("\nA quantidade de números ímpares foi de: "+somaImp);

	}

}
