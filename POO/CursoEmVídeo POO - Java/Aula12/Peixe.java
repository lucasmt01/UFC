package Aula12;

public class Peixe extends Animal{

	private String corEscamas;
	
	public void locomover() {
		System.out.println("Nadando...\n");
	}

	
	public void alimentar() {
		System.out.println("Comendo substâncias...");
	}

	public void emitirSom() {
		System.out.println("Som de Peixe");
	}
	
	public void soltarBolha() {
		System.out.println("Soltando Bolha");
	}

	public String getCorEscamas() {
		return corEscamas;
	}

	public void setCorEscamas(String corEscamas) {
		this.corEscamas = corEscamas;
	}
	
	public Peixe(String corEscamas) {
		super();
		this.corEscamas = corEscamas;
	}

	public String toString() {
		return String.format("Especie: %s\nPeso: %.2f\nIdade: %d\nMembros: %d\nCor das Escamas: %s",getEspecie(),getPeso(),getIdade(),getMembros(),this.corEscamas);
	}
}
