/*
2- Ler 5 números e imprimir quantos são pares e quantos são ímpares. (FOR)
 */

package familia44_2;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int num, contImp=0, contPar=0;
		
		for(int i=1; i<6; i++) {
			System.out.println("Informe um número:");
			num = leia.nextInt();
			
			if(num%2 != 0) {
				contImp++;
			} else {
				contPar++;
			}
			
		}
		
		System.out.println(contImp+" números são ímpares e "+contPar+" números são pares.");
		
		
	}
}


