/* 5. Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste
aluno. Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5,
respectivamente.
 */

package familia44;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
	
		double nota1, nota2, nota3, media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com a nota1:");
		nota1 = leia.nextDouble();
		System.out.println("Entre com a nota2:");
		nota2 = leia.nextDouble();
		System.out.println("Entre com a nota3:");
		nota3 = leia.nextDouble();
		
		media = ((nota1*2)+(nota2*3)+(nota3*5)) / 10;
		//        5*2=10 + 7*3=21  + 5*5=25    /  10
		//         56/10 = 5.6
		
		System.out.println("A m�dia ponderada das notas � de: "+media);
	}

}
