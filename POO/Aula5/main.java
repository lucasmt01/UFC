package Aula5;

public class main {

	public static void main(String[] args) {

		ContaBanco c1 = new ContaBanco(0, false);
		c1.abrirConta("CP");
		System.out.println(c1);
		c1.depositar(50);
		c1.pagarMensal();
		System.out.println(c1);
		c1.fecharConta();
		c1.sacar(180);
		c1.fecharConta();
		System.out.println(c1);

}

}
