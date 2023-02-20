package Projeto;

public class main {

	public static void main(String[] args) {

		Video v[] = new Video[3];
		Gafanhoto g[] = new Gafanhoto[3];		
		v[0] = new Video("Poo");
		g[0] = new Gafanhoto("Lucas",19,'M',"lucas123");
		Visualizacao vi = new Visualizacao(g[0],v[0]);

		System.out.println(vi);
		vi.avaliar(50f);
		vi.avaliar(100f);

		System.out.println(vi);
	}

}
