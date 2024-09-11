package GettersSetters;

public class Principal {

	public static void main(String[] args) {
		Lobo lobo = new Lobo ("Jorge","Guará","Masculino");
		lobo.dormir();
		lobo.caminhar();
		lobo.correr();
		lobo.emitirSom();

		System.out.println("------------------------------------");

		Leao leao = new Leao ("Jeremy","Africano","Masculino");
		leao.dormir();
		leao.caminhar();
		leao.correr();
		leao.emitirSom();

		System.out.println("------------------------------------");

		Tigre tigre = new Tigre("Samhantha","Siberiano","Feminino");
		tigre.dormir();
		tigre.caminhar();
		tigre.correr();
		tigre.emitirSom();

		System.out.println("------------------------------------");

		Cachorro cachorro = new Cachorro("Kikinho","Buldogue","Masculino");
		cachorro.dormir();
		cachorro.caminhar();
		cachorro.correr();
		cachorro.emitirSom();

		System.out.println("------------------------------------");

		Gato gato = new Gato ("Miau","Siamês","Feminino");
		gato.dormir();
		gato.caminhar();
		gato.correr();
		gato.emitirSom();
	}

}
