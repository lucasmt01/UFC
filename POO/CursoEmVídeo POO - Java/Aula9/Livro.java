package Aula9;

public class Livro implements Publicacao {

	private String titulo;
	private String autor;
	private int totPaginas;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getTotPaginas() {
		return totPaginas;
	}
	public void setTotPaginas(int totPaginas) {
		this.totPaginas = totPaginas;
	}
	public int getPagAtual() {
		return pagAtual;
	}
	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}
	public boolean getAberto() {
		return aberto;
	}
	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}
	public Pessoa getLeitor() {
		return leitor;
	}
	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}
	
	public Livro(String titulo, String autor, int totPaginas, int pagAtual, boolean aberto, Pessoa leitor) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.totPaginas = totPaginas;
		this.pagAtual = pagAtual;
		this.aberto = aberto;
		this.leitor = leitor;
	}

	public void abrir() {
		if(this.aberto == false) {
			setAberto(true);
			setPagAtual(1);
			System.out.println("Livro aberto");
		}
		else {
			System.out.println("Livro já aberto");
		}
	}
	
	public void fechar() {
		if(this.aberto == true) {
			setAberto(false);
			setPagAtual(0);
			System.out.println("Livro fechado");
		}
		else {
			System.out.println("Fechando livro");
		}		
	}
	
	public void folhear(int pagina) {
		if(this.aberto == true && (this.pagAtual + pagina) <= this.totPaginas) {
			this.pagAtual+=pagina;
			System.out.println("Folheei "+pagina+" paginas");
		}
		else {
			System.out.println("Não foi possível folhear, fechando livro");
			fechar();
		}
	}

	public void avancarPag() {
		if(this.aberto == true && this.pagAtual < this.totPaginas) {
			this.pagAtual++;
			System.out.println("Avançando uma pagina");
		}
		else {
			System.out.println("Livro fechado");
			setAberto(false);
			setPagAtual(0);
		}
	}

	public void voltarPag() {
		if(this.aberto == true && this.pagAtual > 0) {
			this.pagAtual--;
			System.out.println("Voltando uma pagina");
		}
		else {
			System.out.println("Livro fechado");
		}
		if(getPagAtual() == 0) {
			System.out.println("Chegamos na página 0");
			fechar();
		}
	}
	public String detalhes() {
		return String.format("Título: %s\nAutor: %s\nTotal de Pag: %d\n"
				+ "Pagina Atual: %d\nAberto: %b\n\nLeitor: \n%s\n",this.titulo,this.autor,this.totPaginas,
				this.pagAtual,this.aberto,this.leitor);
	}
	
}
