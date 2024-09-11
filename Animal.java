package GettersSetters;

public abstract class Animal {
	
	private String nome;
	private String raca;
	private String sexo;
	
	public Animal(String nome, String raca, String sexo) {
	    this.nome = nome;
	    this.raca = raca;
	    this.sexo = sexo;
}    

//Gerar Getters e Setters
 public abstract void dormir();

 public abstract void caminhar();

 public abstract void correr();

 public abstract void emitirSom();
 
}
	


