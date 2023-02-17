package Aula11;

public abstract class Pessoa {

	private String nome;
	private int idade;
	private char sexo;
	 
	public final void fazerAniv() {
		this.idade++;
		System.out.println("Aniversario de" +getNome());
	 }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}	
}