/*
Fa�a um programa que mostre um Menu com op��es de um card�pio de restaurante para uma pessoa. A pessoa vai escolher o prato desejado: 

Ap�s escolher o prato, o programa dever� fazer uma pergunta ao usu�rio, se ele aceita pagar a gorjeta do gar�om 10% sobre o valor do 
prato. Se o usu�rio aceitar, mostrar o valor final (valor do prato + 10%), caso contr�rio, mostrar o valor final (somente o valor do prato).
Codigo		 Prato		 	Valor 
1 		Picanha 		25,00 
2 		Lasanha 		20,00 
3 		Strogonoff 		18,00 
4 		Bife Acebolado 	15,00 
5 		P�o com ovo 		5,00 

(usar o la�o condicional switch...case).

 */

package familia44_2;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		int prato;
		double gorjeta;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Codigo\tPrato\t\tValor\n");
		System.out.println("1\tPicanha\t\t25,00\n");
		System.out.println("2\tLasanha\t\t20,00\n");
		System.out.println("3\tStrogonoff\t18,00\n");
		System.out.println("4\tBife Acebolado\t15,00\n");
		System.out.println("5\tP�o com ovo\t5,00\n");
		
		System.out.println("Informe o prato desejado:");
		prato = leia.nextInt();
		
		switch(prato) {
		case 1:
			System.out.println("Deseja pagar gorjeta?\n1-Sim\t2-N�o");
			gorjeta = leia.nextDouble();
			if(gorjeta == 1) {
				System.out.println("O valor total da compra foi de: R$"+(25*1.1));
			} else {
				System.out.println("O valor total da compra foi de: R$"+25);
			}
			break;
		case 2:
			System.out.println("Deseja pagar gorjeta?\n1-Sim\t2-N�o");
			gorjeta = leia.nextDouble();
			if(gorjeta == 1) {
				System.out.println("O valor total da compra foi de: R$"+(20*1.1));
			} else {
				System.out.println("O valor total da compra foi de: R$"+20);
			}
			break;
		case 3:
			System.out.println("Deseja pagar gorjeta?\n1-Sim\t2-N�o");
			gorjeta = leia.nextDouble();
			if(gorjeta == 1) {
				System.out.println("O valor total da compra foi de: R$"+(18*1.1));
			} else {
				System.out.println("O valor total da compra foi de: R$"+18);
			}
			break;
		case 4:
			System.out.println("Deseja pagar gorjeta?\n1-Sim\t2-N�o");
			gorjeta = leia.nextDouble();
			if(gorjeta == 1) {
				System.out.println("O valor total da compra foi de: R$"+(15*1.1));
			} else {
				System.out.println("O valor total da compra foi de: R$"+15);
			}
			break;
		case 5:
			System.out.println("Deseja pagar gorjeta?\n1-Sim\t2-N�o");
			gorjeta = leia.nextDouble();
			if(gorjeta == 1) {
				System.out.println("O valor total da compra foi de: R$"+(5*1.1));
			} else {
				System.out.println("O valor total da compra foi de: R$"+5);
			}
			break;
			default:
				
		}

	}

}
