package aula4;

public class Caneta {

	public String modelo;
	public String cor;
	private float ponta;
	protected double carga;
	private boolean tampada;
	
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public float getPonta() {
		return ponta;
	}

	public void setPonta(float ponta) {
		this.ponta = ponta;
	}

	public double getCarga() {
		return carga;
	}

	public void setCarga(double carga) {
		this.carga = carga;
	}

	public boolean getTampada() {
		return tampada;
	}

	public void setTampada(boolean tampada) {
		this.tampada = tampada;
	}

	public Caneta(String modelo, String cor, float ponta, double carga, boolean tampada) {
		super();
		this.modelo = modelo;
		this.cor = cor;
		this.ponta = ponta;
		this.carga = carga;
		this.tampada = tampada;
	}

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
			System.out.println("\"Modelo: \"+this.getModelo()+ \"\\nCor: \"+this.cor+\"\\nPonta: \"+this.ponta+\"\\nCarga: \"+this.carga+\"\\nTampada: \"+this.tampada;        A caneta já estava destampada");
		}
	}
	
	public String toString() {
		return String.format("Modelo: %s\nCor: %s\nPonta: %2f\nCarga: %2f\nTampada: %b",this.getModelo(),this.getCor(),this.getPonta(),this.getCarga(),this.getTampada());
	}
}
