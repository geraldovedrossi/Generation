/*
1) Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.
 */

package familia44_4;

import java.util.Scanner;

public class Cliente1 {
	
	Scanner leia = new Scanner(System.in);

	// definindo os atributos
	private String nomeCliente;
	private int contaCliente;
	private double saldoCliente;
	private double carrinhoCliente;
	
	//definindo metodo especial construtor do objeto
	public Cliente1 () {
	}

	
	//métodos simples: verCarrinho, ver Saldo, depositar, addCarrinho, finalizarCompra
	public void verCarrinho() {
		System.out.println("Seu carrinho atualmente está em: "+ carrinhoCliente);
	}
	
	public void verSaldo() {
		System.out.println("Seu saldo atualmente está em: "+ saldoCliente);
	}
	
	public void depositar() {
		System.out.println("Insira o valor que deseja depositar: ");
		saldoCliente += leia.nextDouble();
	}
	
	public void addCarrinho() {
		System.out.println("Insira o valor do produto: ");
		carrinhoCliente += leia.nextDouble();
	}
	
	public void finalizarCompra() {
		System.out.println("Compra realizada no valor de: "+carrinhoCliente);
		saldoCliente -= carrinhoCliente;
		carrinhoCliente = 0;
		System.out.println("Seu saldo atual é de: "+saldoCliente);

	}
	
	
	//get set
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public int getContaCliente() {
		return contaCliente;
	}
	public void setContaCliente(int contaCliente) {
		this.contaCliente = contaCliente;
	}
	public double getSaldoCliente() {
		return saldoCliente;
	}
	public void setSaldoCliente(double saldoCliente) {
		this.saldoCliente = saldoCliente;
	}
	public double getCarrinhoCliente() {
		return carrinhoCliente;
	}
	public void setCarrinhoCliente(double carrinhoCliente) {
		this.carrinhoCliente = carrinhoCliente;
	}
	
	
}
