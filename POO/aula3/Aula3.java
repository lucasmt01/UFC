package aula3;

public class Aula3 {
	public static void main(String[] args) {

	Caneta c1 = new Caneta();

	c1.modelo = "BIC";
	c1.cor  = "Azul";
	//c1.ponta = 0.5f;
	c1.carga = 80;
	//c1.tampada = false;
	c1.destampar();
	System.out.println(c1);
	c1.rabiscar();

	}

}
