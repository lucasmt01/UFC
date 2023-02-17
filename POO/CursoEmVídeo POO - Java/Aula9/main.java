package Aula9;

public class main {

	public static void main(String[] args) {
		Pessoa p[] = new Pessoa [2] ;
		p[0] = new Pessoa("Lucas",19,'M');
		p[1] = new Pessoa("Ana",23,'F');

		Livro li[] = new Livro [3];
		li[0] = new Livro("Harry","Rolling",100,0,false,p[0]);
		li[1] = new Livro("Potter","Stones",432,0,false,p[1]);
		li[2] = new Livro("Câmara","Júnior",50,0,false,p[0]);

		p[0].fazerAniv();
		
		System.out.println(li[0].detalhes());
		
		li[0].abrir();		
		System.out.println(li[0].detalhes());
		
		li[0].fechar();
		System.out.println(li[0].detalhes());
		
		li[1].abrir();
		System.out.println(li[1].detalhes());

		li[1].folhear(10);
		System.out.println(li[1].detalhes());
		
		li[1].avancarPag();
		System.out.println(li[1].detalhes());
		
		li[1].fechar();
		
		li[2].abrir();
		
		li[2].voltarPag();
		
		li[2].abrir();
		System.out.println(li[2].detalhes());
		
		li[2].folhear(49);
		System.out.println(li[2].detalhes());
		
		li[2].avancarPag();
		System.out.println(li[2].detalhes());
	}
}
