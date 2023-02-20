package Projeto;

public class Video implements AcoesVideos{
	
	private String titulo;
	private float avaliação;
	private int views;
	private int curtidas;
	private boolean reproduzindo;
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public float getAvaliação() {
		return avaliação;
	}
	
	public void setAvaliação(int avaliação) {
		float media = 0;
		media = (this.avaliação + avaliação) / 2;
		this.avaliação = media; 
	}
	
	public int getViews() {
		return views;
	}
	
	public void setViews(int views) {
		this.views = views;
	}
	
	public int getCurtidas() {
		return curtidas;
	}
	
	public void setCurtidas(int curtidas) {
		this.curtidas = curtidas;
	}
	
	public boolean getReproduzindo() {
		return reproduzindo;
	}
	
	public void setReproduzindo(boolean reproduzindo) {
		this.reproduzindo = reproduzindo;
	}
	
	public Video(String titulo) {
		super();
		this.titulo = titulo;
		this.avaliação = 0;
		this.views = 0;
		this.curtidas = 0;
		this.reproduzindo = false;
	}
	
	@Override
	public void play() {
		setReproduzindo(true);
		System.out.println("Video Reproduzindo");
	}
	
	@Override
	public void pause() {
		setReproduzindo(false);
		System.out.println("Video Pausado");
	}
	
	@Override
	public void like() {
		this.curtidas+=1;
		System.out.println("Voce deu mais um like!");
	}
	
	@Override
	public String toString() {
		return String.format("Titulo: %s\nAvaliacao: %f\nViews: %d\nCurtidas: %d\nReproduzindo: %b\n",getTitulo(),getAvaliação(),getViews(),getCurtidas(),getReproduzindo());
	}
}
