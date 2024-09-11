package GettersSetters;

public class Gato extends Animal {
	
	public Gato(String nome, String raca, String sexo) {
		super(nome, raca, sexo);
	}
	
	@Override
	public void dormir() {
		System.out.println("O Gato esta dormindo");
	}
	
	@Override
	public void caminhar() {
		System.out.println("O Gato esta caminhar");
	}
	
	@Override
	public void correr() {
		System.out.println("O Gato esta corrrendo");

}
	
	@Override
	public void emitirSom() {
		System.out.println("O Gato esta ligando");
  }
}

