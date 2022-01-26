/*Construa um programa em c que, tendo como dados de entrada dois pontos
quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a dist�ncia entre eles. A f�rmula
que efetua tal c�lculo �: D = v(x2-x1)�+(y2-y1)�
*/

package familia44;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		double x1, y1, x2, y2, dist;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com o valor de Px1:");
		x1 = leia.nextDouble();
		System.out.println("Entre com o valor de Py1:");
		y1 = leia.nextDouble();
		System.out.println("Entre com o valor de Px2:");
		x2 = leia.nextDouble();
		System.out.println("Entre com o valor de Py2:");
		y2 = leia.nextDouble();
		
		dist = Math.sqrt((Math.pow((x2-x1),2))+(Math.pow((y2-y1),2)));
		
		System.out.println("A dist�ncia entre os dois pontos � de: "+dist);
	}

}
