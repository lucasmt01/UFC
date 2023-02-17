package Aula12;

public class Reptil extends Animal{

	private String corEscamas;
	
	public void locomover() {
		System.out.println("Rastejando...\n");
	}

	public void alimentar() {
		System.out.println("Comendo animais pequenos...");
	}
	
	public void emitirSom() {
		System.out.println("Som de réptil...");
	}

	public String getCorEscamas() {
		return corEscamas;
	}

	public void setCorEscamas(String corEscamas) {
		this.corEscamas = corEscamas;
	}

	public Reptil(String corEscamas) {
		super();
		this.corEscamas = corEscamas;
	}

	public String toString() {
		return String.format("Especie: %s\nPeso: %.2f\nIdade: %d\nMembros: %d\nCor das Escamas: %s",getEspecie(),getPeso(),getIdade(),getMembros(),this.corEscamas);
	}
	
}
