/*
Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba 
se este n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada 
do mesmo; se for �mpar exiba o n�mero elevado ao quadrado.
 */

package familia44_2;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		double num;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe um n�mero:");
		num = leia.nextDouble();
		
		if(num%2 == 0) {
			
			System.out.println(num+" � um n�mero par");
			num = Math.sqrt(num);
			System.out.println("\nSua ra�z quadrada �: "+num);
		} else {
			
			System.out.println(num+" � um n�mero impar");
			num = Math.pow(num, 2);
			System.out.println("\nSua pot�ncia ao quadrado �: "+num);
		}

	}

}
