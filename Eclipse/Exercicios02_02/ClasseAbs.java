/*
Implemente um programa que crie os 3 tipos de animais definidos
no exerc�cio anterior e invoque o m�todo que emite o som de cada
um de forma polim�rfica, isto �, independente do tipo de animal.
*/

package familia44_5;

public abstract class ClasseAbs { // declaro class abs

	private String especie; // declarando atributo

	public ClasseAbs(String especie) { // declarando metodo construtor
		this.especie = especie;
	}

	abstract public void som(double quantidade);// declarando metodo abstrato=� um contrato para a filha seguir

	public String getEspecie() { // declarando getters
		return especie;
	}

	public void setEspecie(String especie) { // declarando setters
		this.especie = especie;
	}

}
