package familia44_5;

public class CavaloAbs extends ClasseAbs {

	public CavaloAbs() { // declarando metodo construtor

		super("Cavalo");// importando da classe abstrata
	}

	@Override
	public void som(double quantidade) { // m�todo abstrato da m�e abstrata

		for (int i = 0; i < quantidade; i++) {
			System.out.println("O " + getEspecie() + " faz Iiiiirrrr�!!!\n");
		}
	}

}
