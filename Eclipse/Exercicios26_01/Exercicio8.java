/*
O custo ao consumidor de um carro novo é a soma do custo de fábrica com a   custo = custoFabrica+PercentagemD+impostos
percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao
consumidor.
 */

package familia44;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {

		double custoFab, custoConsu;

		Scanner leia = new Scanner(System.in);
		
		System.out.println("Qual o custo de fábrica?");
		custoFab = leia.nextDouble();
		
		custoConsu = custoFab + (custoFab*0.28) + (custoFab*0.45);
		//              50000          14000           22500 = 86500
		
		System.out.println("O custo de consumidor é de: R$"+custoConsu);

	}

}
