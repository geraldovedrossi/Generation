/*
Fa�a um programa que receba a idade de uma pessoa e mostre na sa�da em qual categoria ela se encontra:
10-14 infantil
15-17 juvenil
18-25 adulto
 */

package familia44_2;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		int idade;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com a idade:");
		idade = leia.nextInt();
		
		if(idade <= 14 && idade >= 10) {
			System.out.println("Sua categoria �: Infantil!");
		} else if (idade <= 17 && idade >=15) {
			System.out.println("Sua categoria �: Juvenil!");
		} else if (idade <= 25 && idade >= 18) {
			System.out.println("Sua categoria �: Adulto!");
		} else {
			System.out.println("N�o existe categoria para esta idade!");
		}

	}

}
