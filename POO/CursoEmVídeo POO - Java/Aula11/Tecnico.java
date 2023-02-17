package Aula11;

public final class Tecnico extends Aluno{

	private int registroProf;
	
	public int getRegistroProf() {
		return registroProf;
	}
	
	public void setRegistroProf(int registroProf) {
		this.registroProf = registroProf;
	}

	public void praticar() {
		
	}
	
	public Tecnico(int matricula, String curso, int registroProf) {
		super(matricula, curso);
		this.registroProf = registroProf;
	}

	public String toString() {
		return String.format("Nome: %s\nIdade: %d\nSexo: %c\nMatricula: %d\nCurso: %s\nRegistro Profissional: %d\n",getNome(),getIdade(),getSexo(),getMatricula(),getCurso(),this.registroProf);
	}
}
