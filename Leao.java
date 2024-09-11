package GettersSetters;

public class Leao extends Animal{
	
	public Leao(String nome, String raca, String sexo) {
		super(nome, raca, sexo);
	}
	
	@Override
	public void dormir() {
		System.out.println("O Leao esta dormindo");
	}
	
	@Override
	public void caminhar() {
		System.out.println("O Leao esta caminhar");
	}
	
	@Override
	public void correr() {
		System.out.println("O Leao esta corrrendo");

}
	
	@Override
	public void emitirSom() {
		System.out.println("O Leao esta ligando");
  }
}

