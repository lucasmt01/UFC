package Aula11;

public class main {
	public static void main(String[] args) {

	Professor prof = new Professor(2000f,"Quimica");
	Visitante visi = new Visitante();
	Aluno alu = new Aluno(123,"CC");
	Bolsista bolsa = new Bolsista(456, "CC", 0);
	Tecnico tec = new Tecnico(789,"SI",4321);

	alu.setNome("Lucas");
	alu.setIdade(19);
	alu.setSexo('M');
	
	prof.setNome("Francisco");
	prof.setIdade(22);
	prof.setSexo('M');
	
	visi.setNome("Caio");
	visi.setIdade(24);
	visi.setSexo('M');
	
	bolsa.setNome("Bia");
	bolsa.setIdade(20);
	bolsa.setSexo('F');
	
	
	tec.setNome("Bruna");
	tec.setIdade(24);
	tec.setSexo('F');
	
	System.out.println(prof);
	
	System.out.println(visi);
	
	alu.fazerAniv();
	System.out.println(alu);
	alu.pagarMensalidade();
	
	System.out.println(bolsa);
	bolsa.renovarBolsa();
	System.out.println(bolsa);
	bolsa.pagarMensalidade();
	System.out.println(bolsa);

	System.out.println(tec);

	}
}
