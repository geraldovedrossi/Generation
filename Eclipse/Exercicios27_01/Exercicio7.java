/*
2- Ler 5 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
 */

package familia44_2;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int num, contImp=0, contPar=0;
		
		for(int i=1; i<6; i++) {
			System.out.println("Informe um n�mero:");
			num = leia.nextInt();
			
			if(num%2 != 0) {
				contImp++;
			} else {
				contPar++;
			}
			
		}
		
		System.out.println(contImp+" n�meros s�o �mpares e "+contPar+" n�meros s�o pares.");
		
		
	}
}


