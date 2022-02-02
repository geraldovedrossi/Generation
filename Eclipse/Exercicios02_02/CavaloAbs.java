package familia44_5;

public class CavaloAbs extends ClasseAbs {

	public CavaloAbs() { // declarando metodo construtor

		super("Cavalo");// importando da classe abstrata
	}

	@Override
	public void som(double quantidade) { // método abstrato da mãe abstrata

		for (int i = 0; i < quantidade; i++) {
			System.out.println("O " + getEspecie() + " faz Iiiiirrrrí!!!\n");
		}
	}

}
