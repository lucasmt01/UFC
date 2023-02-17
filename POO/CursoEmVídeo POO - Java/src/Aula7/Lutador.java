package Aula7;

public class Lutador implements inter{

	private String nome;
	private String nacionalidade;
	private int idade;
	private float peso;
	private float altura;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;
	
	public void apresentar() {
		System.out.println("Lutador: "+getNome());
		System.out.println("Nacionalidade: "+getNacionalidade());
		System.out.println("Idade: "+getIdade());
		System.out.println("Peso: "+getPeso());
		System.out.println("Altura: "+getAltura());
		System.out.println("Categoria: "+getCategoria());
		System.out.println("Vitórias: "+getVitorias());
		System.out.println("Derrotas: "+getDerrotas());
		System.out.println("Empates: "+getEmpates());
		System.out.println();
	}
	
	public void ganharLuta() {
		this.vitorias+=1;	
	}
	
	public void perderLuta() {
		this.derrotas+=1;
	
	}
	
	public void empatarLuta() {
		this.empates+=1;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
		this.setCategoria();
	}

	public String getCategoria() {
		return categoria;
	}

	private void setCategoria() {
		if(this.peso < 52.2) {
			this.categoria = "Inválido";
		}
		else if(this.peso <= 70.3) {
			this.categoria = "Leve";
		}
		else if(this.peso <= 83.9) {
			this.categoria = "Médio";
		}
		else if(this.peso <= 120.2) {
			this.categoria = "Pesado";
		}
		else {
			this.categoria = "Inválido";
		}
	}

	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias+= 1;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int derrotas) {
		this.derrotas+= 1;
	}

	public int getEmpates() {
		return empates;
	}

	public void setEmpates(int empates) {
		this.empates+= 1;
	}

	 Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
		super();
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.altura = altura;
		this.setPeso(peso);
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.empates = empates;
	}
	
}
