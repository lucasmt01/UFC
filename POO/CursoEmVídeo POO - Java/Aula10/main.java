package Aula10;

public class main {

	public static void main(String[] args) {

		Aluno al = new Aluno(123,"CC");
		Funcionario func = new Funcionario("Recepcao",true);
		Professor prof = new Professor("Historia",2000f);

		al.setNome("Lucas");
		al.setIdade(19);
		al.setSexo('M');
		al.fazerAniver();
		System.out.println(al);
		al.cancelarMatr();

		func.setNome("Francisco");
		func.setIdade(22);
		func.setSexo('M');
		func.fazerAniver();
		System.out.println(func);
		func.mudarTrabalho();
		
		prof.setNome("Maria");
		prof.setIdade(18);
		prof.setSexo('F');
		prof.fazerAniver();
		System.out.println(prof);
		prof.receberAum(500f);
		
		System.out.println("-----------SITUAÇÃO FINAL-----------");
		System.out.println(al);
		System.out.println(func);
		System.out.println(prof);

		
	}

}
