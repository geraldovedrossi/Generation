/*
3- Solicitar a idade de v�rias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)
 */

package familia44_2;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade, total50=0, total21=0;
		
		System.out.println("Informe uma idade:");
		idade = leia.nextInt();
		
		while(idade != -99) {
			
			if(idade > 50) {
				total50++;
			} else if(idade<21) {
				total21++;
			}
			
			System.out.println("Informe uma idade:");
			idade = leia.nextInt();
		}
		
		System.out.println("O n�medo de pessoas acima dos 50 anos foi de: "+total50
				+ " \nE o n�mero de pessoas abaixo de 21 anos foi de: "+total21);

	}

}
