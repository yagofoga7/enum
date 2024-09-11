package GettersSetters;

public class Cachorro extends Animal {
	
	public Cachorro(String nome, String raca, String sexo) {
		super(nome, raca, sexo);
	}
	
	@Override
	public void dormir() {
		System.out.println("O Cachorro esta dormindo");
	}
	
	@Override
	public void caminhar() {
		System.out.println("O Cachorro esta caminhar");
	}
	
	@Override
	public void correr() {
		System.out.println("O Cachorro esta corrrendo");

}
	
	@Override
	public void emitirSom() {
		System.out.println("O Cachorro esta ligando");
  }
}

