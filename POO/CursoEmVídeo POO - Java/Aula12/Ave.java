package Aula12;

public class Ave extends Animal{

	private String corPena;

	public void locomover() {
		System.out.println("Voando...\n");
	}

	public void alimentar() {
		System.out.println("Comendo insetos...");
	}

	public void emitirSom() {
		System.out.println("Som de ave");
	}
	
	public void fazerNinho(){
		System.out.println("Fazendo ninho...");
	}
	
	public Ave(String corPena) {
		super();
		this.corPena = corPena;
	}

	public String toString() {
		return String.format("Especie: %s\nPeso: %.2f\nIdade: %d\nMembros: %d\nCor das Penas: %s",getEspecie(),getPeso(),getIdade(),getMembros(),this.corPena);
	}
}
