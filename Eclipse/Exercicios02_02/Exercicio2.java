package familia44_5;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		CachorroAbs dog = new CachorroAbs();
		CavaloAbs cav = new CavaloAbs();
		
		ClasseAbs animais = null;
		
		int opc;
		
		do {
			
			System.out.println("Escolha um animal:\n1-Cachorro\n2-Cavalo");
			opc = leia.nextInt();
			switch(opc) {
			case 1: animais = dog; break;
			case 2: animais = cav; break;
			default: System.out.println("Opção inválida!");
			}
			
			if(animais != null)
			{
				animais.som((Math.random() * 3.0));
			}
			 
			}while (opc < 3 || opc > 1);
	
	}
}
