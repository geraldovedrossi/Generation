/*
Faça um programa que receba três inteiros e diga qual deles é o maior.
*/

package familia44_2;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int num1, num2, num3, maior=0;
		
		System.out.println("Entre com o número 1:");
		num1 = leia.nextInt();
		System.out.println("Entre com o número 2:");
		num2 = leia.nextInt();
		System.out.println("Entre com o número 3:");
		num3 = leia.nextInt();
		
		if (num1 > maior) {
			maior = num1;
		}
		if (num2 > maior) {
			maior = num2;
		}
		if (num3 > maior) {
			maior = num3;
		}
		
		System.out.println("O maior número digitado foi: "+maior);

	}

}
