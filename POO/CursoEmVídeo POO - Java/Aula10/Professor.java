package Aula10;

public class Professor extends Pessoa{
	private String especialidade;
	private float salario;
	
	public void receberAum(float aumento) {
		this.salario+=aumento;
		System.out.println("Aumento recebido");
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public Professor(String especialidade, float salario) {
		super();
		this.especialidade = especialidade;
		this.salario = salario;
	}
	public String toString() {
		return String.format("Nome: %s\nIdade: %d\nSexo: %c\nEspecialidade: %s\nSalario: %.2f\n",getNome(),getIdade(),getSexo(),this.especialidade,this.salario);
	}
}
