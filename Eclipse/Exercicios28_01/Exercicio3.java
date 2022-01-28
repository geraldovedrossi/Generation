/*
3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.
 */

package familia44_3;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int [][] matriz = new int [3][3];
		int maior10=0;
		
		for(int y=0;y<3;y++) {
			for(int x=0;x<3;x++) {
				System.out.println("Informe um número: ");
				matriz[x][y] = leia.nextInt();
				if(matriz[x][y]>10) {
					maior10++;
				}
			}
		}
		
		System.out.println("Sua matriz possui "+maior10+" valores maiores do que 10");

	}

}
