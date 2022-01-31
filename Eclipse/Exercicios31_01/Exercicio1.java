package familia44_4;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		//instanciando o objeto cliente
		Cliente1 cliente = new Cliente1();
		
		System.out.println("Entre com seu nome: ");
		String nome = leia.next();
		cliente.setNomeCliente(nome);
		
		System.out.println("Entre com seu saldo: ");
		int saldo = leia.nextInt();
		cliente.setSaldoCliente(saldo);
		
		cliente.verCarrinho();
		cliente.verSaldo();
		cliente.depositar();
		cliente.addCarrinho();
		cliente.verCarrinho();
		cliente.verSaldo();
		cliente.finalizarCompra();
	}

}
