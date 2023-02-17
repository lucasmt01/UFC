package aula3;

public class Caneta {

	public String modelo;
	public String cor;
	private float ponta;
	protected double carga;
	private boolean tampada;
	
	public void rabiscar() {
		if(this.tampada == true) {
			System.out.println("Caneta tampada");
		}
		else {
			System.out.println("rabiscando");
		}
	}
	
	protected void tampar() {
		if(this.tampada == false ) {
			this.tampada = true;
			System.out.println("A caneta agora está tampada");
		}
		else {
			System.out.println("A caneta já estava tampada");
		}
	}
	protected void destampar() {
		if(this.tampada == true ) {
			this.tampada = false;
			System.out.println("A caneta agora está destampada");
		}
		else {
			System.out.println("A caneta já estava destampada");
		}
	}
	
	void status() {
		System.out.printf("");
	}
	
	public String toString() {
		return "Modelo: "+this.modelo+ "\nCor: "+this.cor+"\nPonta: "+this.ponta+"\nCarga: "+this.carga+"\nTampada: "+this.tampada;
	}
}
