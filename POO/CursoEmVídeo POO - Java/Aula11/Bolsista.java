package Aula11;

public class Bolsista extends Aluno{

	public Bolsista(int matricula, String curso, float bolsa) {
		super(matricula, curso);
		this.bolsa = bolsa;
	}

	private float bolsa;
	
	public void renovarBolsa() {
		this.bolsa = 500;
		System.out.println("\nBolsa de "+getNome()+" com valor de R$"+getBolsa()+" renovada\n");
	}

	public void pagarMensalidade() {
		if(this.bolsa > 0) {
			System.out.println("O aluno "+getNome()+" é bolsista, mensalidade inclusa");
		}
	}
	
	public float getBolsa() {
		return bolsa;
	}

	public void setBolsa(int bolsa) {
		this.bolsa = bolsa;
	}


	
	public String toString() {
		return String.format("Nome: %s\nIdade: %d\nSexo: %c\nMatricula: %d\nCurso: %s\nBolsa: %.2f\n",getNome(),getIdade(),getSexo(),getMatricula(),getCurso(),this.bolsa);
	}
}
