package familia44_4;

public class Aviao2 {
	
	// definindo os atributos
	
		private String modelo;
		public int getTaVoanu() {
			return taVoanu;
		}

		private int assentos;
		private int taVoanu;
		
		//definindo metodo especial construtor
		public Aviao2 (String modelo,int assentos,int taVoanu) {
			this.modelo = modelo;
			this.assentos = assentos;
			this.taVoanu = taVoanu;
		}
		
		//métodos simples: infoAviao
		
		public void infoAviao() {
			System.out.println("O modelo do avião é: "+modelo);
			System.out.println("Ele possui "+assentos+" assentos");
			if (taVoanu == 1) {
				System.out.println("No momento ta voanu");
			} else {
				System.out.println("Não ta voanu");
			}
		}

		public String getModelo() {
			return modelo;
		}

		public void setModelo(String modelo) {
			this.modelo = modelo;
		}

		public int getAssentos() {
			return assentos;
		}

		public void setAssentos(int assentos) {
			this.assentos = assentos;
		}

		public int isTaVoanu() {
			return taVoanu;
		}

		public void setTaVoanu(int taVoanu) {
			this.taVoanu = taVoanu;
		}
}
