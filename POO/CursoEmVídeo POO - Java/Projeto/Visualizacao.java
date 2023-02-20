package Projeto;

public class Visualizacao {

	private Gafanhoto espectador;
	private Video filme;
	
	public Gafanhoto getEspectador() {
		return espectador;
	}
	
	public void setEspectador(Gafanhoto espectador) {
		this.espectador = espectador;
	}
	
	public Video getFilme() {
		return filme;
	}
	
	public void setFilme(Video filme) {
		this.filme = filme;
	}

	public Visualizacao(Gafanhoto espectador, Video filme) {
		super();
		this.espectador = espectador;
		this.filme = filme;
		this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);
		this.filme.setViews(this.filme.getViews() + 1);
	}

	@Override
	public String toString() {
		return String.format("Espectador:\n%s\nFilme:\n%s",this.espectador,this.filme);
	}
	
	public void avaliar() {
		this.filme.setAvaliação(5);
	}
	
	public void avaliar(int nota) {
		if (nota < 0 || nota > 10) {
			System.out.println("Nota informada invalida");
			return;
		}
		this.filme.setAvaliação(nota);
	}
	
	public void avaliar(float porc) {
		int aux = 0;
		if (porc <= 20) {
			aux = 3;
		}
		else if (porc <= 50) {
			aux = 5;
		}
		else if (porc <= 80) {
			aux = 8;
		}
		else {
			aux = 10;
		}
		this.filme.setAvaliação(aux);
	}
}
