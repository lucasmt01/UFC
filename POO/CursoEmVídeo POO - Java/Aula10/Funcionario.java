package Aula10;

public class Funcionario extends Pessoa{
	
	private String setor;
	private boolean trabalhando;
	
	public void mudarTrabalho() {
		this.trabalhando =! this.trabalhando; 
		if(this.trabalhando == false) {
			setSetor(null);
		}
		System.out.println("Situacao de trabalho alterada");
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public boolean getTrabalhando() {
		return trabalhando;
	}

	public void setTrabalhando(boolean trabalhando) {
		this.trabalhando = trabalhando;
	}

	public Funcionario(String setor, boolean trabalhando) {
		super();
		this.setor = setor;
		this.trabalhando = trabalhando;
	}
	public String toString() {
		return String.format("Nome: %s\nIdade: %d\nSexo: %c\nSetor: %s\nTrabalhando: %b\n",getNome(),getIdade(),getSexo(),this.setor,this.trabalhando);
	}
}
