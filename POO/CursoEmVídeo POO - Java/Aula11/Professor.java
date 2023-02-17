package Aula11;

public class Professor extends Pessoa{
	private float salario;
	private String especialidade;	
	
	public float getSalario() {
		return salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
	public Professor(float salario, String especialidade) {
		super();
		this.salario = salario;
		this.especialidade = especialidade;
	}
	
	public String toString() {
		return String.format("Nome: %s\nIdade: %d\nSexo: %c\nSalario: %.2f\nEspecialidade: %s\n",getNome(),getIdade(),getSexo(),this.salario,this.especialidade);
	}
	
}
