/*
O custo ao consumidor de um carro novo � a soma do custo de f�brica com a   custo = custoFabrica+PercentagemD+impostos
percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica).
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao
consumidor.
 */

package familia44;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {

		double custoFab, custoConsu;

		Scanner leia = new Scanner(System.in);
		
		System.out.println("Qual o custo de f�brica?");
		custoFab = leia.nextDouble();
		
		custoConsu = custoFab + (custoFab*0.28) + (custoFab*0.45);
		//              50000          14000           22500 = 86500
		
		System.out.println("O custo de consumidor � de: R$"+custoConsu);

	}

}
