package Aula11;

public class Aluno extends Pessoa{

	private int matricula;
	private String curso;
	
	public void pagarMensalidade() {
		System.out.println("Mensalidade de "+this.getNome()+" paga\n");
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public Aluno(int matricula, String curso) {
		super();
		this.matricula = matricula;
		this.curso = curso;
	}
	public String toString() {
		return String.format("Nome: %s\nIdade: %d\nSexo: %c\nMatricula: %d\nCurso: %s\n",getNome(),getIdade(),getSexo(),this.matricula,this.curso);
	}
}
