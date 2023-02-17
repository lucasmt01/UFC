package Aula10;

public class Aluno extends Pessoa {
	
	private int matr;
	private String curso;
	
	public void cancelarMatr() {
		setMatr(0);
		setCurso(null);
		System.out.println("Matricula de "+getNome()+" cancelada");
	}

	public int getMatr() {
		return matr;
	}

	public void setMatr(int matr) {
		this.matr = matr;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public Aluno(int matr, String curso) {
		super();
		this.matr = matr;
		this.curso = curso;
	}

	public String toString() {
		return String.format("Nome: %s\nIdade: %d\nSexo: %c\nMatricula: %d\nCurso: %s\n",this.getNome(),this.getIdade(),this.getSexo(),this.matr,this.curso);
	}


	
	
}
