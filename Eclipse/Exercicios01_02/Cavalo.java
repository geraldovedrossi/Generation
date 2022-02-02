package familia44_5;

	public class Cavalo extends Animal{//1-Criando SubClasse
		
		private String corCavalo;//2-Criando Atributos
		
	//3-Criando M�todo Construtor com Heran�as
		public Cavalo(String nomeAnimal, int idadeAnimal, boolean emiteSom, String deslocamento, String corCavalo) 
		{
			
			super(nomeAnimal, idadeAnimal, emiteSom, deslocamento);
			this.corCavalo = corCavalo;
		}
	//4-Criando metodo simples
		public void infoCavalo() {
			System.out.print(getNomeAnimal()+" � um cavalo que tem "+getIdadeAnimal()+" anos, ");
			if(isEmiteSom()) {
				System.out.print("emite um relincho");
			} else {
				System.out.print("n�o emite som");
			}
			System.out.println(", "+getDeslocamento()+" o tempo todo e � da cor "+corCavalo);
		}
		
	//5-Criando Getters and Setters
		public String getCorCavalo() {
			return corCavalo;
		}
		public void setCorCavalo(String corCavalo) {
			this.corCavalo = corCavalo;
		}
		
}
