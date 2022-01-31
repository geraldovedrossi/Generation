package familia44_4;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String modelo;
		int assentos;
		int taVoanu;
		
		System.out.println("Informe o modelo do avião: ");
		modelo = leia.next();
		System.out.println("Informe a quantidade de assentos: ");
		assentos = leia.nextInt();
		
		do 
		{
		System.out.println("Informe se o aviao ta voando \n1-Sim\t2-Não");
		taVoanu = leia.nextInt();
			
		switch(taVoanu){
			case 1:
				break;
			case 2:
				break;
			default:
				System.out.println("Insira uma opção válida");
				break;
		}
		} while(taVoanu != 1 && taVoanu != 2);
		
		
		Aviao2 aviao = new Aviao2(modelo, assentos, taVoanu);
		
		aviao.infoAviao();

}
	
}
