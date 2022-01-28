package familia44_3;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in); //acrescenta o leia com função Scanner

		int [][] matriz = new int [2][2]; // criando minha matriz 
		
		//entrando com o valor
		
		for(int y=0; y<2;y++) { //salvando os valores digitados na minha matriz
			for(int x=0;x<2;x++) {
				System.out.println("Informe um valor: ");
				matriz[x][y] = leia.nextInt();
			}
		}
		System.out.println("\n");
		
		
		
		//mostrando a matriz salva

		for(int y=0; y<2;y++) {
			for(int x=0;x<2;x++) {
				System.out.print("["+matriz[x][y]+"] ");
			}
			System.out.print("\n");
		}
		System.out.print("\n");
		
		
		
		//mostrando a matriz x 2
		
		for(int y=0; y<2;y++) {
			for(int x=0;x<2;x++) {
				System.out.print("["+(matriz[x][y])*2+"] ");
			}
			System.out.print("\n");
		}
		
	}

}
