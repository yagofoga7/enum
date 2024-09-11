package GettersSetters;

public class Lobo extends Animal {
	
	public Lobo(String nome, String raca, String sexo) {
		super(nome, raca, sexo);
	}
	
	@Override
	public void dormir() {
		System.out.println("O Lobo esta dormindo");
	}
	
	@Override
	public void caminhar() {
		System.out.println("O Lobo esta caminhar");
	}
	
	@Override
	public void correr() {
		System.out.println("O Lobo esta corrrendo");

}
	
	@Override
	public void emitirSom() {
		System.out.println("O Lobo esta ligando");
  }
}


