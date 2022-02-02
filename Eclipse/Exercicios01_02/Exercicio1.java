package familia44_5;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Cachorro dog1 = new Cachorro("Pipoca", 14, true, "anda", "poodle.");
		Cavalo cav = new Cavalo("Spirit o Corcel Indomável", 20, true, "galopa", "caramelo.");
		Preguica pre = new Preguica("Soneca", 30, false, "dorme", "cinza rajado.");
		
//public Cachorro(String nomeAnimal, int idadeAnimal, boolean emiteSom, String deslocamento, String racaCachorro)

		dog1.infoCachorro();
		System.out.println();
		cav.infoCavalo();
		System.out.println();
		pre.infoPreguica();
	}

}
