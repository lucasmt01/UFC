package Aula7;

public class main {

	public static void main(String[] args) {
		
		Lutador[] L = new Lutador [6];
		Lutas luta = new Lutas();
		
		L[0] = new Lutador("Lucas","Brasileiro",19,1.85f,68.9f,10,0,2);
		L[1] = new Lutador("Marcos","Brasileiro",19,1.85f,68.9f,10,0,2);

		L[0].apresentar();
		L[1].apresentar();

		luta.marcarLuta(L[0],L[1]);
		luta.lutar();
		L[0].apresentar();
		L[1].apresentar();
	}
}
