package Projeto;

public class Gafanhoto extends Pessoa{
	
	private String login;
	private int totAssistido;
	
	public String getLogin() {
		return login;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public int getTotAssistido() {
		return totAssistido;
	}
	
	public void setTotAssistido(int totAssistido) {
		this.totAssistido = totAssistido;
	}
	
	public Gafanhoto(String nome, int idade, char sexo, String login) {
		super(nome, idade, sexo);
		this.login = login;
		this.totAssistido = 0;
	}
	
	public void viuMaisUm() {
		this.totAssistido += 1;
		System.out.println("Mais um vídeo assistido");
	}

	@Override
	public String toString() {
		return String.format("Nome: %s\nIdade: %d\nSexo: %c\nLogin: %s\nTotal Assistido: %d\n",getNome(),getIdade(),getSexo(),getLogin(),getTotAssistido());
	}
	
	
}
