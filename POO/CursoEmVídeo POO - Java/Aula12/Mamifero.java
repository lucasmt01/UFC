package Aula12;

public class Mamifero extends Animal{

	private String corPelo;

	public void locomover() {

		System.out.println("Correndo...\n");
	}

	public void alimentar() {

		System.out.println("Mamando...");
	}

	public void emitirSom() {
		System.out.println("Som de mamifero...");
	}

	public String getCorPelo() {
		return corPelo;
	}

	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}

	public Mamifero(String corPelo) {
		super();
		this.corPelo = corPelo;
	}

	public String toString() {
		return String.format("Especie: %s\nPeso: %.2f\nIdade: %d\nMembros: %d\nCor do Pelo: %s",getEspecie(),getPeso(),getIdade(),getMembros(),this.corPelo);
	}
	
	
	
}
