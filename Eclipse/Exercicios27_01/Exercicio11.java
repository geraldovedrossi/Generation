/*
6- Escrever um programa que receba vários números inteiros no teclado. E no
final imprimir a média dos números múltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)
 */

package familia44_2;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
		int num, somaTudo=0, divisor=-1;
			  // += num    divisor++
		
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println("Informe um número:");
			num = leia.nextInt();
			
			if(num % 3 == 0) {
				somaTudo += num;
				divisor++;
			}
		} while (num != 0);
		
		System.out.println("A média dos múltiplos de 3 é de: "+ (somaTudo/divisor));

	}

}
