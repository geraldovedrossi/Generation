package familia44_5;

	public class Cachorro extends Animal{//1-Criar a SubClasse

		private String racaCachorro;//2-Criar atributos da Subclasse
		
	
	//3-Criando metodo construtor puxando da superclasse e criando da subclasse
	public Cachorro(String nomeAnimal, int idadeAnimal, boolean emiteSom, String deslocamento, String racaCachorro)
	//		cachorro("Pipoca", 14, false, "anda", "poodle")
	{
		super(nomeAnimal, idadeAnimal, emiteSom, deslocamento);
		this.racaCachorro = racaCachorro;
	}
	
	//4-Criando metodo para mostrar info do cachorro
	public void infoCachorro() {
		System.out.print(getNomeAnimal()+" é um cachorro que tem "+getIdadeAnimal()+" anos, ");
		if(isEmiteSom()) {
			System.out.print("emite um latido");
		} else {
			System.out.print("não emite som");
		}
		System.out.println(", "+getDeslocamento()+" o tempo todo e é da raça "+racaCachorro);
	}

	
	
	//5-Criando Getter & Setter
	public String getRacaCachorro() {
		return racaCachorro;
	}

	public void setRacaCachorro(String racaCachorro) {
		this.racaCachorro = racaCachorro;
	}
	
}

