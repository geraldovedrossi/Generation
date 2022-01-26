/*3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica
expressa em segundos e mostre-o expresso em horas, minutos e segundos.
*/

package familia44;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		int totalSeg, seg, min, hora;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Quantos segundos durou o evento?");
		totalSeg = leia.nextInt();
		//4550
		hora = totalSeg / 3600; //1 hora %950s
		min = (totalSeg%3600) / 60; // 15 min e %50s
		seg = (totalSeg%3600) % 60; // 50s
		
		System.out.println("O evento durou "+hora+" horas, "+min+" minutos e "+seg+" segundos!");

	}

}
