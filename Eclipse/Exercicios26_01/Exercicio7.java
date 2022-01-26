/*
7. Um sistema de equações lineares do tipo: ax + by = c   dx+ey=f   x=ce-bf/ae-bd  y=af-cd/ae-bd

Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os
valores de x e y.
 */

package familia44;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		double a, b, c, d, e, f, x, y;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com o valor de a:");
		a = leia.nextDouble();
		System.out.println("Entre com o valor de b:");
		b = leia.nextDouble();
		System.out.println("Entre com o valor de c:");
		c = leia.nextDouble();
		System.out.println("Entre com o valor de d:");
		d = leia.nextDouble();
		System.out.println("Entre com o valor de e:");
		e = leia.nextDouble();
		System.out.println("Entre com o valor de f:");
		f = leia.nextDouble();
		
		//  x=ce-bf/ae-bd  y=af-cd/ae-bd
		// a2 b3 c4 d5 e2 f3
		
		x = (c*e-b*f)/(a*e-b*d);    //4*2-3*3 / 2*2 - 3*5
									// -1 / -11 = 0.0909090
		y = (a*f-c*d)/(a*e-b*d);
		
		System.out.println("O valor de x é: "+x+"\nO valor de y é: "+y);
	}

}
