/*2. Fa�a um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
expressa em anos, meses e dias.
*/

package familia44;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		int totalDia,dia,mes,ano;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("H� quantos dias voc� nasceu?");
		totalDia = leia.nextInt();
		//1010
		ano = totalDia / 365; // 2 anos 280 dias
		mes = (totalDia % 365) / 30; // 9 meses 10 dias
		dia = (totalDia % 365) % 30; // 10 dias // dia = totalDia - ano * 365 + mes * 30
		
		System.out.println("Voc� tem " + ano + " anos, " + mes + " meses e " + dia + " dias de vida!");

	}

}
