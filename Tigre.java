package GettersSetters;

public class Tigre extends Animal {
	
	public Tigre(String nome, String raca, String sexo) {
		super(nome, raca, sexo);
	}
	
	@Override
	public void dormir() {
		System.out.println("O Tigre esta dormindo");
	}
	
	@Override
	public void caminhar() {
		System.out.println("O Tigre esta caminhar");
	}
	
	@Override
	public void correr() {
		System.out.println("O Tigre esta corrrendo");

}
	
	@Override
	public void emitirSom() {
		System.out.println("O Tigre esta ligando");
  }
}
