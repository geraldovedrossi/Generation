/*
Faça um programa em que permita a entrada de um número qualquer e exiba 
se este número é par ou ímpar. Se for par exiba também a raiz quadrada 
do mesmo; se for ímpar exiba o número elevado ao quadrado.
 */

package familia44_2;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		double num;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe um número:");
		num = leia.nextDouble();
		
		if(num%2 == 0) {
			
			System.out.println(num+" É um número par");
			num = Math.sqrt(num);
			System.out.println("\nSua raíz quadrada é: "+num);
		} else {
			
			System.out.println(num+" É um número impar");
			num = Math.pow(num, 2);
			System.out.println("\nSua potência ao quadrado é: "+num);
		}

	}

}
