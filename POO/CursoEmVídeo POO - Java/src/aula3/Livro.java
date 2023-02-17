package aula3;

public class Livro {

	String nome;
	String autor;
	String editora;
	int paginas;
	int ano;
	boolean estado;
	
	void OpenClose() {
		if(this.estado == false) {
			this.estado = true;
			System.out.println("O livro agora está aberto");
		}
		else {
			this.estado = false;
			System.out.println("O livro agora está fechado");
		}
	}
	void estudar() {
		if(this.estado == false) {
			System.out.println("Impossível estudar, livro fechado");
		}
		else {
			System.out.println("Estudando...");
		}
	}
	public String toString() {
		return "Nome: "+this.nome+ "\nAutor: "+this.autor+"\nEditora: "+this.editora+"\nPaginas: "+this.paginas+"\nAno: "+this.ano+"\nEstado: "+this.estado;
	}
}
