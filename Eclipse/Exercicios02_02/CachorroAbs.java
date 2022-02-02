package familia44_5;

public class CachorroAbs extends ClasseAbs {

	public CachorroAbs() { // declarando metodo construtor

		super("Cachorro");// importando da classe abstrata
	}

	@Override
	public void som(double quantidade) {

		for (int i = 0; i < quantidade; i++) {
			System.out.println("O " + getEspecie() + " faz au au au au au au!!!\n");
		}
	}

}
