package familia44_7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		List<String> lista = new ArrayList<String>();
		int opc = 1;

		do {
			System.out.println("********************************************************************");
			System.out.println("\t\tSELECIONE UMA OPÇÃO");
			System.out.println("\n1-Adicionar produto.");
			System.out.println("2-Remover produto.");
			System.out.println("3-Alterar produto.");
			System.out.println("0-Encerrar programa.");
			System.out.println("********************************************************************");
			opc = leia.nextInt();

			switch (opc) {
			case 1:
				System.out.println("Digite o produto que deseja adicionar:");
				String produto;
				produto = leia.next();
				lista.add(produto);
				System.out.println(lista);
				break;
			case 2:
				System.out.println("Digite o produto que deseja remover:");
				String produtoRem = leia.next();
				
				if(lista.contains(produtoRem)) {
					lista.remove(produtoRem);
					System.out.println(lista);
				} else {
					System.out.println("Produto não encontrado!");
				}
				
				break;
			case 3:
				System.out.println("Digite o produto a se substituido:");
				produto = leia.next();
				
				if(lista.contains(produto)) {
					
					int posicao = 0;
					
					for(int i=0; i<lista.size(); i++) {
						if((lista.get(i)).equals(produto)) {
					
							System.out.println("Insira o novo produto:");
							String produtoSub = leia.next();
							posicao = i;
							lista.set(posicao, produtoSub);
							
							System.out.println(lista);
						} else {
						}
					}
					
				} else {
					System.out.println("Produto não encontrado!");
				}
				
				break;
				default:
					if(opc == 0) {
						System.out.println("Obrigado por usar o programa!");
					} else {
						System.out.println("Opção inválida!");
					}
			}
		} while (opc != 0);
		

	}

}
