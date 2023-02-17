package Aula11;

public class Visitante extends Pessoa{

	public String toString() {
		return String.format("Nome: %s\nIdade: %d\nSexo: %c\n",getNome(),getIdade(),getSexo());
	}
}
